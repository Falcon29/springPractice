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

public class RockMusic implements Music {
    private RockMusic() {} //ограничение создания объектов класса через new

    public static RockMusic getRockMusic() {
        return new RockMusic();         //если скоуп Синглтон, то объект будет использоваться каждый раз один и тот же
    }

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

    //Init method
    public void doMyInit() {
        System.out.println( "Initializing..." );
    }

    //Destroy method
    public void doMyDestroy() {
        System.out.println( "Ending..." );
    }
}
