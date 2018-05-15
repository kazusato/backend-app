# Spring Boot + Azure Cosmos DB Example
## Prerequisites
This project uses the following versions of libraries:
- Spring Boot 1.x
- Spring Data 1.x
- [Spring Data CosmosDB 0.1.5](https://github.com/Microsoft/spring-data-cosmosdb)

### Remarks
The version 0.1.5 of Spring Data CosmosDB is available as "spring-data-documentdb" through Maven Central
while 2.x is available as "spring-data-cosmosdb".

## Architecture
### Cosmos DB
Access information to Cosmos DB (uri, key, database) should be passed throught environment variables as follows:
- AZURE_DOCUMENTDB_URI=https://xxxxxx.documents.azure.com:443/
- AZURE_DOCUMENTDB_KEY=xxxxx
- AZURE_DOCUMENTDB_DATABASE=xxxxx

