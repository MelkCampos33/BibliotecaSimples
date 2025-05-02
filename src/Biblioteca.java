import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
    }

    public List<Livro> buscarPorAutor(String author) {  
        return livros.stream()
            .filter(livro -> livro.getauthor().equalsIgnoreCase(author))
            .collect(Collectors.toList());
        
    }
}
