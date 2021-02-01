/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2021 Sony Network Entertainment International, LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sony Network Entertainment International, LLC.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with
 * Sony Network Entertainment International, LLC.
 *
 * =======================================================================
 *
 * For more information, please see http://www.sony.com/SCA/outline/corporation.shtml
 *
 */

package ru.ache.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean( "musicBean", Music.class );
        //Music musicJazz = context.getBean( "jazzMusicBean", Music.class );
        //MusicPlayer musicPlayer = new MusicPlayer( music );
        //MusicPlayer musicPlayerJazz = new MusicPlayer( musicJazz );

        //Singleton
        MusicPlayer musicPlayer = context.getBean( "musicPlayer", MusicPlayer.class );
        MusicPlayer secondMusicPlayer = context.getBean( "musicPlayer", MusicPlayer.class );

        System.out.println( musicPlayer == secondMusicPlayer ); //true
        musicPlayer.setVolume( 10 );
        secondMusicPlayer.getVolume(); //10 'cause SINGLETON

        musicPlayer.playMusic();
        //musicPlayerJazz.playMusic();
        System.out.println( musicPlayer.getName() );
        System.out.println( musicPlayer.getVolume() );
        System.out.println( musicPlayer.getQueue() );

        //Prototype
        MusicPlayer musicPlayerProto = context.getBean( "musicPlayerPrototype", MusicPlayer.class );
        MusicPlayer secondMusicPlayerProto = context.getBean( "musicPlayerPrototype", MusicPlayer.class );

        System.out.println( musicPlayerProto == secondMusicPlayerProto ); //false
        musicPlayerProto.setVolume( 10 );
        musicPlayerProto.getVolume();  //10 'cause Prototype
        secondMusicPlayerProto.getVolume();  //50 'cause Prototype and setted in properties/appContext.xml

        //Lifecycle of bean
        RockMusic rockMusic = context.getBean( "musicBean", RockMusic.class );

        System.out.println( rockMusic.getSong() );

        context.close();
    }
}
