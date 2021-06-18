package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void myInit (){
        System.out.println("doing init staff");
    }

    public void myDestroy (){
        System.out.println("doing destroy staff");
    }
}
