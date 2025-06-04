import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    @Test
    void name(){
        assertEquals(1,1);
    }

    @Test
    void primeFactorTest1(){
        PrimeFactor pf = new PrimeFactor();
        assertEquals(Arrays.asList(),pf.of(1));
    }

    @Test
    void primeFactorTest2(){
        PrimeFactor pf = new PrimeFactor();
        assertEquals(Arrays.asList(2),pf.of(2));
    }

}