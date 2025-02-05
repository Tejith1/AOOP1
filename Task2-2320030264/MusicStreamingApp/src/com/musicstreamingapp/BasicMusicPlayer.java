package com.musicstreamingapp;

public class BasicMusicPlayer extends MusicPlayer {

    public BasicMusicPlayer(MusicSource source) {
        super(source);
    }

    @Override
    public void playMusic() {
        System.out.println(source.getSourceInfo());
        source.play();
    }

    @Override
    public void stopMusic() {
        source.stop();
    }
}