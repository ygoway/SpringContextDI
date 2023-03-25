package service.musicPlayerImpl;

import model.Music;

public class ClassicMusicPlayer extends Player{

    @Override
    public void play () {
        ClassicMusicPlayer classicPlayer = new ClassicMusicPlayer();
        classicPlayer.downloadSongs();
        for (Music music : classicPlayer.playlist) {
            if(music.isClassicMusic) {
                System.out.println("The name of song; " + music.getSongName() + ", performer : " + music.getPerformer());
            }
        }
    }
}
