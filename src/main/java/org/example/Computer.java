package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;

    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    public String toString(GenresMusic genresMusic) {
        musicPlayer.playMusic(genresMusic);
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + (musicPlayer==null) +
                '}';
    }
}
