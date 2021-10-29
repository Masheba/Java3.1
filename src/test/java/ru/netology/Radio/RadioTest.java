package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldChangeNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldChangePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 7;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldDecreaseVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(actual, expected);

    }
}
