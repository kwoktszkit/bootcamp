1. @Controller + @ResponseBody (@RestController)
-> Bean + Web Layer
2. @Service
-> Bean
3. @Repository (JPA + Hibernate)
-> Define Entity (with @Id & implements Serializable)
-> Bean
-> JPA includes basic CRUD operations
-> method name rules for Hibernate generating implementions
-> @Query -> JPQL (Entity) or Native SQL
-> nativeQuery = True
-> Isolate the Data base
4. @Configuration
-> @Bean (Method Annotation) -> Create Bean by Method
5. What is Depenedency?
-> @Autowird
  ->Field injection(@Autowird on a constructor)
  -> constructor injection(@Autowird on a constructor)
-> Controller depends on Service (because controller autowired service)
-> AppConfig class depends on yml (for example, it used @Value)
6. What is Ioc (Inversion of Controll)
  -> Java: use new keyword to create object. Developer control the relationship between objects
  -> Spring or Spring Boot: Application Context plays a role fo managing the dependency between objects. ti complains during the server starts if missing dependency is found.

7. RestTemplate
-> getForObject
-> UriComponentsBuilder(with yml, @Value)
-> Define the return type (Object or Array)
8. model class (DTO)
-> lombok
-> modelMapper
-> mapper class
9. @Scheduled
 -> @FixRated, @FixDelay, @Scheduled(cron = ?)
10. CommandLineRunner (Interface)
 -> @Component
 -> implements run method
 -> this method will be excuted during server start
 -> Server start will fail f the run method fail 
11. ApiResponse<T>
  -> generics of data
12. Custom Exception class (extends Exception.class)
12. GlobalExceptionHandler
 -> @ControlerAdvise (@RestControllerAdvise)
 -> @ExceptionHandler (method)
 -> Catch from child to parent Exception
13. DTO
  -> Deserialization (Controll: from JSON to Object)
  -> Serialization (Controller ResponseBody: from Object to JSON)
  -> ObjectMapper (test code)


4. test code
-> By Environment & Layer
  -> @Test, @SpringBootTest
  -> Web Layer
    -> @WebMvcTest
    -> @Autowird MockMvc
    -> @MockBean for Service (Controller Autowird Service)
    -> Mockito, when & thenReturn for MockBean's method
    -> mockMvc.perform() -> test JSON structure
    -> verify if service layer being called
    -> Hamcrest (AssertThat)
  -> Service Layer
    -> @SpringBootTest
    -> @MockBean for Repository
    -> @Mock, @InjectMock -> mock normal java class & method
    -> Mockito, when & thenReturn for MockBean's method
    -> Hamcrest (asserThat)
  -> Repository Layer
    -> @DataJpaLayer
    -> Autowird TestEntityManager
    -> Autowird repository
    -> TestEntityManager.persist() -> prepare testing data
    -> repository.save(), findById() -> test Hibrenate