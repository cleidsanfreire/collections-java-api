package list.Pesquisa;

public class Livro {
    // Attributes
    private String title;
    private String author;
    private int yearPub;

    public Livro(String title, String author, int yearPub) {
        this.title = title;
        this.author = author;
        this.yearPub = yearPub;
    }

    @Override
    public String toString() {
        return "Livro --> \n" +
                "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Year Pub: " + getYearPub() + "\n\n";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPub() {
        return yearPub;
    }
}
