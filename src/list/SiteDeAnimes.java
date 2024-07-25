package list;

import java.util.ArrayList;
import java.util.List;

public class SiteDeAnimes {
    private List<Anime> animeList;

    public SiteDeAnimes() {
        this.animeList = new ArrayList<>();
    }

    public void addAnime(String name, String dub, String author, int season, int episodes) {
        animeList.add(new Anime(name, dub, author, season, episodes));
    }
    public void exibirAnime() {
        System.out.println(animeList.toString());
    }
    public static void main(String[] args) {
        SiteDeAnimes anime = new SiteDeAnimes();

        anime.addAnime("Kimetsu","Legendado","Sei la",4,80);
        anime.exibirAnime();
    }
}
