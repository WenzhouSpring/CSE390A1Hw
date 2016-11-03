package org.cse333.bing2013.cse390a1_hw;

import java.util.Random;

/**
 * Created by bing2013 on 11/2/16.
 */

public class FooFactory {
    public FooObject createFoo(){
        Random random = new Random();
        int semiRandomInt = random.nextInt(500);
        FooObject result = new FooObject();
        result.name = "I am semi-random Foo #" + semiRandomInt;
        return result;
    }
}
