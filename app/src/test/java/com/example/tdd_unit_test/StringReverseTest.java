package com.example.tdd_unit_test;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringReverseTest {

    StringReverse SUT;
    @Before
    public void setUp() throws Exception {
        SUT=new StringReverse();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned() {
        String result=SUT.reverse("");
        assertThat(result,is(""));
    }

    @Test
    public void reverse_singleCharacter_sameStringReturned() {
        String result=SUT.reverse("s");
        assertThat(result,is("s"));
    }

    @Test
    public void reverse_longString_reverseStringReturned() {
        String result=SUT.reverse("Moniruzzaman Shadhin");
        assertThat(result,is("nihdahS namazzurinoM"));
    }
}