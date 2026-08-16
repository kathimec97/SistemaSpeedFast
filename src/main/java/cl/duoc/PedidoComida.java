package cl.duoc;

/**
 * Clase que representa los pedidos de Comida en el sistema SpeedFast
 * @author KatherineAvila
 */
public class PedidoComida extends Pedido {
    private boolean tieneMochila;

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido, boolean  tieneMochila) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.tieneMochila = tieneMochila;
    }

    public boolean isTieneMochila() {
        return tieneMochila;
    }

    public void setTieneMochila(boolean tieneMochila) {
        this.tieneMochila = tieneMochila;
    }

    /**
     * Método sobreescrito de la clase base, con un mensaje
     * adaptado al tipo de pedido comida
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de comida: ");
        System.out.println("Asignando repartidor...");


    }

    /**
     *Método sobrecargado que asigna un repartidor al pedido de comida.
     * simula la validación del sistema verificando si el repartidor cumple con el requisito de tener mochila térmica.
     * @param nombreRepartidor Nombre del repartidor a evaluar y asignar
     */
    public void asignarRepartidor(String nombreRepartidor) {

        //Validación requerimiento: tiene mochila
        if (this.tieneMochila) {
            System.out.println("-> Pedido asignado a: " + nombreRepartidor);

        } else {
            System.out.println("-> Pedido en espera, buscando a un repartidor con mochila...");
        }
    }

    @Override
    public String toString() {
        return
                "¿Tiene Mochila?: " + tieneMochila;
    }
}
