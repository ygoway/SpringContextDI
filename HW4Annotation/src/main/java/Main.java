import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playClassic();
        musicPlayer.playRock();
        context.close();
    }
}
