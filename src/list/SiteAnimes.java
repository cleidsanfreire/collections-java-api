package list;

import java.util.ArrayList;
import java.util.List;

public class SiteAnimes {
    // Attributes
    private List<Anime> animesList;

    public SiteAnimes() {
        this.animesList = new ArrayList<>();
    }

    public void addAnime(String name, int episodes, int season, String dub) {
        animesList.add(new Anime(name, episodes, season, dub));
    }

    public int  countAnime() {
        return animesList.size();
    }

    public void removerAnime(String name) {
        List<Anime> removeAnime = new ArrayList<>();
        if (!animesList.isEmpty()) {
            for (Anime a : animesList) {
                if (a.getName().equalsIgnoreCase(name)) {
                    removeAnime.add(a);
                }
            }
            animesList.removeAll(removeAnime);
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    public void exibirAnime() {
        if (!animesList.isEmpty()) {
            System.out.println(animesList);
            System.out.println("O Total de animes na lista é de: " + countAnime());
        } else {
            System.out.println("Lista Vazia!");
            System.out.println("O Total de animes na lista é de: " + countAnime());
        }
    }

    public List<Anime> searchForIntervalSeason(int seasonStart, int seasonEnd) {
        List<Anime> animesInterval = new ArrayList<>();
        if (!animesList.isEmpty()) {
            for (Anime a : animesList) {
                if (a.getSeason() >= seasonStart && a.getSeason() <= seasonEnd) {
                    animesInterval.add(a);
                }
            }
        }
        return animesInterval;
    }

    public Anime search(String name) {
        Anime animeTtile = null;
        if (!animesList.isEmpty()) {
            for (Anime a : animesList) {
                if (a.getName().equalsIgnoreCase(name)) {
                    animeTtile = a;
                    break;
                }
            }
        }
        return animeTtile;
    }

    public static void main(String[] args) {
        SiteAnimes anime = new SiteAnimes();

        anime.addAnime("Fairy Tail", 366, 7, "Legendado");
        anime.addAnime("Naruto", 720, 20, "Legendado");
        anime.addAnime("Dragon Ball Z", 250, 5, "Legendado");
        anime.addAnime("Fairy Tail", 366, 7, "Legendado");

        System.out.println("Exibindo Animes.");
        anime.exibirAnime();

        System.out.println("Removendo Animes.....");
        //anime.removerAnime("Fairy Tail");

        System.out.println("Procurando por Intervalo de Temporadas.");
        System.out.println(anime.searchForIntervalSeason(0,10));

        System.out.println("Procurando por Nome do Anime.");
        System.out.println(anime.search("Naruto"));

        System.out.println("Exibindo Animes.");
        anime.exibirAnime();
    }
}
