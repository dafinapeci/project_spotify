import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nameofPlaylist;
    private List<SongItems> songs;
	public String getNameofPlaylist() {
		return nameofPlaylist;
	}
	public void setNameofPlaylist(String nameofPlaylist) {
		this.nameofPlaylist = nameofPlaylist;
	}
	public List<SongItems> getSongs() {
		return songs;
	}
	public void setSongs(List<SongItems> songs) {
		this.songs = songs;
	}
	public Playlist(String nameofPlaylist, List<SongItems> songs) {
		this.nameofPlaylist = nameofPlaylist;
		this.songs = songs;
	}
	public void addsong(SongItems song) {
		songs.add(song);
	}
	public void removesong(SongItems song) {
		songs.remove(song);
	}
    
}
