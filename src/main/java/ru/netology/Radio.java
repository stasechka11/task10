package ru.netology;

public class Radio {
    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minChannel | newCurrentChannel > maxChannel)
            return;
        currentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (getCurrentChannel() == maxChannel) {
            currentChannel = minChannel;
        } else {
            setCurrentChannel(getCurrentChannel() + 1);
        }
    }

    public void prevChannel() {
        if (getCurrentChannel() == minChannel) {
            currentChannel = maxChannel;
        } else {
            setCurrentChannel(getCurrentChannel() - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
    }

    public void increaseVolumeOneLevel() {
        if (getCurrentVolume() < maxVolume) {
            currentVolume = getCurrentVolume() + 1;
        }
    }

    public void decreaseVolumeOneLevel() {
        if (getCurrentVolume() > minVolume) {
            currentVolume = getCurrentVolume() - 1;
        }
    }

}
