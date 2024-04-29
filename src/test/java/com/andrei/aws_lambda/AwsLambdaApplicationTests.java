package com.andrei.aws_lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AwsLambdaApplicationTests {

    @Test
    void shouldReturnHelloMessage() {
        HelloLambda sut = new HelloLambda();
        assertEquals("Hello Lambda!", sut.helloLambda());
    }

}
