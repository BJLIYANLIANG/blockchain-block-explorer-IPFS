package io.hs.bex.web.config.json;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class JacksonConfig 
{
    @Bean
    public ObjectMapper objectMapper() 
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper;
    }
}