package test.padroescriacao.abstractfactory;

import main.padroescriacao.abstractfactory.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvogaciaTest {

    @Test
    public void deveEmitirContratoPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Advogacia advogacia = new Advogacia(fabrica);
        assertEquals("Contrato de Pessoa Física.", advogacia.emitirContrato());
    }

    @Test
    public void deveEmitirContratoPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Advogacia advogacia = new Advogacia(fabrica);
        assertEquals("Contrato de Pessoa Jurídica.", advogacia.emitirContrato());
    }

    @Test
    public void deveEmitirReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Advogacia advogacia = new Advogacia(fabrica);
        assertEquals("Recibo de Pessoa Física.", advogacia.emitirRecibo());
    }

    @Test
    public void deveEmitirReciboPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Advogacia advogacia = new Advogacia(fabrica);
        assertEquals("Recibo de Pessoa Jurídica.", advogacia.emitirRecibo());
    }
}
