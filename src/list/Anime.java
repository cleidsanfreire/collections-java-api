package list;

public class Anime {
    //Attributes
    private String name;
    private int episodes;
    private int season;
    private String dub;

    public Anime(String name, int episodes, int season, String dub) {
        this.name = name;
        this.episodes = episodes;
        this.season = season;
        this.dub = dub;
    }

    @Override
    public String toString() {
        return "Anime --> " + "\n" +
                "Name: " + name + "\n" +
                "Episodes=" + episodes + "\n" +
                "Season: " + season + "\n" +
                "Language: " + dub + "\n" +
                '}' + "\n";
    }

    public String getDub() {
        return dub;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getSeason() {
        return season;
    }
}
