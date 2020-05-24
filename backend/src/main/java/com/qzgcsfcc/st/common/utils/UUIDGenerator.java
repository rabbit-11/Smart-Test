package com.qzgcsfcc.st.common.utils;

import java.util.UUID;

public class UUIDGenerator {

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String temp = str.substring(0, 6);
        return temp;
    }

}

