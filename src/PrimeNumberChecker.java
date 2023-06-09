import com.beust.jcommander.Parameterized;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.Assert.assertEquals;

public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
    @RunWith(Parameterized.class)
    public class PrimeNumberCheckerTest {
        private Integer numeroEntree;
        private Boolean resultatAttendu;
        private PrimeNumberChecker primeNumberChecker;
        @Before
        public void initialize() {
            primeNumberChecker = new PrimeNumberChecker();
        }
        public PrimeNumberCheckerTest(Integer numeroEntree,
                                      Boolean resultatAttendu) {
            this.numeroEntree = numeroEntree;
            this.resultatAttendu = resultatAttendu;
        }
        @Parameterized.Parameters
        public static Collection primeNumbers() {
            return Arrays.asList(new Object[][] {
                    { 2, true },
                    { 6, false },
                    { 19, true },
                    { 22, false },
                    { 23, true },
                    { 73, true },
                    { 121, false }
            });
        }
        @Test
        public void testPrimeNumberChecker() {
            System.out.println("Nombre paramétré est : " + numeroEntree);
            assertEquals(resultatAttendu,
                    primeNumberChecker.validate(numeroEntree));
        }

    }
}
