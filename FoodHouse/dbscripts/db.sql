CREATE TABLE IF NOT EXISTS `users` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`name` nvarchar(64) COLLATE utf8_bin NOT NULL,
	`email` varchar(512) NOT NULL UNIQUE,
    `username` varchar(64) NOT NULL UNIQUE,
    `password` varchar(64) NOT NULL,
    `city` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `province` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `address` nvarchar(128) COLLATE utf8_bin NOT NULL,   
    `phone` varchar(16) NOT NULL, 
    PRIMARY KEY(`id`)
);
CREATE INDEX `idx_username` ON `users`(`username`);
CREATE INDEX `idx_email` ON `users`(`email`);

CREATE TABLE IF NOT EXISTS `user_roles`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(45) NOT NULL,
    `role` varchar(45) NOT NULL,
    PRIMARY KEY(`id`),
    CONSTRAINT `fk_username` FOREIGN KEY (`username`)
    REFERENCES `users`(`username`)
);

CREATE TABLE IF NOT EXISTS `foods` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
    `name` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `price` double unsigned NOT NULL,
    `price_promotion` double unsigned NOT NULL,
    `image` varchar(512) NOT NULL,
    `description` nvarchar(1024) COLLATE utf8_bin NOT NULL,
     PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `branches` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
    `name` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `address` nvarchar(128) COLLATE utf8_bin NOT NULL,
    `province` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `city` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `phone` varchar(16) COLLATE utf8_bin NOT NULL,
    `open_time` time NOT NULL,
    `close_time` time NOT NULL,
    `table_quantity` int unsigned NOT NULL,
    `image` varchar(1024) NOT NULL,
    `description` nvarchar(1024) NOT NULL,
    PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `orders`(
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`customer_id` int unsigned,
	`branch_id` int unsigned NOT NULL,
	`customer_name` nvarchar(64) NOT NULL,
	`customer_phone` varchar(16)  NOT NULL,
	`customer_email` varchar(512)  NOT NULL,
	`customer_address` nvarchar(128)  NOT NULL,
	`customer_city` nvarchar(64) NOT NULL,
	`customer_province` nvarchar(64) NOT NULL,
    `total_money` double unsigned NOT NULL,
    `date_time` datetime NOT NULL, 
    `status` nvarchar(64) COLLATE utf8_bin NOT NULL,
    `note` nvarchar(1024) COLLATE utf8_bin NOT NULL,
    PRIMARY KEY(`id`),
    CONSTRAINT `fk_orders_users` FOREIGN KEY (`customer_id`) REFERENCES `users`(`id`),
    CONSTRAINT `fk_orders_branches` FOREIGN KEY (`branch_id`) REFERENCES `branches`(`id`)
);


CREATE TABLE IF NOT EXISTS `order_details` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`order_id` int unsigned NOT NULL,
    `food_id` int unsigned NOT NULL,
    `price` double unsigned NOT NULL,
    `quantity` int unsigned NOT NULL,
    PRIMARY KEY(`id`),
    CONSTRAINT `fk_order_details_foods` FOREIGN KEY(`food_id`)
    REFERENCES `foods`(`id`),
    CONSTRAINT `fk_order_details_orders` FOREIGN KEY(`order_id`)
    REFERENCES `orders`(`id`)
);

CREATE TABLE IF NOT EXISTS `branches_foods` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`branch_id` int unsigned NOT NULL,
    `food_id` int unsigned NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`branch_id`, `food_id`),
    CONSTRAINT `fk_branch_has_food_branch` FOREIGN KEY (`branch_id`)
    REFERENCES `branches`(`id`),
    CONSTRAINT `fk_branch_has_food_food` FOREIGN KEY (`food_id`)
    REFERENCES `foods`(`id`)
);

CREATE TABLE IF NOT EXISTS `costs_incurred` (
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`date` date NOT NULL,
	`branch_id` int unsigned NOT NULL,
    `cause` NVARCHAR(1024) COLLATE utf8_bin NOT NULL,
    `cost` double unsigned NOT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `fk_costs-incurred-month_branch` FOREIGN KEY (`branch_id`)
    REFERENCES `branches`(`id`)
);

CREATE TABLE IF NOT EXISTS `visit_statistics`(
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`user_id` int unsigned, /* null: guest */
	`date_time` datetime NOT NULL,
	`route` varchar(1024),
	PRIMARY KEY(`id`),
	FOREIGN KEY(`user_id`) REFERENCES `users`(`id`)
);

CREATE TABLE IF NOT EXISTS `categories`(
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`name` nvarchar(1024) NOT NULL,
	PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `categories_foods`(
	`id` int unsigned NOT NULL AUTO_INCREMENT,
	`cat_id` int unsigned NOT NULL,
	`food_id` int unsigned NOT NULL,
	PRIMARY KEY(`id`),
	FOREIGN KEY(`cat_id`) REFERENCES `categories`(`id`),
	FOREIGN KEY(`food_id`) REFERENCES `foods`(`id`),
	UNIQUE (`cat_id`, `food_id`)
);