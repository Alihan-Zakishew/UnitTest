package com.zak;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    @BeforeEach

    @Test
    void getClassFields() {
        Field[] fields = Phone.class.getDeclaredFields();
        List<String> string = new ArrayList<>();
        for(Field f: fields) {
            if(f.trySetAccessible()) {
                string.add(f.getName());
            }
        }
        assertTrue(string.contains("id"));
        assertTrue(string.contains("NumberCard"));
        assertTrue(string.contains("Debit"));
    }
}