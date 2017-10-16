# Build api with spring boot
To create a new api from nothing by spring boot. And further use swagger to generate api document.

## Practice 1:
1. Create a runable project, OrderService, with spring initializr (https://start.spring.io/ or just use Intellij IDEA), select web and actuator dependencies.
2. Try /health and /info endpoints (add {management.security.enabled=false} to see more detail).
3. Create a simple restful api to return some string (such as /api/order). 

## Practice 2:
1. add swagger dependency
```
compile('io.springfox:springfox-swagger2:2.7.0')
compile('io.springfox:springfox-swagger-ui:2.7.0')
```
Try /v2/api-docs and /swagger-ui.html endpoints

## Practice 3:
1. Create RestTemplate in your project.
2. Create another two modules: CustomerService and LogisticsService
3. In OrderService, call CustomerService and LogisticsService to get some simple information.