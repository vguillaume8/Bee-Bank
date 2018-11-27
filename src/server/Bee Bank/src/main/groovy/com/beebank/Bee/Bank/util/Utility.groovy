package com.beebank.Bee.Bank.util

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper

class Utility {

    static String serialize(Object object) {

        try {

            return new ObjectMapper().writeValueAsString(object)

        } catch (JsonProcessingException e) {

            throw new RuntimeException("Could not serialize object", e)
        }
    }
}
