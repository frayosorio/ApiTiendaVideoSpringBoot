package tiendavideo.apitiendavideo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import tiendavideo.apitiendavideo.modelo.Pais;
import tiendavideo.apitiendavideo.repositorio.PaisRepositorio;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PaisRepositorioTest {

    @Autowired
    private PaisRepositorio repositorio;

    private Pais generarPais() {
        Pais pais = new Pais();
        pais.setPais("Republica de la Costa");
        pais.setCodigoalfa2("CO");
        pais.setCodigoalfa2("COA");
        return pais;
    }

    @Test
    public void testFindbyId() {
        Pais pais = generarPais();
        pais = repositorio.save(pais);

        Pais resultado = repositorio.findById(pais.getId()).get();

        assertEquals(pais.getId(), resultado.getId());
        repositorio.deleteById(pais.getId());
    }

}
