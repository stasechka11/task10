package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0)
            return;
        if (newCurrentChannel > 9)
            return;
        currentChannel = newCurrentChannel;
    }

}
