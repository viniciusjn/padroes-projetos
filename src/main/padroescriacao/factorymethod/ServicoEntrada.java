package main.padroescriacao.factorymethod;

public class ServicoEntrada implements IServico {

    public String executar() {
        return "Entrada efetivada.";
    }

    public String cancelar() {
        return "Entrada cancelada.";
    }
}
