# Experiments with various libraries and tools

Testing various Spring backend feature, without tests.

Compile and run with
	mvn clean install
	java -jar target/sa-spring-1.0-SNAPSHOT.jar

Try out with
	curl http://localhost:8080/simplistics
	curl -X POST -F 'id=10' -F 'name=ten' http://localhost:8080/add
