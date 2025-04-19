import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nameofPlaylist;
    private List<SongItems> songs;
	public Playlist(String nameofPlaylist, List<SongItems> songs) {
		this.nameofPlaylist = nameofPlaylist;
		this.songs = songs;
	}
	//getter and setters
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
	
	//functions
    public void playAll() {
        for (SongItems item : songs) {
            if (item instanceof Playable) {
                ((Playable) item).play();
            }
        }
    }

    public void displayAll() {
        for (SongItems item : songs) {
            item.displayInfo();
        }
    }
    
	
	public void addsong(SongItems song) {
		songs.add(song);
	}
	public void removesong(SongItems song) {
		songs.remove(song);
	}
    
}
