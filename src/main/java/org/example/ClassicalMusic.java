package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    private List<String> songs = new ArrayList<String>() ;
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Hungarian Beethoven");
        songs.add("Hungarian Mozart");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }

    public void myInit (){
        System.out.println("doing init staff");
    }

    public void myDestroy (){
        System.out.println("doing destroy staff");
    }
}
