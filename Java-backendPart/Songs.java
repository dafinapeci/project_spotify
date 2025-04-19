public class Songs extends SongItems implements Playable {
    private musicPlayer player = new musicPlayer();

    public Songs(String songName, String artistName, String genre, float time, String filePath) {
        super(songName, artistName, genre, time, filePath);
    }

    @Override
    public void displayInfo() {
        System.out.println("Song: " + getSongName() + " by " + getArtistName());
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