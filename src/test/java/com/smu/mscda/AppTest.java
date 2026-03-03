package com.smu.mscda;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.apache.commons.text.WordUtils;
import org.apache.commons.codec.digest.DigestUtils;

public class AppTest {

    @Test
    public void testCapitalizeString() {
        String input = "hello world";
        String expected = "Hello World";
        String result = WordUtils.capitalize(input);
        assertEquals(expected, result);
    }

    @Test
    public void testMd5Hex() {
        String input = "hello world";
        String expected = "5eb63bbbe01eeed093cb22bb8f5acdc3";
        String result = DigestUtils.md5Hex(input);
        assertEquals(expected, result);
    }
}
