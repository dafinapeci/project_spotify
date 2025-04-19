import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
public class musicPlayer {
    private MediaPlayer mediaPlayer;
    public void playMusic(String filePath) {
        try {
            Media media = new Media(new File(filePath).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
            System.out.println("Müzik Çalıyor...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void stopMusic() {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                System.out.println("Müzik Durduruldu.");
            }
        }

        // Müzik duraklatma
        public void pauseMusic() {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                System.out.println("Müzik Duraklatıldı.");
            }
        }

        // Müzik yeniden başlatma
        public void resumeMusic() {
            if (mediaPlayer != null) {
                mediaPlayer.play();
                System.out.println("Müzik Devam Ediyor.");
            }
        }
    
}
