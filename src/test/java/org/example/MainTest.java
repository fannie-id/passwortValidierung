package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void when_password_less_than_8_char_output_false(){
        int len = 8;
        String pw = "fjkslwihbf";
        boolean result = Main.isLong(pw,len);
        assertTrue(result);
    }

    @Test
    void when_password_more_than_8_char_output_true(){
        int len = 8;
        String pw = "fjkf";
        boolean result = Main.isLong(pw,len);
        assertFalse(result);
    }
    @Test
    void when_password_has_num_output_true(){
        String pw = "fjs9kf";
        boolean result = Main.containsNum(pw);
        assertTrue(result);
    }

    @Test
    void when_password_has_Up_Low_Char_output_true(){
        String pw = "fjs9kfG";
        boolean result = Main.containsUpLow(pw);
        assertTrue(result);
    }
    @Test
    void when_password_bad_output_false(){
        String password ="fjaksa";
        int len = 8;
        boolean result = Main.isGoodPW(password,len);
        assertFalse(result);
    }


}