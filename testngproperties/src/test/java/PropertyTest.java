import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import properties.Environment;

public class PropertyTest {

    private Environment testEnvironment;
    private String env = "dev";
    @Test
    public void functionalTest() {
        System.out.println(testEnvironment.url());
        System.out.println(testEnvironment.getUsername());
        System.out.println(testEnvironment.getPassword());
    }

    @BeforeTest
   @Parameters({"environment"})
    public void beforeTest(String environment) {
        if(System.getProperty("env")!=null) {
            env = System.getProperty("env");
        }

        if(!environment.equalsIgnoreCase("")){
            env = environment;
        }
        System.out.println("env:" + env);
        ConfigFactory.setProperty("env", env);
        testEnvironment = ConfigFactory.create(Environment.class);
    }
}
