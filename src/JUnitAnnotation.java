import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

public class JUnitAnnotation {
//    Exercice 1
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
    @Before
    public void before() {
        System.out.println("before");
    }
    @After
    public void after() {
        System.out.println("after");
    }
    @Test
    public void test() {
        System.out.println("test");
    }
    @Ignore
    public void ignoreTest() {
        System.out.println("ignore test");
    }

//    Exercice 2
        @Test
        public void equalString() {
            System
                    .out.println
                            ("Je developpeur Mobile");
            String str1
                    ="Je developpeur Mobile"
                    ;
            assertEquals
                    ("Je developpeur Mobile", str1);
        }

}
