package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //Music beanMusic = context.getBean("musicBean",Music.class);
        //MusicPlayer player = new MusicPlayer(beanMusic);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getVolume());
        System.out.println(player.getName());
        player.printMusicList();
        context.close();

    }
}
