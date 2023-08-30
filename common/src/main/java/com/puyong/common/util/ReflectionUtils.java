package com.puyong.common.util;

import java.lang.reflect.Field;
import java.util.Objects;

public class ReflectionUtils {

    public static Object getFieldVal(Object obj, String fieldName) throws IllegalAccessException {
        for (Field field : obj.getClass().getFields()) {
            if (Objects.equals(field.getName(), fieldName)) {
                field.setAccessible(true);
                return field.get(obj);
            }
        }
        return null;
    }
}
