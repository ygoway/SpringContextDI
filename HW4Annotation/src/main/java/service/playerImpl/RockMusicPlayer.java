package service.playerImpl;

import model.Music;
import org.springframework.stereotype.Component;

@Component("RockMusic")
public class RockMusicPlayer extends Player{

    @Override
    public void play () {
        for (Music song : playlist) {
            if(!song.isClassicMusic) {
                System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
            }
        }
    }
}
