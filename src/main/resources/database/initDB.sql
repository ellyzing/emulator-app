CREATE TABLE IF NOT EXISTS cards_data
(
    id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    number VARCHAR(16) NOT NULL ,
    CVV VARCHAR(3)  NOT NULL ,
    exdate DATE NOT NULL ,
    money MONEY NOT NULL , 
    pin VARCHAR(4) NOT NULL 
);
