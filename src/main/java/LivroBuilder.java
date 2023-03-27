public class LivroBuilder {

    private Livro livro;

    public LivroBuilder(){
        livro = new Livro();
    }

    public Livro build(){
        if (livro.getCodigo() == 0){
            throw new IllegalArgumentException("Código inválido");
        }
        if(livro.getTitulo().equals("")){
            throw new IllegalArgumentException("Titulo inválido");
        }
        return livro;
    }

    public LivroBuilder setCodigo(int codigo){
        livro.setCodigo(codigo);
        return this;
    }

    public LivroBuilder setTitulo(String titulo){
        livro.setTitulo(titulo);
        return this;
    }

    public LivroBuilder setAutor(String autor){
        livro.setAutor(autor);
        return this;
    }

    public LivroBuilder setAno(int ano){
        livro.setAno(ano);
        return this;
    }

    public LivroBuilder setEditora(String editora){
        livro.setEditora(editora);
        return this;
    }

    public LivroBuilder setGenero(String genero){
        livro.setGenero(genero);
        return this;
    }

}
