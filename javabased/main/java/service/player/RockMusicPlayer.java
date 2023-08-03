package service.player;

import model.Song;

import static model.MusicGenre.ROCK_MUSIC;

public class RockMusicPlayer extends MusicPlayer {

    @Override
    public void play () {
        for (Song song : playlist) {
            if(song.getMusicGenre().equals(ROCK_MUSIC)) {
                System.out.println("The name of song: " + song.getSongName() + ", performer: " + song.getPerformer());
            }
        }
    }
}
