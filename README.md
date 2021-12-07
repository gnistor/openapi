# openapi
REST API from OAS 3 spec

1. Create the spec YML userAdminPrivateAPI.yml
2. Add maven plugin openapi-generator-maven-plugin
3. Add dependency springfox-boot-starter
4. Configure swagger doc autogeneration like in SpringFoxConfig.java
5. Install project and admire generated clases target/generated-sources/openapi/src/main/java/ro/ct/tomato/openapi/rest_spec_admin
6. Run project
7. Go to http://127.0.0.1:8080/swagger-ui/ and test the API
8. Or alternatively import the userAdminPrivateAPI.yml spec in POSTMAN and test it there
