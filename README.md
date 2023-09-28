mvn clean -> clear "target" folder
mvn compile -> compile java classes to .class (byte code) in target
mv test -> (include compile), run all test cases
mvn package -> (include compile+test), generate jar in target folder
mvn install -> (include compile+test+package), copy jar to .m2 folder(local repository)

Maven Spring Boot Project:
mvn spring-boot: run -> Start up App Server (Web + App)
  Step 1: @SpringbootApplication (this file should be located at root directory)
  Step 2: @ComponentScan -> Find @Component (@Controller, @Service, @Repository, @Configuation) e.g. Acontroller.class, Bservice.class
  Step 3: new objects for Acontroller.class & Bservice.class, put tem into SpringContext
  Step 3.1: Acontroller.class depends on Bservice.class (due to @ Autowird Bservice.lass into Acontroller.class)
  Step 3.2: So new Bservice.class first
  Step 3.3: It will find the object of Bservice from SpringContext in order to create new object of Acontroller (inject Bservice object intor Acontroller object)

  @Component scan: to look for three annotation
  @Service for identify services class