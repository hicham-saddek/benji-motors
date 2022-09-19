CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE example
(
    id    BIGINT NOT NULL,
    name  VARCHAR(255),
    age   VARCHAR(255),
    state VARCHAR(255),
    CONSTRAINT pk_example PRIMARY KEY (id)
);
