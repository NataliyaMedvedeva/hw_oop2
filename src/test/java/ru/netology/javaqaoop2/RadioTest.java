package ru.netology.javaqaoop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolumeOneMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOneLessMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);

        radio.increaseVolume();

        int expected = 57;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMIn() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(0);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(10);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-1);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelByOne() {
        Radio radio = new Radio();
        radio.setCurrentChannel(2);

        radio.NextChannel();

        int expected = 3;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelAtMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        radio.NextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void prevChannelByOne() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);

        radio.prevChannel();

        int expected = 4;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannelAtMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }
}
