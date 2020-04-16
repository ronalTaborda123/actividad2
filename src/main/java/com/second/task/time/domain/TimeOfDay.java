package com.second.task.time.domain;

import com.second.task.time.domain.Hour;
import com.second.task.time.domain.Minute;
import com.second.task.time.domain.Second;
import lombok.Value;


@Value(staticConstructor = "from")
public class TimeOfDay {

    Hour hour;
    Minute minute;
    Second second;
    Long  quantityFromMidnight;

}
