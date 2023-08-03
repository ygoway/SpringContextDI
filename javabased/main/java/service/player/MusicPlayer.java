package service.player;

import model.Song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.MusicGenre.CLASSIC_MUSIC;
import static model.MusicGenre.ROCK_MUSIC;

public class MusicPlayer {
    protected List<Song> playlist = new ArrayList<>(Arrays.asList(
            new Song("Lady", "Modjo", CLASSIC_MUSIC),
            new Song("Take On Me", "a-ha", CLASSIC_MUSIC),
            new Song("Say it right", "Nelly Furtado", CLASSIC_MUSIC),
            new Song("ZITTI E BUONI", "Måneskin", ROCK_MUSIC),
            new Song("Dream on", "Aerosmith", ROCK_MUSIC),
            new Song("Losing My Life", "Falling In Reverse", ROCK_MUSIC))
    );

    public void play() {
        for (Song song : playlist) {
            System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
        }
    }

}

