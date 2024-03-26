package main.padroescriacao.factorymethod;

public class ServicoEntrega implements IServico {

    public String executar() {
        return "Entrega efetivada.";
    }

    public String cancelar() {
        return "Entrega cancelada.";
    }
}
