package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromTest {
    @Test
    public void isPalindrom() {
        Palindrom.isPalindrome("abcdcba");
        Palindrom.isPalindrome("abcd");

    }
}