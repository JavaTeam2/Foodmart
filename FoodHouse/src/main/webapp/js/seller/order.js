(function(){
    function OrderDetailsModel(){
        this.elementSelector = null;
        this.list_elements = [];
        this.choose =  function(elementSelector){
            this.elementSelector = elementSelector;
            return this;
        };
        this.changedEvent = function(){
            if ($(this.elementSelector) != null){
                $(this.elementSelector).html("");
                var totalPrice = 0;
                for (var i=0; i < this.list_elements.length; i++){
                    totalPrice += (this.list_elements[i])["price"] * (this.list_elements[i])["quantity"];
                    var html=""+
                        "<div class='order'>"+
                        "<input type='hidden' name='food' value='"+ (this.list_elements[i])["id"]  +"'/>"+
                        "<input type='hidden' name='food_quantity' value='"+ (this.list_elements[i])["quantity"]  +"'/>"+
                        "<div class='food-name'>"+
                        (this.list_elements[i])["name"] +
                        "</div>"+
                        "<div class='food-quantity'>"+
                        "x"+ (this.list_elements[i])["quantity"] +
                        "</div>"+
                        "<div class='food-price'>"+
                        (this.list_elements[i])["price"]*(this.list_elements[i])["quantity"] +
                        "</div>"+
                        "</input>"
                    $(this.elementSelector).append(html);
                }
                $(this.elementSelector).append("<h3>Tổng: "+totalPrice+"</h3>");
            }
        };
        this.add = function(id, quantity, name, price){
            this.list_elements.push({"id": id, "quantity": quantity, "name": name, "price": price});
            this.changedEvent();
        };
        this.update = function(id, quantity){
            var index = this.index_of(id);
            var elem = this.list_elements[index];
            if (index != -1)
                elem["quantity"] = quantity;
            this.changedEvent();
        };
        this.remove = function(id){
            var index = this.index_of(id);
            if (index != -1)
                this.list_elements.splice(index, 1);
            this.changedEvent();
        };
        this.index_of = function(id){
            for (var i =0; i < this.list_elements.length; i++){
                if (id == this.list_elements[i]["id"])
                    return i;
            }
            return -1;
        };
    }

    /* Event binding */
    $(document).ready(function(){
        var orderDetailsModel = new OrderDetailsModel();
        orderDetailsModel.choose("#uglipop_popbox .order-list");
        $("button.button-add").on("click", function() {
            uglipop({
                class: 'create-order',
                source: 'div',
                content: 'create-order'
            });
        });
        $("#uglipop_popbox").on("click", ".create-order-item .item", function(event){
            var element = event.currentTarget;
            if (!$(element).hasClass("selected")) {
                orderDetailsModel.add($(element).attr("data-id"), $(element).children("input").val(), $(element).attr("data-name"), $(element).attr("data-price"));
            }
            else
                orderDetailsModel.remove($(element).attr("data-id"));
            $(element).toggleClass("selected");
            $(element).children("input").focus();
            $(element).children("input").select();
        });
        $("#uglipop_popbox").on("keypress", ".create-order-item .item", function(event){
           if ((event.which < 49) || (event.which > 57))
               event.preventDefault();
           else{
               var element = event.currentTarget;
               orderDetailsModel.update($(element).attr("data-id"), $(element).children("input").val());
           }
        });
        $("#uglipop_popbox").on("keyup", ".create-order-item .item", function(event){
                var element = event.currentTarget;
                orderDetailsModel.update($(element).attr("data-id"), $(element).children("input").val());
        });
        $("#uglipop_popbox").on("click", ".create-order-item .item input", function(event){
            event.preventBubble();
        });

        var order_selecting = null;
        $(".dashboard .table").on("click", ".row", function(event){
            if (order_selecting!=null)
                $(order_selecting).toggleClass("selected");
            if (order_selecting != event.currentTarget) {
                order_selecting = event.currentTarget;
                $(order_selecting).toggleClass("selected");
                $(order_selecting).parents(".table").removeClass("selected");
                $(order_selecting).parents(".table").addClass("selected");
            }else{
                $(order_selecting).parents(".table").removeClass("selected");
                order_selecting = null;
            }
        });

        /* Validation setup */
        var validateSetup = function() {
            $("#uglipop_popbox form").validate({
                rules: {
                    customer_name: "required",
                    customer_phone: {
                        required: true,
                        number: true
                    },
                    customer_email: {
                        required: true,
                        email: true
                    },
                    customer_address: "required",
                    customer_city: "required",
                    customer_province: "required",
                    note: "required"
                }
            });
        };
        $("#uglipop_popbox").on("change", "form", function(){
            validateSetup();
            validateSetup = function(){};
        });
    });
})();