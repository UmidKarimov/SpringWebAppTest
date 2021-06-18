package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {

    private ClassicalMusic Cmusic;
    private RockMusic Rmusic;

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
@Autowired
    public MusicPlayer(ClassicalMusic musicC, RockMusic musicR) {
        this.Cmusic = musicC;
        this.Rmusic = musicR;

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
        System.out.println("Playing " + Cmusic.getSong());
        System.out.println("Playing " + Rmusic.getSong());

    }

}
