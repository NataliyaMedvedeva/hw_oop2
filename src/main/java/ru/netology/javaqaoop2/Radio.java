package ru.netology.javaqaoop2;

public class Radio {
    public int currentVolume;
    public int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
//            newCurrentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            setToMaxVolume();
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }

    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > 9) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setToMaxChannel() {
        currentChannel = 9;
    }

    public void setToMinChannel() {
        currentChannel = 0;
    }

    public void NextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        }
        else {
            setToMinChannel();
        }
    }

    public void prevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
        else {
            setToMaxChannel();
        }

    }




}
