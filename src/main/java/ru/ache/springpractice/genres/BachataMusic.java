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

package ru.ache.springpractice.genres;

import java.util.ArrayList;
import java.util.List;

import ru.ache.springpractice.Music;

public class BachataMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Te Amor");
        songs.add("Si Esta Casa Hablara");
        songs.add("Corazon");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
