CREATE TABLE PRICE (
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    BRAND_ID BIGINT,
    START_DATE TIMESTAMP,
    END_DATE TIMESTAMP,
    PRICE_LIST INT,
    PRODUCT_ID BIGINT,
    PRIORITY INT,
    PRICE DECIMAL,
    CURRENCY VARCHAR(5)
);

INSERT INTO PRICE (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURRENCY)
VALUES (1, '2023-11-24 08:00:00', '2023-11-25 08:00:00', 1, 1, 1, 10.0, 'EUR');