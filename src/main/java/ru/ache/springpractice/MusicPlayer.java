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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private SalsaMusic salsaMusic;
    private TimbaMusic timbaMusic;
    //@Autowired //внедрение зависимости через поле
    private Music music;

    @Autowired
    public MusicPlayer(SalsaMusic salsaMusic, TimbaMusic timbaMusic) {
        this.salsaMusic = salsaMusic;
        this.timbaMusic = timbaMusic;
    }

    /** урок 10 ч.1
    //Spring будет искать класс, помеченный Компонент
    @Autowired
    public MusicPlayer(SalsaMusic salsaMusic) {
        this.salsaMusic = salsaMusic;
    }

    public void playMusic() {
        System.out.println( "Playing: " + salsaMusic.getSong() );
    }
    **/

    /** Lesson 10 p.1 - внедрение зависимости через конструктор и через сеттер
    //@Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
     **/

    public String playMusic() {
        //System.out.println( "Playing: " + salsaMusic.getSong() );
        //System.out.println( "Playing: " + timbaMusic.getSong() );
        return "Playing: " + salsaMusic.getSong();
    }

    /** LESSONS 1-9
    private Music music;
    private String name;
    private int volume;
    private int queue;

    private List<Music> musicList = new ArrayList<>();

    //IoC
    public MusicPlayer( Music music ) {
        this.music = music;
    }

    //DI
    public MusicPlayer() {}

    public void setMusic( Music music ) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume( int volume ) {
        this.volume = volume;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue( int queue ) {
        this.queue = queue;
    }

    public void setMusicList( List<Music> musicList ) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println( "Playing... : " + music.getSong() );
    }

    public void playAllMusic() {
        for ( Music song : musicList ) {
            System.out.println( "Playing : " + song );
        }
    }
     LESSONS 1-9 **/
}
