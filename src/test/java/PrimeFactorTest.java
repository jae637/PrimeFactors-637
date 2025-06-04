import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    private PrimeFactor pf;

    @Test
    void name(){
        assertEquals(1,1);
    }

    @BeforeEach
    void setUp() {
        pf = new PrimeFactor();
    }

    @Test
    void primeFactorTest1(){
        assertEquals(Arrays.asList(),pf.of(1));
    }

    @Test
    void primeFactorTest2(){
        assertEquals(Arrays.asList(2),pf.of(2));
    }
    @Test
    void primeFactorTest3(){
        assertEquals(Arrays.asList(3),pf.of(3));
    }

}