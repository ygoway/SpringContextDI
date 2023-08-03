package service;

import service.playerImpl.ClassicMusicPlayer;
import service.playerImpl.Player;
import service.playerImpl.RockMusicPlayer;


public class MusicPlayer {
    private Player allSongPlayer;
    private ClassicMusicPlayer classicMusicPlayer;
    private RockMusicPlayer rockMusicPlayer;

    public MusicPlayer(Player allSongPlayer, ClassicMusicPlayer classicMusicPlayer, RockMusicPlayer rockMusicPlayer) {
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
