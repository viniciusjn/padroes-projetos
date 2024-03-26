package main.padroescriacao.abstractfactory;

public class Advogacia {

    private Contrato contrato;
    private Recibo recibo;

    public Advogacia (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.recibo = fabrica.createRecibo();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirRecibo() {
        return this.recibo.emitir();
    }
}
