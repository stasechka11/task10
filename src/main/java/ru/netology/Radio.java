package ru.netology;

import lombok.Getter;

public class Radio {
    @Getter
    private int channelsQuantity;
    @Getter
    private int minChannel;
    @Getter
    private int maxChannel;
    @Getter
    private int currentChannel;
    @Getter
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.channelsQuantity = 10;
        this.minChannel = 0;
        this.maxChannel = this.channelsQuantity - 1;
    }

    public Radio(int channelsQuantity) {
        this.channelsQuantity = channelsQuantity;
        this.minChannel = 0;
        this.maxChannel = channelsQuantity - 1;
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
