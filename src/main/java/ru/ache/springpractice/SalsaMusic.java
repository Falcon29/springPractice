package ru.ache.springpractice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class SalsaMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Salsa Vitamina");
        songs.add("El Taru");
        songs.add("Nino");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
