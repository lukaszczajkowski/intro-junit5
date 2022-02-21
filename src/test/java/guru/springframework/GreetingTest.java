package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Anna"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After - I am only called once");
    }
}