package test.padroescriacao.factorymethod;

import main.padroescriacao.factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoArmazenagemTest {

    @Test
    void deveExecutarArmazenagem() {
        IServico servico = ServicoFactory.obterServico("Armazenagem");
        assertEquals("Armazenagem efetivado", servico.executar());
    }

    @Test
    void deveCancelarArmazenagem() {
        IServico servico = ServicoFactory.obterServico("Armazenagem");
        assertEquals("Armazenagem cancelado", servico.cancelar());
    }
}
