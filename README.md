SpringRest
==========

A Spring Rest service application using H2 embedded database with JDBCTemplates. Secured by Spring Security and JUnit test cases.

##Rest Endpoints
* getProductById <http://localhost:8080/spring-rest/api/v1/product/{id}>   replace id with one of the id (1-7)
* getAllProduct <http://localhost:8080/spring-rest/api/v1/product/>  
* getProductByCategoryName <http://localhost:8080/spring-rest/api/v1/product/category/{CategoryName}> two available categories are Laptop and Mobile
