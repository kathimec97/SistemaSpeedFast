package cl.duoc;

import javax.sound.midi.Soundbank;

/**
 * Clase que representa los pedidos de encomienda tales como paquetes y documentos
 * dentro del sistema SpeedFast
 * @author KatherineAvila
 */
public class PedidoEncomienda extends Pedido {

    private double peso;
    private String tipoEmbalaje;

    public PedidoEncomienda( String idPedido, String direccionEntrega, String tipoPedido, double peso, String tipoEmbalaje) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.peso = peso;
        this.tipoEmbalaje = tipoEmbalaje;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    /**
     * Método sobreescrito de la clase base Pedido, arroja un mensaje
     * personalizado.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("---Pedido encomienda---");
        System.out.println("Asignando repartidor...");
    }

    /**
     * sobrecarga de método, con un parámetro asignado para
     * personalización, valida que la encomienda cumpla los requisitos para transporte.
     * evalúa que tanto los paquetes como los documentos cumplan con un rango de peso para
     * su admisión de lo contrario arroja un mensaje.
     * @param nombreRepartidor
     */
    public void asignarRepartidor(String nombreRepartidor) {

        if(tipoEmbalaje.equalsIgnoreCase("Documento")) {
            if(peso > 0.01 && peso <= 2.0) {
                System.out.println("Repartidor asignado " + nombreRepartidor);
            }else {
                System.out.println("Excede peso como Documento, por favor elija la opción 'Paquete' ");
            }
        } else if (tipoEmbalaje.equalsIgnoreCase("Paquete")) {
            if (peso >= 0.1 && peso <= 25.0) {
                System.out.println("Repartidor asignado " + nombreRepartidor);

            } else {
                System.out.println("Excede peso para repartidor estándar.");
            }
        }else {
            System.out.println("Tipo de Embalaje no reconocido.");
        }
    }

    @Override
    public String toString() {
        return "Peso: " + peso + "\n" + ", Tipo Embalaje: " + tipoEmbalaje;
    }
}
