package com.Bhan.webserver;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials =
                new BasicAWSCredentials("AKIA5HTCGU2EDU6MPND3", "bHND4D7vb4QzUGaIEvAxJkgOIU/wUp4mDwUAdSjc");
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("us-east-1")
                .build();

    }
}