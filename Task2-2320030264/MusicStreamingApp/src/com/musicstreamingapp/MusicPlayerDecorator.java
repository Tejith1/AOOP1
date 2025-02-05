package com.musicstreamingapp;

public abstract class MusicPlayerDecorator extends MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.source);
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void playMusic() {
        decoratedPlayer.playMusic();
    }

    @Override
    public void stopMusic() {
        decoratedPlayer.stopMusic();
    }
}
