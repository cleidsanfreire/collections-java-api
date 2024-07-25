package list;

public class Anime {
    private String name, dub,author;
    private int season, episodes;

    public Anime(String name, String dub, String author, int season, int episodes) {
        this.name = name;
        this.dub = dub;
        this.author = author;
        this.season = season;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", dub='" + dub + '\'' +
                ", author='" + author + '\'' +
                ", season=" + season +
                ", episodes=" + episodes +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDub() {
        return dub;
    }

    public String getAuthor() {
        return author;
    }

    public int getSeason() {
        return season;
    }

    public int getEpisodes() {
        return episodes;
    }
}
