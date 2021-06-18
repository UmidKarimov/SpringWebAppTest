package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private byte volume;
    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void printMusicList() {
        for (Music list:this.musicList) {
            System.out.println(list.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getVolume() {
        return volume;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
