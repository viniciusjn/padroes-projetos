package test.padroescriacao.builder;

import main.padroescriacao.builder.Funcionario;
import main.padroescriacao.builder.FuncionarioBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void deveRetornarExcecaoParaFuncionarioSemCodigo() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNome("Nome 1")
                    .setCargo("Cargo 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido.", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setCodigoFuncionario(1)
                    .setCargo("Cargo 1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido.", e.getMessage());
        }
    }

    @Test
    public void deveRetornarFuncionarioValido() {
        FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
        Funcionario funcionario = funcionarioBuilder
                .setCodigoFuncionario(1)
                .setNome("Nome 1")
                .setCargo("Cargo 1")
                .build();

        assertNotNull(funcionario);
    }
}
