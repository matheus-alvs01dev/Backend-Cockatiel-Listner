CREATE TABLE cockatiels
(
    id       SERIAL PRIMARY KEY,
    name     varchar(50) NOT NULL,
    gender   varchar(6),
    mutation varchar(10) NOT NULL,
    image    varchar(20),
    age      varchar(2)
);
