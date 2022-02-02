package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {
    Radio radio = new Radio(15);

    @Test
    public void setCurrentStation() {
        int expected = 14;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void setCurrentStationOutLimit() {
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        int expected = 85;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentVolume(110);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeNextStationLimit() {
        radio.setCurrentStation(13);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationLimit() {
        radio.setCurrentStation(10);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStationMax() {
        radio.setCurrentStation(14);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationMin() {
        radio.setCurrentStation(0);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }


    @Test
    public void shouldIncreaseVolumeLevelLimit() {
        radio.setCurrentVolume(50);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeLevelLimit() {
        radio.setCurrentVolume(50);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeLevelMax() {
        radio.setCurrentVolume(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeLevelMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeNextStationOutLimit() {
        radio.setCurrentStation(16);
        int currentStation = radio.nextStation();
        radio.setCurrentStation(currentStation);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStationOutLimit() {
        radio.setCurrentStation(-1);
        int currentStation = radio.prevStation();
        radio.setCurrentStation(currentStation);
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolumeLevelOutLimit() {
        radio.setCurrentVolume(110);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeLevelOutLimit() {
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }
}
