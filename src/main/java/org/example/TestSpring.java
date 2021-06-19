package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        /*Music music = context.getBean("someClassicalMusic", Music.class);
        Music musicC = context.getBean("someRockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayerC = new MusicPlayer(musicC);

        musicPlayer.playMusic();
        musicPlayerC.playMusic();
*/
        //Computer computer = context.getBean("computer", Computer.class);

       // System.out.println(computer.toString(GenresMusic.ROCK));
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic2);
        context.close();

    }
}
