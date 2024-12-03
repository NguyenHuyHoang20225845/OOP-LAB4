package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Constructor with all fields
    public CompactDisc(String title, String category, float cost, String artist) {
        super(); // Call parent class constructor
        this.setTitle(title);       // Set title using parent class method
        this.setCategory(category); // Set category using parent class method
        this.setCost(cost);         // Set cost using parent class method
        this.artist = artist;
    }

    // Constructor with minimal fields
    public CompactDisc(String title, String artist) {
        super();
        this.setTitle(title); // Set title using parent class method
        this.artist = artist;
    }

    // Default constructor
    public CompactDisc() {
        super();
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Add a track
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    // Remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Calculate total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("Total length of the CD: " + this.getLength() + " seconds");

        for (Track track : tracks) {
            track.play(); // Play each track on the CD
        }
    }
    
    @Override
    public String toString() {
        return "CD - " + super.toString() + ", Artist: " + artist + ", Tracks: " + tracks.size();
    }


}
