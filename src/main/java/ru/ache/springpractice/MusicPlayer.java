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

public class MusicPlayer {
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
}
