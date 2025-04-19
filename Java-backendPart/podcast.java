
public class podcast extends SongItems implements Playable {
    private String topic;
    private musicPlayer player = new musicPlayer();

    public podcast(String songName, String artistName, String genre, float time, String filePath, String topic) {
        super(songName, artistName, genre, time, filePath);
        this.topic = topic;
    }

    public String getTopic() { return topic; }

    @Override
    public void displayInfo() {
        System.out.println("Podcast: " + getSongName() + " | Host: " + getArtistName() + " | Topic: " + topic);
    }

    @Override
    public void play() {
        player.playMusic(getFilePath());
    }

    @Override
    public void pause() {
        player.pauseMusic();
    }

    @Override
    public void stop() {
        player.stopMusic();
    }
}