import com.animals.AnimalTest;
import com.animals.app.SolutionTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(Suite.class)
@Suite.SuiteClasses({SolutionTest.class, AnimalTest.class})
public class IntegrationTestSuite {
    public static PrintStream printStream;
    public static ByteArrayOutputStream byteArrayOutputStream;

    @BeforeClass
    public static void setup() {
        System.out.println("Before...");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("After.....");

    }
}
