INSERT INTO categories (name) 
VALUES ('Produce'),
       ('Dairy'),
       ('Bakery'),
       ('Meat & Seafood'),
       ('Beverages');

INSERT INTO products (name, price, description, category_id) 
VALUES ('Organic Bananas (1 lb)', 0.69, 'Fresh organic bananas sold by the pound. Perfect for smoothies and snacking.', 1),
       ('Honeycrisp Apples (1 lb)', 1.99, 'Crisp and sweet Honeycrisp apples sourced from local farms.', 1),

       ('2% Milk (1 Gallon)', 3.49, 'Grade A pasteurized 2% reduced fat milk.', 2),
       ('Large Brown Eggs (12 ct)', 4.29, 'Farm fresh large brown eggs, cage-free.', 2),

       ('Sourdough Bread Loaf', 4.99, 'Artisan sourdough bread baked fresh daily.', 3),
       ('Blueberry Muffins (4 ct)', 5.49, 'Moist blueberry muffins made with real blueberries.', 3),

       ('Boneless Skinless Chicken Breast (1 lb)', 6.99, 'All-natural boneless skinless chicken breast.', 4),
       ('Atlantic Salmon Fillet (1 lb)', 11.99, 'Fresh Atlantic salmon fillet, rich in omega-3.', 4),

       ('Coca-Cola (12 Pack)', 7.99, '12 pack of 12oz Coca-Cola cans.', 5),
       ('Orange Juice (52 oz)', 4.59, 'No pulp 100% pure squeezed orange juice.', 5);

