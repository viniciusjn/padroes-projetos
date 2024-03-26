package test.padroescriacao.factorymethod;

import main.padroescriacao.factorymethod.IServico;
import main.padroescriacao.factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoEntregaTest {

    @Test
    void deveExecutarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega efetivada.", servico.executar());
    }

    @Test
    void deveCancelarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega cancelada.", servico.cancelar());
    }
}
