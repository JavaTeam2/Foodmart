(function(){
    $(document).ready(function(){
        $(".form-cost").validate({
           rules:{
               cost: {
                   required: true,
                   number: true
               },
               cause: {
                   required: true
               }
           }
        });
    });
})();