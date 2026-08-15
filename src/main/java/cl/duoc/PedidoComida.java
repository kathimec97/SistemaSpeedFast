package cl.duoc;

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

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de comida: ");
        System.out.println("Asignando repartidor...");


    }

    public void asignarRepartidor(String nombreRepartidor) {
        this.asignarRepartidor();

        //Validacion requerimiento: tiene mochila
        if (this.tieneMochila) {
            System.out.println("-> Pedido asignado a: " + nombreRepartidor);

        } else {
            System.out.println("-> Pedido en espera, buscando a un repartidor con mochila...");
        }
    }

    @Override
    public String toString() {
        return "PedidoComida{" +
                "tieneMochila=" + tieneMochila +
                '}';
    }
}
