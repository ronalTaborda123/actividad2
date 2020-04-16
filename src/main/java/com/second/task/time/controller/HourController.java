package com.second.task.time.controller;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.task.configuration.TimeUnitConfiguration;
import com.second.task.time.domain.TimeOfDay;
import com.second.task.time.domain.Hour;
import com.second.task.time.domain.Minute;
import com.second.task.time.domain.Second;
import com.second.task.time.domain.TimeUnitEnum;

@RestController
@RequestMapping("/api/v1")
public class HourController {

    @Autowired
    TimeUnitConfiguration configuration;

    @GetMapping("/hora")
    public TimeOfDay getHora() {

        LocalTime date = LocalTime.now();
        Hour hour = Hour.of(date.getHour());
        Minute minute = Minute.of(date.getMinute());
        Second second = Second.of(date.getSecond());

        return TimeOfDay.from(hour, minute,second, TimeUnitEnum.fromTime(configuration.getTimeunit(), date));

    }

}

