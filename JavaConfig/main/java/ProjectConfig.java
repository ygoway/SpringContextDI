import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.musicPlayerImpl.ClassicMusicPlayer;
import service.MusicPlayer;
import service.musicPlayerImpl.Player;
import service.musicPlayerImpl.RockMusicPlayer;

@Configuration
public class ProjectConfig {

    @Bean("AllSongs")
    Player player() {
        Player player = new Player();
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

    @Bean("PolimorfPlayer")
    MusicPlayer musicPlayer(@Qualifier("AllSongs") Player allSongPlayer, @Qualifier("ClassicSongs")
    ClassicMusicPlayer classicMusicPlayer, @Qualifier("RockSongs") RockMusicPlayer rockMusicPlayer) {
        return new MusicPlayer(allSongPlayer, classicMusicPlayer, rockMusicPlayer); // don`t work without @Qualifier
    }                                                                               // returning new MusicPlayer obj helps
                                                                                    // with Parent Class

}
