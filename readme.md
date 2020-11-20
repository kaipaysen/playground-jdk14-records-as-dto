# Example Application 
Exploring howto use Java 14/15 Records as dtos in Spring RestController 
Currently it's more or less buggy. 

## Build and Test
```
mvn clean package
export JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000
java --enable-preview -jar ./target/playground.java14.records.jar
curl -X POST -H "Content-Type: application/json" -d '{"name":"Max"}' http://localhost:8080/hello 
```

## Related
* https://dzone.com/articles/jdk-14-records-for-spring-devs
* https://github.com/FasterXML/jackson-databind/issues/2709