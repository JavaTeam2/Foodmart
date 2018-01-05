INSERT INTO `users` (`name`, `email`, `username`, `password`, `city`, `province`, `address`, `phone`) VALUES
('customer', 'customer@gmail.com', 'customer', '123456', 'Hồ Chí Minh', '', '170 Quốc lộ 1A', '0913937660'),
('seller', 'manager@gmail.com', 'seller', '123456', 'Hồ Chí Minh', '', '', ''),
('admin', 'admin@gmail.com', 'admin', '123456', 'Hồ Chí Minh', '', '', '');

INSERT INTO `user_roles`(`username`, `role`) VALUES
('customer', 'ROLE_CUSTOMER'),
('seller', 'ROLE_SELLER'),
('admin', 'ROLE_ADMIN');

INSERT INTO `foods` (`name`, `price`, `price_promotion`, `image`, `description`) VALUES

-- Starters--
('Blue Cheese Salad', 15, 13, 'http://localhost:8080/FoodHouse/images/food/starters/blue-cheese-salad-super-salads.jpg', 'Special'),
('Donec', 35, 30,  'http://localhost:8080/FoodHouse/images/food/starters/donec.jpg', ''),
('Ens Banting', 21, 15,  'http://localhost:8080/FoodHouse/images/food/starters/ens-banting.jpg', ''),
('Fusce', 17, 12,  'http://localhost:8080/FoodHouse/images/food/starters/fusce.jpg', 'Special'),
('Ipsum', 24, 21,  'http://localhost:8080/FoodHouse/images/food/starters/ipsum.jpg', ''),
('Kitchen Stuff ', 55, 43,  'http://localhost:8080/FoodHouse/images/food/starters/kitchen-stuff-chorizo.jpg', ''),
('Lorem', 42, 40,  'http://localhost:8080/FoodHouse/images/food/starters/lorem.jpg', ''),
('Nullam', 32, 30,  'http://localhost:8080/FoodHouse/images/food/starters/Nullam.jpg', 'Special'),
('Spier Kitchen Stuff', 44, 38,  'http://localhost:8080/FoodHouse/images/food/starters/spier-kitchen-stuff.jpg', ''),
('Tempura Batter ', 70, 60,  'http://localhost:8080/FoodHouse/images/food/starters/tempura-batter-filipino-recipes.jpg', ''),
('Tempura Green Beans', 32, 21,  'http://localhost:8080/FoodHouse/images/food/starters/tempura-green-beans.jpg', ''),
('Vivamus', 55, 44,  'http://localhost:8080/FoodHouse/images/food/starters/vivamus.jpg', 'Special'),
-- //Starters--

-- Main Course --
('Bistecca Tonno', 15, 13, 'http://localhost:8080/FoodHouse/images/food/main course/BisteccaTonno.jpg', ''),
('Bourbon Glazed', 88, 65, 'http://localhost:8080/FoodHouse/images/food/main course/bourbon-glazed-salmon.jpg', ''),
('Chile Brined Ham', 65, 47, 'http://localhost:8080/FoodHouse/images/food/main course/chile-brined-ham.jpg', ''),
('Grigliata', 50, 45, 'http://localhost:8080/FoodHouse/images/food/main course/Grigliata.jpg', ''),
('Lamb Chops ', 78, 57, 'http://localhost:8080/FoodHouse/images/food/main course/lamb-chops-rosemary-xlg.jpg', 'Special'),
('Maple Sugar Ginger', 68, 65, 'http://localhost:8080/FoodHouse/images/food/main course/maple-sugar-ginger-roast-pork.jpg', ''),
('Pasta Soup', 87, 66, 'http://localhost:8080/FoodHouse/images/food/main course/pasta-soup-good-housekeeping.jpg', ''),
('Prime Rib Roast', 24, 20, 'http://localhost:8080/FoodHouse/images/food/main course/prime-rib-roast.jpg', ''),
('Roast Duck Citrus', 36, 24, 'http://localhost:8080/FoodHouse/images/food/main course/roast-duck-citrus-xlg.jpg', 'Special'),
('Salmone Ferri', 70, 50, 'http://localhost:8080/FoodHouse/images/food/main course/SalmoneFerri.jpg', 'Special'),
('Tagliata Carne', 36, 30, 'http://localhost:8080/FoodHouse/images/food/main course/Tagliata-Carne.jpg', ''),
('Zuppa Oceanica', 54, 50, 'http://localhost:8080/FoodHouse/images/food/main course/ZuppaOceanica.jpg', ''),
-- //Main Course --

