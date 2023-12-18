package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldSetChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(3);

        int expected = 3;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

}