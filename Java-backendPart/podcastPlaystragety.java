import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class podcastPlaystragety implements Playable {
    
    private MediaPlayer mediaPlayer;

    @Override
    public void play() {
        try {
            podcast podcast1 = getPodcastFromDatabase();  // Veritabanından podcast nesnesi alınacak

            // Podcast nesnesinden filePath alınır
            String filePath = podcast1.getFilePath();

            // MediaPlayer ile podcast çalınır
            Media media = new Media(new java.io.File(filePath).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void pause() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override
    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    // Veritabanından podcast nesnesi döndüren metot
    private podcast getPodcastFromDatabase() {
        // Burada veritabanından podcast nesnesi alınır.
        // Örneğin:
        // return Database.getPodcastById(podcastId);

        // Örnek bir Podcast döndürülüyor
        return new podcast("Podcast Name", "Host Name", "Genre", 30.5f, "path/to/podcast.mp3", "Podcast Topic") {
            @Override
            public void displayInfo() {
                System.out.println(getSongName() + " by " + getArtistName() + " | Topic: " + getTopic());
            }
        };
    }
}
