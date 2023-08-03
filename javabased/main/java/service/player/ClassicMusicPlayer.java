package service.player;

import model.Song;

import static model.MusicGenre.CLASSIC_MUSIC;

public class ClassicMusicPlayer extends MusicPlayer {

    @Override
    public void play () {
        for (Song song : playlist) {
            if(song.getMusicGenre().equals(CLASSIC_MUSIC)) {
                System.out.println("The name of song; " + song.getSongName() + ", performer : " + song.getPerformer());
            }
        }
    }
}
