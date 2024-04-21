package com.quoc.store.vuahanghieu.configs;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class MessageUtil {
    public static class CategoryMessage {
        public static Map<String, String> deletedSuccessfullyMessage = new HashMap<>() {{
            put("message", "Delete category successfully !!!");
            put("status", HttpStatus.OK.toString());
        }};

    }
}
