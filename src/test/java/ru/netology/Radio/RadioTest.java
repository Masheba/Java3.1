package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {


    @Test
    public void shouldChangeNextStationConstructor() {
        Radio radio = new Radio( 0, 100, 21, 20, 50);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected =0 ;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCheckNumberOfStations(){
        Radio radio= new Radio();
        radio.setNumberOfStations(30);
        int actual =30;
        int expected = radio.getNumberOfStations();
        assertEquals(actual,expected);
    }



    @Test
    public void shouldTestWithNoStations(){
        Radio radio= new Radio();
        radio.setCurrentStation(7);
        radio.setNumberOfStations(10);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected=8;
        assertEquals(actual,expected);


    }

    @Test
    public void shouldChangePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(actual, expected);

    }


    @Test
    public void shouldCheckMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(actual, expected);


    }

    @Test
    public void shouldCheckMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 81;
        assertEquals(actual, expected);

    }


    @Test
    public void shouldDecreaseVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(48);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 47;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCheckMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);

    }


    @Test
    public void shouldCheckMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(actual, expected);

    }


}
