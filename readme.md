# Example Application 
showing howto use Java 14 Records as dtos in Spring RestController 

## Build and Test
```
mvn clean package
java --enable-preview -jar ./target/playground.java14.records.jar
curl -X POST -H "Content-Type: application/json" -d '{"name":"Max"}' http://localhost:8080/hello 
```

## Related
* https://dzone.com/articles/jdk-14-records-for-spring-devs
* https://github.com/FasterXML/jackson-databind/issues/2709