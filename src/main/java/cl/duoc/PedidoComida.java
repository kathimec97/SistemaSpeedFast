package cl.duoc;

/**
 * Clase que representa los pedidos de Comida en el sistema SpeedFast
 * @author KatherineAvila
 */
public class PedidoComida extends Pedido {
    private boolean tieneMochila;



    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm, String tipoPedido, boolean  tieneMochila) {
        super(idPedido, direccionEntrega, distanciaKm, tipoPedido);
        this.tieneMochila = tieneMochila;

    }

    public boolean isTieneMochila() {
        return tieneMochila;
    }

    public void setTieneMochila(boolean tieneMochila) {
        this.tieneMochila = tieneMochila;
    }

    /**
     * Muestra el tipo de pedido y un resumen de los datos generales en consola
     */
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
    }

    /**
     * Calcula y muestra por consola el tiempo de entrega de un pedido
     * dependiendo de la distancia en kilómetros.
     */
    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 15;
        int minutosExtras = 2;
        int tiempoFinal = (int) (tiempoBase + Math.round(minutosExtras * getDistanciaKm()));
        System.out.println("Tiempo estimado de entrega: " + tiempoFinal + " minutos.");
        return tiempoFinal;
    }

    /**
     * Método sobreescrito de la clase base, con un mensaje
     * adaptado al tipo de pedido comida
     */
    @Override
    public void asignarRepartidor() {
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
            setguardarRepartidor(nombreRepartidor);
            super.tieneRepartidor = true;

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
