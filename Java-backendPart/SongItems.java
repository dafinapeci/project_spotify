public abstract class SongItems{
	private String songName;
	private String artistName;
	private String genre;
	private float time;
	private String filePath;
	public SongItems(String songName, String artistName, String genre, float time,String filePath) {
		this.songName = songName;
		this.artistName = artistName;
		this.genre = genre;
		this.time = time;
	       this.filePath = filePath;
		
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
	
	 public abstract void displayInfo();
}
