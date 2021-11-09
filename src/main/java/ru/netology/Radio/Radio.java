package ru.netology.Radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int numberOfStations;
    private int currentVolume;

    public Radio(int minVolume, int maxVolume, int currentStation, int numberOfStations, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentStation = currentStation;
        this.numberOfStations = numberOfStations;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int newNumberOfStations) {
        numberOfStations = newNumberOfStations;
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolumeLevel) {

        currentVolume = newVolumeLevel;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
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
        return;

    }


    public void nextStation() {

        if (currentStation < numberOfStations) {
            currentStation = currentStation + 1;
        }
        if (currentStation > numberOfStations) {
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









