# gitpod-io-springboot-postgres-jpa
A Spring Boot repo using gitpod.io workspace
Database used : 
Postgres docker image by gitpod.io (https://www.gitpod.io/blog/gitpodify#postgresql)

## How to run :
1) Run Spring Boot
- Just open the workspace
(gitpod.DockerFile already configured with Java 17 & Postgres)
(Using gitpod tasks in .gitpod.yml, spring boot already configured to automatically run upon loading workspace)
- db auto schema creation and auto init

## PSQL CLI Commands
### View available databases:
```sh
\l
```
### Connect to a database:
```sh
\c postgres
```
### View table:
```sh
SELECT * from cities; //don't forget semicolon, superimportant!
```
