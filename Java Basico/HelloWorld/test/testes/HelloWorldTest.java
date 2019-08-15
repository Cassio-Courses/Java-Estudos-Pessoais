/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassio
 */
public class HelloWorldTest {
    
    public HelloWorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void HelloWorld(){
         int num[] = {5,4,3,5,7,7,3,5,5,92,2,3039};
        int cc = 0;
        while (cc <  num.length){
            System.out.println(num[cc++]);
            
        }
        }
    }

