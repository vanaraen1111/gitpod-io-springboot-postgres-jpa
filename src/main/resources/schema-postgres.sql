CREATE DATABASE testdb;
DROP TABLE IF EXISTS testdb.cities;
CREATE TABLE testdb.cities(id serial PRIMARY KEY, name VARCHAR(255), population integer);