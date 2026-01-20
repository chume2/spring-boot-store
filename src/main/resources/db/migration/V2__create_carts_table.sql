CREATE TABLE carts (
  `id` BINARY(16) NOT NULL DEFAULT (uuid_to_bin(uuid())) PRIMARY KEY,
  `date_created` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE cart_items (
  `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `cart_id` BINARY(16) NOT NULL,
  `product_id` BIGINT NOT NULL,
  `quantity` INT NOT NULL DEFAULT 1,
  
  CONSTRAINT fk_cart
    FOREIGN KEY (cart_id) REFERENCES carts(id) ON DELETE CASCADE,

  CONSTRAINT fk_product 
    FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE,

  CONSTRAINT uq_cart_product
    UNIQUE (cart_id, product_id)
);