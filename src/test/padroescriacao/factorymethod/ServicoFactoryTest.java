package test.padroescriacao.factorymethod;

import main.padroescriacao.factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Evasão.");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Perda.");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido.", e.getMessage());
        }
    }
}
