package ru.netology;

public class Radio {
    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentVolume;

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

}
