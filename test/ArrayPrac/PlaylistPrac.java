package test.ArrayPrac;

// import java.util.Arrays;
import java.util.ArrayList;
// import java.util.Scanner;

public class PlaylistPrac {

    // instance variables
    private ArrayList<String> songList;

    public static void main(String[] args) {

        // Create Objects
        // Scanner songScanner = new Scanner(System.in);

    
        PlaylistPrac playlist = new PlaylistPrac();
        playlist.addSong("song 1");
        playlist.addSong("Angel's Fav.");
        playlist.addSong("Undertale Music");

        playlist.printSongs();

        playlist.removeSong("song 1");

        playlist.printSongs();
    }

    // Constructor
    public PlaylistPrac() {
        this.songList = new ArrayList<String>();
    }

    // Class methods

    public void printSongs() {
        for (int i = 0; i < this.songList.size(); i++) {
            System.out.println(songList.get(i));
        }
    }

    public void addSong(String song) {
        songList.add(song);
    }

    public void removeSong(String song) {
        songList.remove(song);
    }


}
