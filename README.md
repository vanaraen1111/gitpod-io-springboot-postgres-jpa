# spring-data-jpa
A repo to learn basics of Spring Data Hibernate JPA

Run with gitpod.io
Preconfigure with gitpod Postgres Docker Image and dependencies on Java 17 

Refer here:
(https://www.gitpod.io/docs/languages/java/?utm_source=googleads&utm_medium=search&utm_campaign=dynamic_search_ads&utm_id=16501579379&utm_content=dsa&gclid=Cj0KCQjwxveXBhDDARIsAI0Q0x3GePxpv7Uv_MROpBJiRAldxnFZ9Nape6eBl8gekQt8FlocZjplpkkaAvlZEALw_wcB)


How to run :
1) Run Spring Boot with Postgres Server
- Using gitpod tasks, spring boot already configured to automatically run upon loading workspace

2) Init Postgres Data
In terminal PostGres DB Init, type this command :

\i schema-postgres.sql 
\i data-postgres.sql

View available databases:
\l

Connect to a database:
\c <databasename> 

View table:
SELECT * from <tablename>; //don't forget semicolon, superimportant!