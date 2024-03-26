package main.padroescriacao.prototype;

public class Motor implements Cloneable {

    private String tipo;
    private Integer potencia;

    public Motor(String tipo, Integer potencia) {
        super();
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", ´potencia=" + potencia +
                '}';
    }
}
