package service.playerImpl;

import Model.Music;

public class RockMusicPlayer extends Player{

    @Override
    public void play () {
        RockMusicPlayer rockMusicPlayer = new RockMusicPlayer();
        rockMusicPlayer.downloadSongs();
        for (Music song : rockMusicPlayer.playlist) {
            if(!song.isClassicMusic) {
                System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
            }
        }
    }
}
