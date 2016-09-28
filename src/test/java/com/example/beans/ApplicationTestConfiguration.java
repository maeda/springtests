package com.example.beans;

import com.example.ApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ApplicationConfiguration.class})
public class ApplicationTestConfiguration {

}
