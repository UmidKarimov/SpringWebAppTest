package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> songs = new ArrayList<String>() ;
    {
        songs.add("Wind cries mary");
        songs.add("ArcticMonkey Beethoven");
        songs.add("Rock Mozart");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
