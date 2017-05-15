package org.shengnian.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by cheng on 2017/5/15.
 */
@SpringBootTest(classes = GradleApp.class)
@RunWith(SpringRunner.class)
public class HelloServiceUnitTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void assertHello() {
        assertThat(helloService.hello1("hello")).isTrue();
    }

}
