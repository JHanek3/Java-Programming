
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        
        // variables located in the same position
        if (this == compared) {
            return true;
        }
        
        // compared object is not of type song
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song object
        Song comparedSong = (Song) compared;

        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds) {
                return true;
            }
        
        return false;
        
    }

}
