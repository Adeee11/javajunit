package com.calculator.testcase;  
  
import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
package com.calculator.calc;
  
public class TestCase {  
  
 
    @Test  
    public void testSum(){  
        System.out.println("test case find sum");  
        assertEquals(3,Calculator.calculate(1,2, '+'));  
      
    }  
    @Test  
    public void testMinus(){  
        System.out.println("test case find difference");  
        assertEquals(-1,Calculator.calculate(1,2, '-'));  
      
    }  
    @Test  
    public void testMul(){  
        System.out.println("test case find mul");  
        assertEquals(2,Calculator.calculate(1,2, '*'));  
      
    }  

    @Test  
    public void testDiv(){  
        System.out.println("test case find div");  
        assertEquals(0.5,Calculator.calculate(1,2, '/'));  
      
    }  
  
  
}  