package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double exp = 92;
        double output = Fit.idealWeight(input, Fit.Gender.MALE);
        assertThat(output).isEqualTo(exp, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double exp = 69;
        double out = Fit.idealWeight(in, Fit.Gender.FEMALE);
        assertThat(out).isEqualTo(exp, withPrecision(0.01));
    }
}