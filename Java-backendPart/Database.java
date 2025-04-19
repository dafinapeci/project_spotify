import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
	  private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=MusicDB;encrypt=true;trustServerCertificate=true";
	    private static final String USER = "sa"; // kendi kullanıcı adını yaz
	    private static final String PASSWORD = "1234"; // kendi şifreni yaz

	    public static Connection connect() throws SQLException {
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }

	    public static void insertSong(SongItems song) {
	        String sql = "INSERT INTO Songs (songName, artistName, genre, time, filePath) VALUES (?, ?, ?, ?, ?)";

	        try (Connection conn = connect();
	             PreparedStatement stmt = conn.prepareStatement(sql)) {

	            stmt.setString(1, song.getSongName());
	            stmt.setString(2, song.getArtistName());
	            stmt.setString(3, song.getGenre());
	            stmt.setFloat(4, song.getTime());
	            stmt.setString(5, song.getFilePath());

	            stmt.executeUpdate();
	            System.out.println("Şarkı başarıyla eklendi!");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
/* sql server part
 	CREATE TABLE Songs (
    songID INT PRIMARY KEY IDENTITY(1,1),
    songName NVARCHAR(100),
    artistName NVARCHAR(100),
    genre NVARCHAR(50),
    time FLOAT,
    filePath NVARCHAR(200)
); 
 */

