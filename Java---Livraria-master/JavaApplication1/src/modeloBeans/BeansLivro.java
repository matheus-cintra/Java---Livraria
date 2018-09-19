package modeloBeans;

public class BeansLivro {
    public String getConsulta() {
        return consulta;
    }
    
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    private String isbn;
    private String nome;
    private String editora;
    private float preco;
    private String consulta;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
