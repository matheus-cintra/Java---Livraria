package modeloBeans;

public class BeansAutor {
    public String getConsulta() {
        return consulta;
    }
    
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    private String nome_ator;
    private String sobrenome_autor;
    private String consulta;

    public String getNome_ator() {
        return nome_ator;
    }

    public void setNome_ator(String nome_ator) {
        this.nome_ator = nome_ator;
    }

    public String getSobrenome_autor() {
        return sobrenome_autor;
    }

    public void setSobrenome_autor(String sobrenome_autor) {
        this.sobrenome_autor = sobrenome_autor;
    }
}
