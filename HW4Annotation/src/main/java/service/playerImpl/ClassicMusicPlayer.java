package service.playerImpl;

import model.Music;
import org.springframework.stereotype.Component;

@Component("ClassicMusic")
public class ClassicMusicPlayer extends Player{

    @Override
    public void play () {
        for (Music music : playlist) {
            if(music.isClassicMusic) {
                System.out.println("The name of song; " + music.getSongName() + ", performer : " + music.getPerformer());
            }
        }
    }
}
