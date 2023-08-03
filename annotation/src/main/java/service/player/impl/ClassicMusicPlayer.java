package service.player.impl;

import lombok.Getter;
import model.Song;
import org.springframework.stereotype.Component;
import service.player.MusicPlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.MusicGenre.CLASSIC_MUSIC;

@Component("ClassicMusic")
@Getter
public class ClassicMusicPlayer implements MusicPlayer {

    private List<Song> classicSongs = new ArrayList<>(Arrays.asList(
            new Song("Lady", "Modjo", CLASSIC_MUSIC),
            new Song("Take On Me", "a-ha", CLASSIC_MUSIC),
            new Song("Say it right", "Nelly Furtado", CLASSIC_MUSIC)
    ));

    public void playMusic() {
        for (Song song : classicSongs) {
            System.out.println("The name of song; " + song.getSongName() + ", performer : " + song.getPerformer());
        }
    }
}
