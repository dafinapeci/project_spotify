import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class musicPlayer {
    private AudioPlayerContext context;

    public musicPlayer() {
        this.context = new AudioPlayerContext();
    }

    // Müzik çalma
    public void playMusic(String filePath) {
        context.setStrategy(new songPlayStrategy()); // veya başka bir strateji
        context.play();
    }

    // Podcast çalma
    public void playPodcast(String filePath) {
        context.setStrategy(new podcastPlaystragety()); // veya başka bir strateji
        context.play();
    }

    // Duraklatma işlemi
    public void pauseMusic() {
        context.pause();
    }

    // Durdurma işlemi
    public void stopMusic() {
        context.stop();
    }

    // Zaman atlama (seek)
    public void seekTo(double seconds) {
        // JavaFX fonksiyonları burada kullanılabilir
        System.out.println("Zaman atlandı: " + seconds + " saniye.");
    }
}
