package list;

import java.util.ArrayList;
import java.util.List;

public class Straming {
    // Attributes
    private List<Musica> listMusic;

    // Constructor
    public Straming() {
        this.listMusic = new ArrayList<>();
    }

    // Methods
    public void addMusic(String name, String artist, String gen, String album, int year) {
        listMusic.add(new Musica(name, artist, gen, album, year));
    }

    public void removeMsc(String album) {
        List<Musica> removeMsc = new ArrayList<>();
        int qty = 0;
        if (!listMusic.isEmpty()) {
            for (Musica m : listMusic) {
                if (m.getAlbum().equalsIgnoreCase(album)) {
                    removeMsc.add(m);
                    qty++;
                }

            }
            System.out.println("Removendo " + qty + " musicas do Album: " + album + ".... \n...\n...\n...");
            listMusic.removeAll(removeMsc);
        }else {
            System.out.println("Lista vazia!");
        }
    }
    public void exibirMsc() {
        System.out.println(listMusic);
    }
    public static void main(String[] args) {
        Straming msc = new Straming();

        msc.addMusic("Revolution Deathsquad","DragonForce","Rock", "Inhuman Rampage",2006);
        msc.addMusic("Revolution","DragonForce","Rock", "Inhuman",2007);
        msc.addMusic("Deathsquad","DragonForce","Rock", "Rampage",2008);
        msc.addMusic("Revolution Deathsquad","DragonForce","Rock", "Inhuman Rampage",2006);

        msc.exibirMsc();

        System.out.println();
        msc.removeMsc("Inhuman Rampage");

        msc.exibirMsc();
    }
}
