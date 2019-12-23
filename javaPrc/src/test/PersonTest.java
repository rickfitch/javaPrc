package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * PersonTest
 */
public class PersonTest {

    @Test
    public void testTheTest(){
        assertTrue("test passed", true);
    }
    @Test
    public void testTheTest2(){
        assertTrue("test failed", false);
    }
}