-- Salads --
('Greek Quinoa', 36, 25,  'http://localhost:8080/FoodHouse/images/food/salads/Greek_Quinoa_Salad.jpg', ''),
('Grilled Nectarine', 32, 30,  'http://localhost:8080/FoodHouse/images/food/salads/Grilled_Nectarine_Salad.jpg', 'Special'),
('Lamb Kebabs', 66, 57,  'http://localhost:8080/FoodHouse/images/food/salads/Lamb_Kebabs.jpg', ''),
('Madeleine Recipes', 50, 44,  'http://localhost:8080/FoodHouse/images/food/salads/Madeleine_Recipes_Feta_raisin_salad.jpg', ''),
('Recipes Chicken', 33, 21,  'http://localhost:8080/FoodHouse/images/food/salads/Recipes_watermelon_salad.jpg', ''),
('Sesame Crusted', 44, 41,  'http://localhost:8080/FoodHouse/images/food/salads/Sesame_Crusted_Salmon.jpg', 'Special'),
('Verggie Nori Wraps', 21, 15,  'http://localhost:8080/FoodHouse/images/food/salads/VERGGIE_NORI_WRAPS.jpg', ''),
('Recipes Watermelon', 25, 21,  'http://localhost:8080/FoodHouse/images/food/salads/Recipes_watermelon_salad.jpg', ''),
-- //Salads

-- Desserts --
('Pink Snail', 44, 40,  'http://localhost:8080/FoodHouse/images/food/desserts/Pink Snail.jpeg', ''),
('Birds milk', 31, 29,  'http://localhost:8080/FoodHouse/images/food/desserts/Birds milk.jpeg', 'Special'),
('Crumbs', 33, 20,  'http://localhost:8080/FoodHouse/images/food/desserts/Crumbs.jpeg', 'Special'),
('Niger Smile', 12, 10,  'http://localhost:8080/FoodHouse/images/food/desserts/Niger Smile.jpeg', '');




