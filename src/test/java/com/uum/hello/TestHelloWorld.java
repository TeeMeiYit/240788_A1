
package com.uum.hello;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
    @Test
    
    public void testHello(){
         HelloWorld hw = new HelloWorld();
         hw.sayHello("zhamri");
         Assert.assertEquals("Hello zhamri", "Hello zhamri");
        
    }
}
