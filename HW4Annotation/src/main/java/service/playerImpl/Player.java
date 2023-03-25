package service.playerImpl;

import model.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("AllMusic")
public class Player {
    protected List<Music> playlist = new ArrayList<>();

    public Player () {    // Can use empty constructor with @Autowired annotation
        downloadSongs();  // Can use config constr without @Autowired
    }

    public void downloadSongs () {
        playlist.add(new Music("Lady", "Modjo", true));
        playlist.add(new Music("Take On Me", "a-ha", true));
        playlist.add(new Music("Say it right", "Nelly Furtado", true));
        playlist.add(new Music("ZITTI E BUONI", "Måneskin", false));
        playlist.add(new Music("Dream on", "Aerosmith", false));
        playlist.add(new Music("Losing My Life", "Falling In Reverse", false));
    }

    public void play () {
        for (Music song : playlist) {
            System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
        }
    }

}
