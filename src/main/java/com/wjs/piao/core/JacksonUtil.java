package com.wjs.piao.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JacksonUtil {
    public static ObjectMapper objectMapper;

    public static String toJSONString(Object object) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try{
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
