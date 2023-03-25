package service.playerImpl;

import Model.Music;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected List<Music> playlist = new ArrayList<>();

    public void downloadSongs() {
        playlist.add(new Music("Lady", "Modjo", true));
        playlist.add(new Music("Take On Me", "a-ha", true));
        playlist.add(new Music("Say it right", "Nelly Furtado", true));
        playlist.add(new Music("ZITTI E BUONI", "Måneskin", false));
        playlist.add(new Music("Dream on", "Aerosmith", false));
        playlist.add(new Music("Losing My Life", "Falling In Reverse", false));
    }

    public void play() {
        Player player = new Player();
        player.downloadSongs();
        for (Music song : player.playlist) {
            System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
        }
    }

}
