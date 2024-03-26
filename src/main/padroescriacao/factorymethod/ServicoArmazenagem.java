package main.padroescriacao.factorymethod;

public class ServicoArmazenagem implements IServico {

    public String executar() {
        return "Armazenagem efetivada.";
    }

    public String cancelar() {
        return "Armazenagem cancelada.";
    }
}
