package com.example.receiver.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({CustomSink.class})
public class CloudConfig {
}
