package main.padroescriacao.abstractfactory;

public class ReciboPessoaFisica implements Recibo {

    public String emitir() {
        return "Recibo de Pessoa Física.";
    }
}
