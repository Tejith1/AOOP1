package com.musicstreamingapp;

public abstract class MusicPlayer {
    protected MusicSource source;

    public MusicPlayer(MusicSource source) {
        this.source = source;
    }

    public abstract void playMusic();
    public abstract void stopMusic();
}