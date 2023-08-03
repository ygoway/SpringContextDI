import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.player.ClassicMusicPlayer;
import service.player.MusicPlayer;
import service.player.RockMusicPlayer;

@Configuration
public class ProjectConfig {

    @Bean("AllSongs")
    MusicPlayer player() {
        MusicPlayer player = new MusicPlayer();
        return player;
    }

    @Bean("ClassicSongs")
    ClassicMusicPlayer classicMusicPlayer() {
        ClassicMusicPlayer classicMusicPlayer = new ClassicMusicPlayer();
        return classicMusicPlayer;
    }

    @Bean("RockSongs")
    RockMusicPlayer rockMusicPlayer() {
        RockMusicPlayer rockMusicPlayer = new RockMusicPlayer();
        return rockMusicPlayer;
    }
}
