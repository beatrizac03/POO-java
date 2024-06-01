package ex_20;

public class Livro {
    private String titulo, autor;
    private int qtdeDisponivel;

    public Livro(String titulo, String autor, int qtdeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}

    public void setAutor(String autor) {this.autor = autor;}

    public int getQtdeDisponivel() {return qtdeDisponivel;}

    public void setQtdeDisponivel(int qtdeDisponivel) {this.qtdeDisponivel = qtdeDisponivel;}


    @Override
    public String toString() {
        return "{ Título= " + titulo + ", Autor= " + autor + ", Exemplares Disponíveis= " + qtdeDisponivel + " }";
    }


}
