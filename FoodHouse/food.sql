CREATE TABLE IF NOT EXISTS `food` (
	`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` nvarchar(45) COLLATE utf8_bin NOT NULL,
    `price` double NOT NULL,
    `price_promotion` double NOT NULL,
    `kindOfFood` nvarchar(100),
    `image` varchar(500) NOT NULL,
    `description` nvarchar(1000) COLLATE utf8_bin DEFAULT NULL,
    PRIMARY KEY(`id`)
);

INSERT INTO `food` (`id`, `name`, `price`, `price_promotion`, `kindOfFood`, `image`, `description`) VALUES

-- Starters--
(1, 'Blue Cheese Salad', 15, 13, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/blue-cheese-salad-super-salads.jpg', 'Special'),
(2, 'Donec', 35, 30, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/donec.jpg', ''),
(3, 'Ens Banting', 21, 15, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/ens-banting.jpg', ''),
(4, 'Fusce', 17, 12, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/fusce.jpg', 'Special'),
(5, 'Ipsum', 24, 21, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/ipsum.jpg', ''),
(6, 'Kitchen Stuff ', 55, 43, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/kitchen-stuff-chorizo.jpg', ''),
(7, 'Lorem', 42, 40, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/lorem.jpg', ''),
(8, 'Nullam', 32, 30, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/Nullam.jpg', 'Special'),
(9, 'Spier Kitchen Stuff', 44, 38, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/spier-kitchen-stuff.jpg', ''),
(10, 'Tempura Batter ', 70, 60, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/tempura-batter-filipino-recipes.jpg', ''),
(11, 'Tempura Green Beans', 32, 21, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/tempura-green-beans.jpg', ''),
(12, 'Vivamus', 55, 44, 'Starters', 'http://localhost:8080/FoodHouse/images/food/starters/vivamus.jpg', 'Special'),
-- //Starters--

-- Main Course --
(13, 'Bistecca Tonno', 15, 13, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/BisteccaTonno.jpg', ''),
(14, 'Bourbon Glazed', 88, 65, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/bourbon-glazed-salmon.jpg', ''),
(15, 'Chile Brined Ham', 65, 47, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/chile-brined-ham.jpg', ''),
(16, 'Grigliata', 50, 45, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/Grigliata.jpg', ''),
(17, 'Lamb Chops ', 78, 57, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/lamb-chops-rosemary-xlg.jpg', 'Special'),
(18, 'Maple Sugar Ginger', 68, 65, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/maple-sugar-ginger-roast-pork.jpg', ''),
(19, 'Pasta Soup', 87, 66, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/pasta-soup-good-housekeeping.jpg', ''),
(20, 'Prime Rib Roast', 24, 20, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/prime-rib-roast.jpg', ''),
(21, 'Roast Duck Citrus', 36, 24, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/roast-duck-citrus-xlg.jpg', 'Special'),
(22, 'Salmone Ferri', 70, 50, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/SalmoneFerri.jpg', 'Special'),
(23, 'Tagliata Carne', 36, 30, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/Tagliata-Carne.jpg', ''),
(24, 'Zuppa Oceanica', 54, 50, 'Main Course', 'http://localhost:8080/FoodHouse/images/food/main course/ZuppaOceanica.jpg', ''),
-- //Main Course --

-- Salads --
(25, 'Greek Quinoa', 36, 25, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Greek_Quinoa_Salad.jpg', ''),
(26, 'Grilled Nectarine', 32, 30, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Grilled_Nectarine_Salad.jpg', 'Special'),
(27, 'Lamb Kebabs', 66, 57, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Lamb_Kebabs.jpg', ''),
(28, 'Madeleine Recipes', 50, 44, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Madeleine_Recipes_Feta_raisin_salad.jpg', ''),
(29, 'Recipes Chicken', 33, 21, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Recipes_watermelon_salad.jpg', ''),
(30, 'Sesame Crusted', 44, 41, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Sesame_Crusted_Salmon.jpg', 'Special'),
(31, 'Verggie Nori Wraps', 21, 15, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/VERGGIE_NORI_WRAPS.jpg', ''),
(32, 'Recipes Watermelon', 25, 21, 'Salads', 'http://localhost:8080/FoodHouse/images/food/salads/Recipes_watermelon_salad.jpg', ''),
-- //Salads

-- Desserts --
(33, 'Pink Snail', 44, 40, 'Desserts', 'http://localhost:8080/FoodHouse/images/food/desserts/Pink Snail.jpeg', ''),
(34, 'Birds milk', 31, 29, 'Desserts', 'http://localhost:8080/FoodHouse/images/food/desserts/Birds milk.jpeg', 'Special'),
(35, 'Crumbs', 33, 20, 'Desserts', 'http://localhost:8080/FoodHouse/images/food/desserts/Crumbs.jpeg', 'Special'),
(36, 'Niger Smile', 12, 10, 'Desserts', 'http://localhost:8080/FoodHouse/images/food/desserts/Niger Smile.jpeg', '');
-- //Desserts --

CREATE TABLE IF NOT EXISTS `customer` (
	`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `username` varchar(45) NOT NULL,
    `password` varchar(45) NOT NULL,
    `name` nvarchar(45) COLLATE utf8_bin NOT NULL,
    `phone` varchar(15) NOT NULL, 
    PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `branch` (
	`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` nvarchar(45) COLLATE utf8_bin NOT NULL,
    `address` nvarchar(1000) COLLATE utf8_bin NOT NULL,
    `province` nvarchar(45) COLLATE utf8_bin NOT NULL,
    `image` varchar(500) NOT NULL,
    `phone` varchar(15) NOT NULL,
    `numOfTable` int(10) unsigned NOT NULL,
    `infoTable` nvarchar(500) COLLATE utf8_bin NOT NULL,
    PRIMARY KEY(`id`)
);

INSERT INTO `branch` (`id`, `name`, `address`, `province`, `image`, `phone`, `numOfTable`, `infoTable`) VALUES
-- TP HCM --
(1, 'Food Mart - Q.1', '59 Tran Hung Dao', 'TP HCM', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q1.jpg', '028112153', 15, ''),
(2, 'Food Mart - Q.3', '124 Cao Thang', 'TP HCM', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q3.jpg', '028391293', 12, ''),
(3, 'Food Mart - Q.7', '256 Nguyen Van Linh', 'TP HCM', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q7.jpg', '028195100', 18, ''),
(4, 'Food Mart - Q.8', '159 Hung Phu', 'TP HCM', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q8.jpg', '0289103218', 20, ''),
(5, 'Food Mart - Q. Thu Duc', '255 Vo Van Ngan', 'TP HCM', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Thu duc.jpg', '028786241', 20, ''),
-- //TP HCM --

-- Ha Noi --
(6, 'Food Mart - Q.Ba Dinh','33 Tran Phu', 'Ha Noi', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Ba dinh.jpg', '024112153', 15, ''),
(7, 'Food Mart - Q.Dong Da','259 Ton Duc Thang', 'Ha Noi', 'http://localhost:8080/FoodHouse/images/branches/Ha Noi-Dong Da.jpg', '024391293', 12, ''),
(8, 'Food Mart - Q.Hoan Kiem','11 Thai Ha', 'Ha Noi', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Hoan kiem.jpg', '024195100', 18, ''),
(9, 'Food Mart - Q.Tay Ho','534 Vo Chi Cong', 'Ha Noi', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Tay Ho.jpg', '0249103218', 11, ''),
-- //Ha Noi --

-- Da Nang --
(10, 'Food Mart - Nguyen Trai','20 Nguyen Trai', 'Da Nang', 'http://localhost:8080/FoodHouse/images/branches/Da Nang1.jpg', '0236112153', 12, ''),
(11, 'Food Mart - An Duong Vuong','99 An Duong Vuong', 'Da Nang', 'http://localhost:8080/FoodHouse/images/branches/Da Nang2.jpg', '0236391293', 14, ''),
(12, 'Food Mart - Nguyen Van Cu','987 Nguyen Van Cu', 'Da Nang', 'http://localhost:8080/FoodHouse/images/branches/Da nang3.jpg', '02369103218', 17, ''),
(13, 'Food Mart - Cao Thang','578 Cao Thang', 'Da Nang', 'http://localhost:8080/FoodHouse/images/branches/Da Nang4.jpg', '02369103218', 17, ''),
-- //Da Nang --

-- Nha Trang --
(14, 'Food Mart - Quang Trung','195 Quang Trung', 'Nha Trang', 'http://localhost:8080/FoodHouse/images/branches/Nha Trang - 1.jpg', '0258112153', 18, ''),
(15, 'Food Mart - Ly Thuong Kiet','36 Ly Thuong Kiet', 'Nha Trang', 'http://localhost:8080/FoodHouse/images/branches/Nha Trang - 2.jpg', '0258391293', 12, '');
-- //Nha Trang --


CREATE TABLE IF NOT EXISTS `order`(
	`customer_id` int(10) unsigned NOT NULL,
    `orderDate` date NOT NULL, 
    `status` nvarchar(45) COLLATE utf8_bin NOT NULL,
    `note` nvarchar(1000) COLLATE utf8_bin DEFAULT NULL,
    `totalMoney` double NOT NULL,
    PRIMARY KEY(`customer_id`, `orderDate`),
    CONSTRAINT `fk_order_customer` FOREIGN KEY (`customer_id`)
    REFERENCES `customer`(`id`)
);

CREATE TABLE IF NOT EXISTS `order_lines` (
	`order_customer_id` int(10) unsigned NOT NULL, 
    `order_orderDate` DATE NOT NULL,
    `food_id` int(10) unsigned NOT NULL,
    `quantity` int(10) unsigned NOT NULL,
    `unitSalePrice` double NOT NULL,
    PRIMARY KEY(`order_customer_id`, `order_orderDate`, `food_id`),
    CONSTRAINT `fk_order_lines_food`
    FOREIGN KEY(`food_id`)
    REFERENCES `food`(`id`),
    CONSTRAINT `fk_order_lines_order`
    FOREIGN KEY(`order_customer_id`,`order_orderDate`)
    REFERENCES `order`(`customer_id`, `orderDate`)
);

CREATE TABLE IF NOT EXISTS `branch_has_food` (
	`branch_id` int(10) unsigned NOT NULL,
    `food_id` int(10) unsigned NOT NULL,
    PRIMARY KEY (`branch_id`, `food_id`),
    CONSTRAINT `fk_branch_has_food_branch`
    FOREIGN KEY (`branch_id`)
    REFERENCES `branch`(`id`),
    CONSTRAINT `fk_branch_has_food_food`
    FOREIGN KEY (`food_id`)
    REFERENCES `food`(`id`)
);

CREATE TABLE IF NOT EXISTS `costs-incurred-month` (
	`branch_id` int(10) unsigned NOT NULL,
    `month` int(10) unsigned NOT NULL,
    `totalCost` double NOT NULL,
    PRIMARY KEY (`branch_id`, `month`),
    CONSTRAINT `fk_costs-incurred-month_branch`
    FOREIGN KEY (`branch_id`)
    REFERENCES `branch`(`id`)
);

CREATE TABLE IF NOT EXISTS `costs-incurred-day` (
	`branch_id` int(10) unsigned NOT NULL,
    `day` int(10) unsigned NOT NULL,
    `cost` double NOT NULL,
    PRIMARY KEY (`branch_id`, `day`),
    CONSTRAINT `fk_costs-incurred-day_branch`
    FOREIGN KEY (`branch_id`)
    REFERENCES `branch`(`id`)
);