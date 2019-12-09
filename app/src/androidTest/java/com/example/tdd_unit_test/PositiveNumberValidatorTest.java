package com.example.tdd_unit_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PositiveNumberValidatorTest {
    PositiveNumberValidator SUT;
    @Before
    public void setUp() throws Exception {
        SUT=new PositiveNumberValidator();
    }

    @Test
    public void test1() {
        boolean result=SUT.isPositive(-1);
        Assert.assertThat(result,is(false));
    }
}