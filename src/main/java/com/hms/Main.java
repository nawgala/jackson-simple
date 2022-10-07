package com.hms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\n" +
                "  \"id\": 1,\n" +
                "  \"itemName\": \"theItem\",\n" +
                "  \"owner\": {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"theUser\"\n" +
                "  }\n" +
                "}";
        Item itemWithOwner = new ObjectMapper().readValue(json, Item.class);

        System.out.println(itemWithOwner);
    }
}
