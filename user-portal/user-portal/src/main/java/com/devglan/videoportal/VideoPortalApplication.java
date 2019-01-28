package com.devglan.videoportal;

import com.devglan.userportal.UserPortalApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideoPortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.devglan.videoportal.VideoPortalApplication.class, args);
        //SpringApplication.run(UserPortalApplication.class, args);
    }
}
