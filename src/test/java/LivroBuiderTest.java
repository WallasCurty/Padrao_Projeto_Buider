import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LivroBuiderTest {
    @Test
    void deveRetornarExcecaoParaLivroSemCodigo() {
        try {
            LivroBuilder livroBuilder = new LivroBuilder();
            Livro livro = livroBuilder
                    .setTitulo("Narnia")
                    .setAutor("C.S.Lewis")
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Codigo do Livro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLivroSemTitulo() {
        try {
            LivroBuilder livroBuilder = new LivroBuilder();
            Livro livro = livroBuilder
                    .setCodigo(1)
                    .setAutor("C.S.Lewis")
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Titulo do Livro inválido", e.getMessage());
        }
    }

    void deveRetornarLivroValido() {
        try {
            LivroBuilder livroBuilder = new LivroBuilder();
            Livro livro = livroBuilder
                    .setCodigo(1)
                    .setTitulo("Narnia")
                    .setAutor("C.S.Lewis")
                    .setAno(1900)
                    .setEditora("Saraiva")
                    .setGenero("Aventura")
                    .build();

            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Livro válido", e.getMessage());
        }
    }

}
