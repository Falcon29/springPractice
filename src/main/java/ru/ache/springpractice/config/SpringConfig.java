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

package ru.ache.springpractice.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import ru.ache.springpractice.Computer;
import ru.ache.springpractice.Music;
import ru.ache.springpractice.MusicPlayer;
import ru.ache.springpractice.genres.BachataMusic;
import ru.ache.springpractice.genres.SalsaMusic;
import ru.ache.springpractice.genres.TimbaMusic;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public SalsaMusic salsaMusic() {
        return new SalsaMusic();
    }

    @Bean
    public TimbaMusic timbaMusic() {
        return new TimbaMusic();
    }

    @Bean
    public BachataMusic bachataMusic() {
        return new BachataMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(salsaMusic(), timbaMusic(), bachataMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
