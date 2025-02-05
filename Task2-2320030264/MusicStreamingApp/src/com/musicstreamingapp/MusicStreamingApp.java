package com.musicstreamingapp;

public class MusicStreamingApp {
    public static void main(String[] args) {
       
        LocalFilePlayer localFilePlayer = new LocalFilePlayer();
        MusicSource localSource = new LocalFileAdapter(localFilePlayer);
        
        MusicPlayer player = new BasicMusicPlayer(localSource);
        
        player = new EqualizerDecorator(player);
        player = new VolumeControlDecorator(player);

       
        player.playMusic();
        player.stopMusic();
    }
}
