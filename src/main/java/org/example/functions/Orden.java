package org.example.functions;

public class Orden {

    private Integer numero;
    private String descripcion;

    public Orden(Integer numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orden{");
        sb.append("numero=").append(numero);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
