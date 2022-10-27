package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromTest {

    @Test
    void isPalindrome() {
        String str = "abcdcba";
        boolean result = Palindrom.isPalindrome(str);
        assertThat(result).isTrue();
    }

    @Test
    void isPalindromeNo() {
        String str = "abcd";
        boolean result = Palindrom.isPalindrome(str);
        assertThat(result).isFalse();
    }

}