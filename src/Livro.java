public class Livro {
    private String titulo;
    private String author;

    public Livro(String titulo, String author) {
        this.titulo = titulo;
        this.author = author;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getauthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | autor: " + author;
    }
}
