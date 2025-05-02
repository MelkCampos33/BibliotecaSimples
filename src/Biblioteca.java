import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor) {
        livros.add(new Livro(isbn, titulo, autor));
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public List<Livro> buscarPorAutor(String author) {
        return livros.stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(author))
                .toList();
    }

    public Livro buscarPorIsbn(String isbn) {

        return livros.stream()
            .filter(livro -> livro.getIsbn().equalsIgnoreCase(isbn))
            .findFirst()
            .orElse(null);
    }
}
