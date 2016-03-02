/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam
 */
public class JavaApplication1Test {
    
 

    /**
     * Test of test method, of class JavaApplication1.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        JavaApplication1 instance = new JavaApplication1();
        assertEquals("Failed", "lel", instance.test());
    }
    
}
