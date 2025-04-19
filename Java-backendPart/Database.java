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

    // Songs (Şarkılar) veritabanına ekleme
    public static void insertSong(Songs song) {
        String sql = "INSERT INTO SongItems (songName, artistName, genre, time, filePath) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, song.getSongName());
            stmt.setString(2, song.getArtistName());
            stmt.setString(3, song.getGenre());
            stmt.setFloat(4, song.getTime());
            stmt.setString(5, song.getFilePath());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Podcast veritabanına ekleme
    public static void insertPodcast(podcast podcast1) {
        String sql = "INSERT INTO Podcast (songName, artistName, genre, time, filePath, topic) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, podcast1.getSongName());
            stmt.setString(2, podcast1.getArtistName());
            stmt.setString(3, podcast1.getGenre());
            stmt.setFloat(4, podcast1.getTime());
            stmt.setString(5, podcast1.getFilePath());
            stmt.setString(6, podcast1.getTopic());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/* sql server part
CREATE TABLE SongItems (
    songID INT PRIMARY KEY IDENTITY(1,1),
    songName NVARCHAR(100),
    artistName NVARCHAR(100),
    genre NVARCHAR(50),
    time FLOAT,
    filePath NVARCHAR(200)
); 
 */

/*
CREATE TABLE Podcast (
    podcastID INT PRIMARY KEY IDENTITY(1,1),
    songName NVARCHAR(100),
    artistName NVARCHAR(100),
    genre NVARCHAR(50),
    time FLOAT,
    filePath NVARCHAR(200),
    topic NVARCHAR(200)
);
*/


