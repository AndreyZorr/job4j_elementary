package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DivideBySixTest {
    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Ishodnoe chislo delitsa na 3, no ne yawlaetsa chotnim.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "Ishodnoe chislo delitsa na 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Ishodnoe chislo ne delitsa na 3, no yawlaetsa chotnim.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "Ishodnoe chislo delitsa na 3, no ne yawlaetsa chotnim.";
        assertThat(result).isEqualTo(expected);
    }
}
