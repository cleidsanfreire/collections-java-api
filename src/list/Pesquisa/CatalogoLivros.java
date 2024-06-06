package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Attributes
    private List<Livro> listLivro;

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void addLivro(String title, String author, int yearPub) {
        listLivro.add(new Livro(title,author,yearPub));
    }

    public List<Livro> searchAuthor(String author) {
        List<Livro> booksForAuthor = new ArrayList<>();
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getAuthor().equalsIgnoreCase(author)) {
                    booksForAuthor.add(l);
                }
            }
        }
        return booksForAuthor;
    }

    public List<Livro> searchIntervalYear(int yearStart, int yearEnd) {
        List<Livro> booksForInterval = new ArrayList<>();
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getYearPub() >= yearStart && l.getYearPub() <= yearEnd) {
                    booksForInterval.add(l);
                }
            }
        }
        return booksForInterval;
    }

    public Livro searchForTitle(String title) {
        Livro bookForTitle = null;
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getTitle().equalsIgnoreCase(title)) {
                    bookForTitle = l;
                    break;
                }
            }
        }
        return bookForTitle;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.addLivro("Book 1", "Freire",2020);
        livros.addLivro("Book 2", "Freire",2023);
        livros.addLivro("Book 3", "GNE",2020);
        livros.addLivro("Book 4", "NANDA",2025);
        livros.addLivro("Book 5", "Grtes",2020);
        livros.addLivro("Book 5", "Freire",2026);

        System.out.println("Books for Author\n");
        System.out.println(livros.searchAuthor("Freire"));

        System.out.println("Books for title --> \n");
        System.out.println(livros.searchForTitle("Book 5"));

        System.out.println("Books for Interval of Years -->\n");
        System.out.println(livros.searchIntervalYear(2023,2030));
    }
}
