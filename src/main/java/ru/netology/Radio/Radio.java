package ru.netology.Radio;

public class Radio {
    public int minStation = 0;
    public int maxStation = 9;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentStation;
    public int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolumeLevel) {

        currentVolume = newVolumeLevel;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 10) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        currentStation = newCurrentStation;
    }


    public void nextStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = minStation;
        }

    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = maxStation;
        }

    }


}









