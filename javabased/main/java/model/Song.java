package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Song {
    private String songName;
    private String performer;
    private MusicGenre musicGenre;

    @Override
    public String toString() {
        return "Music{" +
                "songName is: '" + songName + '\'' +
                ", performer is: '" + performer +
                '}';
    }
}
