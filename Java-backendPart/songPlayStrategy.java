import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class songPlayStrategy implements Playable {
    private MediaPlayer mediaPlayer;

    @Override
    public void play() {
    	 try {
             // Veritabanından alınan song nesnesi
             SongItems song = getSongFromDatabase();  // Bu, veritabanından şarkı nesnesini almak için kullanılan metot

             // SongItems nesnesinden filePath alınır
             String filePath = song.getFilePath();

             // MediaPlayer ile müzik çalınır
             Media media = new Media(new java.io.File(filePath).toURI().toString());
             mediaPlayer = new MediaPlayer(media);
             mediaPlayer.play();

         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    @Override
    public void pause() {
        System.out.println("Şarkı duraklatıldı...");
        mediaPlayer.pause();
    }

    @Override
    public void stop() {
        System.out.println("Şarkı durduruldu.");
        mediaPlayer.stop();
    }
    private SongItems getSongFromDatabase() {
        // Burada veritabanından şarkı nesnesi alınacak.
        // Örneğin:
        // return Database.getSongById(songId);
        return new SongItems("Song Name", "Artist", "Genre", 3.5f, "path/to/song.mp3") {
            @Override
            public void displayInfo() {
                System.out.println(getSongName() + " by " + getArtistName());
            }
        };
    }
}