# gitpod-io-springboot-postgres-jpa
A Spring Boot repo using gitpod.io workspace
Database used : Postgres docker image by gitpod.io (https://www.gitpod.io/blog/gitpodify#postgresql)

## How to run :
1) Run Spring Boot with Postgres Server
- Using gitpod tasks in .gitpod.yml, spring boot already configured to automatically run upon loading workspace

2) Init Postgres Data
In terminal PostGres DB Init (using psql CLI), type this command :
```sh
psql
\i schema-postgres.sql 
\i data-postgres.sql
```

## PSQL CLI Commands
### View available databases:
```sh
\l
```
### Connect to a database:
```sh
\c <databasename> 
```
### View table:
```sh
SELECT * from <tablename>; //don't forget semicolon, superimportant!
```
