package main.padroescriacao.abstractfactory;

public interface FabricaAbstrata {
    Contrato createContrato();
    Recibo createRecibo();
}