INSERT INTO `branches` (`name`, `address`, `province`, `city`,  `open_time`, `close_time`,  `image`, `phone`, `table_quantity`, `description`) VALUES
-- TP HCM --
('Food Mart - Q.1', '59 Tran Hung Dao',  'Ho Chi Minh', 'Hồ Chí Minh',  '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q1.jpg', '028112153', 15, ''),
('Food Mart - Q.3', '124 Cao Thang', 'Ho Chi Minh', 'Hồ Chí Minh',  '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q3.jpg', '028391293', 12, ''),
('Food Mart - Q.7', '256 Nguyen Van Linh', 'Ho Chi Minh', 'Hồ Chí Minh',  '8:30:00', '21:30:00', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q7.jpg', '028195100', 18, ''),
('Food Mart - Q.8', '159 Hung Phu', 'Ho Chi Minh', 'Hồ Chí Minh',  '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Q8.jpg', '0289103218', 20, ''),
('Food Mart - Q. Thu Duc', '255 Vo Van Ngan', 'Ho Chi Minh', 'Hồ Chí Minh',  '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/TP HCM Thu duc.jpg', '028786241', 20, ''),
-- //TP HCM --

-- Ha Noi --
('Food Mart - Q.Ba Dinh','33 Tran Phu', 'Ha Noi', 'Hà Nội',  '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Ba dinh.jpg', '024112153', 15, ''),
('Food Mart - Q.Dong Da','259 Ton Duc Thang', 'Ha Noi', 'Hà Nội', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Ha Noi-Dong Da.jpg', '024391293', 12, ''),
('Food Mart - Q.Hoan Kiem','11 Thai Ha', 'Ha Noi', 'Hà Nội', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Hoan kiem.jpg', '024195100', 18, ''),
('Food Mart - Q.Tay Ho','534 Vo Chi Cong', 'Ha Noi', 'Hà Nội', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Ha noi-Tay Ho.jpg', '0249103218', 11, ''),
-- //Ha Noi --

-- Da Nang --
('Food Mart - Nguyen Trai','20 Nguyen Trai', 'Da Nang', 'Đà Nẵng', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Da Nang1.jpg', '0236112153', 12, ''),
('Food Mart - An Duong Vuong','99 An Duong Vuong', 'Da Nang', 'Đà Nẵng', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Da Nang2.jpg', '0236391293', 14, ''),
('Food Mart - Nguyen Van Cu','987 Nguyen Van Cu', 'Da Nang', 'Đà Nẵng', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Da nang3.jpg', '02369103218', 17, ''),
('Food Mart - Cao Thang','578 Cao Thang', 'Đà Nẵng', 'Da Nang', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Da Nang4.jpg', '02369103218', 17, ''),
-- //Da Nang --

-- Nha Trang --
('Food Mart - Quang Trung','195 Quang Trung', 'Nha Trang', 'Nha Trang', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Nha Trang - 1.jpg', '0258112153', 18, ''),
('Food Mart - Ly Thuong Kiet','36 Ly Thuong Kiet', 'Nha Trang', 'Nha Trang', '9:00:00', '22:00:00', 'http://localhost:8080/FoodHouse/images/branches/Nha Trang - 2.jpg', '0258391293', 12, '');


INSERT INTO `categories` (`name`) VALUES
('Starters'),
('Maincourse'),
('Salads'),
('Desserts'),
('Maincourse');

INSERT INTO `categories_foods` (`cat_id`, `food_id`) VALUES
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5),
(1, 7), (1, 8), (1, 9), (1, 10), (1, 11), (1, 12),
(2, 13), (2, 14), (2, 15), (2, 16), (2, 17), (2, 18), 
(2, 19), (2, 20), (2, 21), (2, 22), (2, 23), (2, 24), 
(3, 25), (3, 26), (3, 27), (3, 28), (3, 29), 
(3, 30), (3, 31), (3, 32), (4, 33), (4, 34), (4, 35), (4, 36);

INSERT INTO `branches_foods` (`branch_id`, `food_id`) VALUES
(1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12), (1,13), (1,14), (1,15), (1,16), (1,17), (1,18), (1,19), (1,20), (1,21), (1,22), (1,23), (1,24), (1,25), (1,26), (1,27), (1,28), (1,29), (1,30), (1,31), (1,32), (1,33), (1,34), (1,35), (1,36), 
(2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (2,7), (2,8), (2,9), (2,10), (2,11), (2,12), (2,13), (2,14), (2,15), (2,16), (2,17), (2,18), (2,19), (2,20), (2,21), (2,22), (2,23), (2,24), (2,25), (2,26), (2,27), (2,28), (2,29), (2,30), (2,31), (2,32), (2,33), (2,34), (2,35), (2,36), 
(3,1), (3,2), (3,3), (3,4), (3,5), (3,6), (3,7), (3,8), (3,9), (3,10), (3,11), (3,12), (3,13), (3,14), (3,15), (3,16), (3,17), (3,18), (3,19), (3,20), (3,21), (3,22), (3,23), (3,24), (3,25), (3,26), (3,27), (3,28), (3,29), (3,30), (3,31), (3,32), (3,33), (3,34), (3,35), (3,36), 
(4,1), (4,2), (4,3), (4,4), (4,5), (4,6), (4,7), (4,8), (4,9), (4,10), (4,11), (4,12), (4,13), (4,14), (4,15), (4,16), (4,17), (4,18), (4,19), (4,20), (4,21), (4,22), (4,23), (4,24), (4,25), (4,26), (4,27), (4,28), (4,29), (4,30), (4,31), (4,32), (4,33), (4,34), (4,35), (4,36), 
(5,1), (5,2), (5,3), (5,4), (5,5), (5,6), (5,7), (5,8), (5,9), (5,10), (5,11), (5,12), (5,13), (5,14), (5,15), (5,16), (5,17), (5,18), (5,19), (5,20), (5,21), (5,22), (5,23), (5,24), (5,25), (5,26), (5,27), (5,28), (5,29), (5,30), (5,31), (5,32), (5,33), (5,34), (5,35), (5,36), 
(6,1), (6,2), (6,3), (6,4), (6,5), (6,6), (6,7), (6,8), (6,9), (6,10), (6,11), (6,12), (6,13), (6,14), (6,15), (6,16), (6,17), (6,18), (6,19), (6,20), (6,21), (6,22), (6,23), (6,24), (6,25), (6,26), (6,27), (6,28), (6,29), (6,30), (6,31), (6,32), (6,33), (6,34), (6,35), (6,36), 
(7,1), (7,2), (7,3), (7,4), (7,5), (7,6), (7,7), (7,8), (7,9), (7,10), (7,11), (7,12), (7,13), (7,14), (7,15), (7,16), (7,17), (7,18), (7,19), (7,20), (7,21), (7,22), (7,23), (7,24), (7,25), (7,26), (7,27), (7,28), (7,29), (7,30), (7,31), (7,32), (7,33), (7,34), (7,35), (7,36), 
(8,1), (8,2), (8,3), (8,4), (8,5), (8,6), (8,7), (8,8), (8,9), (8,10), (8,11), (8,12), (8,13), (8,14), (8,15), (8,16), (8,17), (8,18), (8,19), (8,20), (8,21), (8,22), (8,23), (8,24), (8,25), (8,26), (8,27), (8,28), (8,29), (8,30), (8,31), (8,32), (8,33), (8,34), (8,35), (8,36), 
(9,1), (9,2), (9,3), (9,4), (9,5), (9,6), (9,7), (9,8), (9,9), (9,10), (9,11), (9,12), (9,13), (9,14), (9,15), (9,16), (9,17), (9,18), (9,19), (9,20), (9,21), (9,22), (9,23), (9,24), (9,25), (9,26), (9,27), (9,28), (9,29), (9,30), (9,31), (9,32), (9,33), (9,34), (9,35), (9,36), 
(10,1), (10,2), (10,3), (10,4), (10,5), (10,6), (10,7), (10,8), (10,9), (10,10), (10,11), (10,12), (10,13), (10,14), (10,15), (10,16), (10,17), (10,18), (10,19), (10,20), (10,21), (10,22), (10,23), (10,24), (10,25), (10,26), (10,27), (10,28), (10,29), (10,30), (10,31), (10,32), (10,33), (10,34), (10,35), (10,36), 
(11,1), (11,2), (11,3), (11,4), (11,5), (11,6), (11,7), (11,8), (11,9), (11,10), (11,11), (11,12), (11,13), (11,14), (11,15), (11,16), (11,17), (11,18), (11,19), (11,20), (11,21), (11,22), (11,23), (11,24), (11,25), (11,26), (11,27), (11,28), (11,29), (11,30), (11,31), (11,32), (11,33), (11,34), (11,35), (11,36), 
(12,1), (12,2), (12,3), (12,4), (12,5), (12,6), (12,7), (12,8), (12,9), (12,10), (12,11), (12,12), (12,13), (12,14), (12,15), (12,16), (12,17), (12,18), (12,19), (12,20), (12,21), (12,22), (12,23), (12,24), (12,25), (12,26), (12,27), (12,28), (12,29), (12,30), (12,31), (12,32), (12,33), (12,34), (12,35), (12,36), 
(13,1), (13,2), (13,3), (13,4), (13,5), (13,6), (13,7), (13,8), (13,9), (13,10), (13,11), (13,12), (13,13), (13,14), (13,15), (13,16), (13,17), (13,18), (13,19), (13,20), (13,21), (13,22), (13,23), (13,24), (13,25), (13,26), (13,27), (13,28), (13,29), (13,30), (13,31), (13,32), (13,33), (13,34), (13,35), (13,36), 
(14,1), (14,2), (14,3), (14,4), (14,5), (14,6), (14,7), (14,8), (14,9), (14,10), (14,11), (14,12), (14,13), (14,14), (14,15), (14,16), (14,17), (14,18), (14,19), (14,20), (14,21), (14,22), (14,23), (14,24), (14,25), (14,26), (14,27), (14,28), (14,29), (14,30), (14,31), (14,32), (14,33), (14,34), (14,35), (14,36), 
(15,1), (15,2), (15,3), (15,4), (15,5), (15,6), (15,7), (15,8), (15,9), (15,10), (15,11), (15,12), (15,13), (15,14), (15,15), (15,16), (15,17), (15,18), (15,19), (15,20), (15,21), (15,22), (15,23), (15,24), (15,25), (15,26), (15,27), (15,28), (15,29), (15,30), (15,31), (15,32), (15,33), (15,34), (15,35), (15,36);

INSERT INTO `orders` (`customer_id`, `branch_id`, `customer_name`, `customer_phone`, `customer_email`, `customer_address`, `customer_city`, `customer_province`, `total_money`, `date_time`, `status`, `note`) VALUES
(1, 1, 'customer', '0913937660', 'customer@gmail.com', '170 Quốc lộ 1A', 'Hồ Chí Minh', '', 3123, '2015-09-12 11:31:12', 'Choose', '');

INSERT INTO `order_details` (`order_id`, `food_id`, `price`, `quantity`) VALUES
(1, 1, 45.5, 3),
(1, 2, 31.3, 2);