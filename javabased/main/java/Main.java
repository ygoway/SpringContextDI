import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import service.player.ClassicMusicPlayer;
import service.player.MusicPlayer;
import service.player.RockMusicPlayer;


public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        MusicPlayer player = context.getBean("AllSongs", MusicPlayer.class);
        player.play();
        System.out.println();

        MusicPlayer classicPlayer = context.getBean("ClassicSongs", ClassicMusicPlayer.class);
        classicPlayer.play();
        System.out.println();

        MusicPlayer rockPlayer = context.getBean("RockSongs", RockMusicPlayer.class);
        rockPlayer.play();
        System.out.println();

        context.close();
    }

}