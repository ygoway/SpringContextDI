
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MusicPlayer;


public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        MusicPlayer contextPlayer = context.getBean("PolimorfPlayer",MusicPlayer.class);
        contextPlayer.playMusic();
        contextPlayer.playClassic();
        contextPlayer.playRock();
        context.close();
    }

}