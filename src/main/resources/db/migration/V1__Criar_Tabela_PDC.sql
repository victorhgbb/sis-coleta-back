CREATE TABLE pdc (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    "address" VARCHAR(100) NOT NULL,
    latitude VARCHAR(100) NOT NULL,
    longitude VARCHAR(100) NOT NULL,
    type VARCHAR(100) NOT NULL,
    cep VARCHAR(100) NOT NULL,
    telephone VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    create_user VARCHAR(100) NOT NULL,
    date_create timestamp,
    date_update timestamp,
    update_user VARCHAR(100)
);