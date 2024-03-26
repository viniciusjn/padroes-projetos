package main.padroescriacao.abstractfactory;

public class ReciboPessoaJuridica implements Recibo {

    public String emitir() {
        return "Recibo de Pessoa Jurídica.";
    }
}
