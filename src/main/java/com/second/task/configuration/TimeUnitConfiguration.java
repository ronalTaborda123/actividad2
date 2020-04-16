package com.second.task.configuration;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.second.task.time.domain.TimeUnitEnum;
import lombok.Data;

@Component
@ConfigurationProperties(prefix = "textstring")
@Data
public class TimeUnitConfiguration {

    TimeUnitEnum timeunit;

}
