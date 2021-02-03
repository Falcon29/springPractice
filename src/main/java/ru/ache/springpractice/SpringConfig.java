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

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.ache.springpractice")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public SalsaMusic salsaMusic() {
        return new SalsaMusic();
    }

    @Bean
    public TimbaMusic timbaMusic() {
        return new TimbaMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer( salsaMusic(), timbaMusic() );
    }

    @Bean
    public Computer computer() {
        return new Computer( musicPlayer() );
    }
}
