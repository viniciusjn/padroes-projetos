package test.padroescriacao.prototype;

import main.padroescriacao.prototype.Carro;
import main.padroescriacao.prototype.Motor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Carro carro = new Carro(1234, "Carro Original", new Motor("Tipo 1", 100), "Marca 1");

        Carro carroClone = carro.clone();
        carroClone.setAno(4567);
        carroClone.setModelo("Carro Clonado");
        carroClone.getMotor().setPotencia(200);

        assertEquals("Carro{ano=1234, modelo='Carro Original', motor=Motor{tipo='Tipo 1', ´potencia=100}, marca='Marca 1'}", carro.toString());
        assertEquals("Carro{ano=4567, modelo='Carro Clonado', motor=Motor{tipo='Tipo 1', ´potencia=200}, marca='Marca 1'}", carroClone.toString());
    }
}
