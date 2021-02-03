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

import org.springframework.stereotype.Component;

//@Component
public class TimbaMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Mi Chula");
        songs.add("Historia Vernadera");
        songs.add("Pasaporte");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
