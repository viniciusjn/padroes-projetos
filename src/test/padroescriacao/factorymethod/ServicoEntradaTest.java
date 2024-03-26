package test.padroescriacao.factorymethod;

import main.padroescriacao.factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoEntradaTest {

    @Test
    void deveExecutarEntrada() {
        IServico servico = ServicoFactory.obterServico("Entrada");
        assertEquals("Entrada efetivada.", servico.executar());
    }

    @Test
    void deveCancelarEntrada() {
        IServico servico = ServicoFactory.obterServico("Entrada");
        assertEquals("Entrada cancelada.", servico.cancelar());
    }
}
