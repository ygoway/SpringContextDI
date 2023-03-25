package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import service.playerImpl.ClassicMusicPlayer;
import service.playerImpl.Player;
import service.playerImpl.RockMusicPlayer;

@Component
public class MusicPlayer {
    private Player allSongPlayer;
    private ClassicMusicPlayer classicMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

    public MusicPlayer(@Qualifier("AllMusic")Player allSongPlayer, @Qualifier("ClassicMusic") ClassicMusicPlayer classicMusicPlayer,
                       @Qualifier("RockMusic") RockMusicPlayer rockMusicPlayer) {
        this.allSongPlayer = allSongPlayer;
        this.classicMusicPlayer = classicMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }


    public void playMusic() {
        allSongPlayer.play();
    }

    public void playClassic() {
        classicMusicPlayer.play();
    }

    public void playRock() {
        rockMusicPlayer.play();
    }
}