package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {
    private String songName;
    private String performer;
    public boolean isClassicMusic;


    @Override
    public String toString() {
        return "Music{" +
                "songName is: '" + songName + '\'' +
                ", performer is: '" + performer +
                '}';
    }
}
