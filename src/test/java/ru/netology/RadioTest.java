package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldCreateDefaultRadio() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getChannelsQuantity());
        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(9, radio.getMaxChannel());
    }

    @Test
    public void shouldCreateRadioCustomQuantityChannels() {
        Radio radio = new Radio(30);

        Assertions.assertEquals(30, radio.getChannelsQuantity());
        Assertions.assertEquals(0, radio.getMinChannel());
        Assertions.assertEquals(29, radio.getMaxChannel());
    }

    @Test
    public void shouldSetChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(3);

        int expected = 3;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelToMin() {
        Radio radio = new Radio();

        radio.setCurrentChannel(0);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelToMax() {
        Radio radio = new Radio(20);

        radio.setCurrentChannel(19);

        int expected = 19;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(5);
        radio.nextChannel();

        int expected = 6;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextChannelToMinWhenMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(2);
        radio.prevChannel();

        int expected = 1;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchChannelToMaxWhenMin() {
        Radio radio = new Radio(15);

        radio.setCurrentChannel(0);
        radio.prevChannel();

        int expected = 14;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelLessMin() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-1);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(10);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolumeOneLevel();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setMaxVolume();
        radio.increaseVolumeOneLevel();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOneLevel() {
        Radio radio = new Radio();

        radio.setMaxVolume();
        radio.decreaseVolumeOneLevel();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLessMin() {
        Radio radio = new Radio();

        radio.setMinVolume();
        radio.decreaseVolumeOneLevel();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}