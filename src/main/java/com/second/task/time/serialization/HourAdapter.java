package com.second.task.time.serialization;

import java.lang.reflect.Type;

import com.google.gson.*;
import com.second.task.time.domain.TimeOfDay;

public class HourAdapter implements JsonSerializer<TimeOfDay> {


    @Override
    public JsonElement serialize(TimeOfDay timeOfDay, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonMerchant = new JsonObject();

        jsonMerchant.addProperty("Hour", timeOfDay.getHour().getValue());
        jsonMerchant.addProperty("Minute", timeOfDay.getMinute().getValue());
        jsonMerchant.addProperty("Second", timeOfDay.getSecond().getValue());
        jsonMerchant.addProperty("QuantityFromMidnight", timeOfDay.getQuantityFromMidnight());
        return jsonMerchant;
    }
}
