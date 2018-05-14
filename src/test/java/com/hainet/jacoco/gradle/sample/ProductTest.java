package com.hainet.jacoco.gradle.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProductTest {

    @Test
    public void coveredTest() {
        assertThat(Product.covered(), is("Covered"));
    }
}
