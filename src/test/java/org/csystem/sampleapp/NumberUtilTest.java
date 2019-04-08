package org.csystem.sampleapp;

import org.csystem.sampleapp.NumberUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NumberUtilTest {

    @Test
    public void isPrimeTest()
    {
        Assertions.assertEquals(true, NumberUtil.isPrime(1000003));
        Assertions.assertEquals(false, NumberUtil.isPrime(1000004));

        Assertions.assertEquals(true, NumberUtil.isPrime(2));

        Assertions.assertEquals(false, NumberUtil.isPrime(0));

        Assertions.assertEquals(false, NumberUtil.isPrime(121));
    }


    @Test
    public void isPrimeTest1()
    {
        Assertions.assertEquals(false, NumberUtil.isPrime(1000003)); //hata
        Assertions.assertEquals(false, NumberUtil.isPrime(1000004));

        Assertions.assertEquals(true, NumberUtil.isPrime(2));

        Assertions.assertEquals(false, NumberUtil.isPrime(0));

        Assertions.assertEquals(false, NumberUtil.isPrime(121));
    }

}
