package com.musicstreamingapp;

public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    private void setEqualizer() {
        System.out.println("Equalizer set to pop mode.");
    }

    @Override
    public void playMusic() {
        setEqualizer();
        super.playMusic();
    }
}