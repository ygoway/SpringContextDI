
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MusicPlayer;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:XMLMusicConfig.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playClassic();
        musicPlayer.playRock();
        context.close();
    }

}
