package com.musicstreamingapp;

public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    private void adjustVolume() {
        System.out.println("Volume set to 75%");
    }

    @Override
    public void playMusic() {
        adjustVolume();
        super.playMusic();
    }
}