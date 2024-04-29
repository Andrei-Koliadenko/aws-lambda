package com.andrei.aws_lambda.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.stereotype.Component;

@Component
public class AwsLambda implements RequestHandler<String,String> {

    public String handleRequest(String fileName, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("AWS lambda is running");
        return fileName.toUpperCase();
    }
}
