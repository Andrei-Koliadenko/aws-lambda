package com.andrei.aws_lambda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AwsLambdaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldReturnHelloMessage() {
        HelloLambda sut = new HelloLambda();
        assertEquals("Hello Lambda!", sut.helloLambda());
    }

}
