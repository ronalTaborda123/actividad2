package com.second.task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.second.task.time.domain.TimeOfDay;
import com.second.task.time.serialization.HourAdapter;

@Configuration
public class GsonConfiguration {

    @Bean
    public Gson gson(){
        return  new GsonBuilder()
                .registerTypeAdapter(TimeOfDay.class, new HourAdapter())
                .create();
    }
}
