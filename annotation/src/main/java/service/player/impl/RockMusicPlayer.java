package service.player.impl;

import lombok.Getter;
import model.Song;
import org.springframework.stereotype.Component;
import service.player.MusicPlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.MusicGenre.ROCK_MUSIC;

@Component("RockMusic")
@Getter
public class RockMusicPlayer implements MusicPlayer {

    private List<Song> rockSongs = new ArrayList<>(Arrays.asList(
            new Song("ZITTI E BUONI", "Måneskin", ROCK_MUSIC),
            new Song("Dream on", "Aerosmith", ROCK_MUSIC),
            new Song("Losing My Life", "Falling In Reverse", ROCK_MUSIC)
    ));

    public void playMusic() {
        for (Song song : rockSongs) {
            System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
        }
    }
}
