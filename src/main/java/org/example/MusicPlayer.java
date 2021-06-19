package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.music1 = classicalMusic;
        this.music2 = rockMusic;
    }

    public void playMusic(GenresMusic genresMusic) {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        String forPrint;

        if (genresMusic == GenresMusic.CLASSICAL)
            forPrint = music1.getSongs().get(randomNum);
        else
            forPrint = music2.getSongs().get(randomNum);

        System.out.println(forPrint);

    }

}
