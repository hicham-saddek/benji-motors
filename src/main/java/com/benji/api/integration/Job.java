package com.benji.api.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Job {
    @Scheduled(cron = "${scheduled-hello:* * * * * *}")
    public void hello() {
        log.info("Hello world");
    }
}
