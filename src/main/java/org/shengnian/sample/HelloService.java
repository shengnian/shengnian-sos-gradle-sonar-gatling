package org.shengnian.sample;

import org.springframework.stereotype.Service;

/**
 * Created by cheng on 2017/5/15.
 */

@Service
public class HelloService {
    public boolean hello1 (String string) {
        for(int i = 0; i < 10; i ++) {
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
        }

        return true;
    }

    public boolean hello2 (String string) {
        for(int i = 0; i < 10; i ++) {
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
            System.out.println( "Hello " + i);
        }

        return true;
    }
}
