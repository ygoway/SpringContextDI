import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.player.MusicPlayer;
import service.player.impl.ClassicMusicPlayer;
import service.player.impl.RockMusicPlayer;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjConfig.class);

        MusicPlayer rockMusicPlayer = context.getBean(RockMusicPlayer.class);
        rockMusicPlayer.playMusic();

        MusicPlayer classicMusicPlayer = context.getBean(ClassicMusicPlayer.class);
        classicMusicPlayer.playMusic();

        context.close();
    }
}
