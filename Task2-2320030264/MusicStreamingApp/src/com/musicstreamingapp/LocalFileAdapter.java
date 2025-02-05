package com.musicstreamingapp;

public class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play() {
        localFilePlayer.startPlaying();
    }

    @Override
    public void stop() {
        localFilePlayer.stopPlaying();
    }

    @Override
    public String getSourceInfo() {
        return "Playing from Local Files";
    }
}
