public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int ano;
    private String editora;
    private String genero;

    public Livro(){
        this.codigo = 0;
        this.titulo = "";
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}
