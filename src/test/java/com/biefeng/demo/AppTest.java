package com.biefeng.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testHashMap() {
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","大苏打");
        map.get("a");
        System.out.println(3&2);
    }
}
