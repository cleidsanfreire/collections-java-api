package list;

public class Musica {
    // Attributes
    private String name, artist, gen, album;
    private int year;

    public Musica(String name, String artist, String gen, String album, int year) {
        this.name = name;
        this.artist = artist;
        this.gen = gen;
        this.album = album;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Musica ---> \n" +
                "Name: " + name + "\n" +
                "Artist: " + artist + "\n" +
                "Genero: " + gen + "\n" +
                "Album: " + album + "\n" +
                "Year: " + year + "\n";
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGen() {
        return gen;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }
}
