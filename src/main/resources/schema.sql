CREATE TABLE IF NOT EXISTS content (
    id int,
    tile VARCHAR NOT NULL,
    dest text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    PRIMARY KEY (id)
);
