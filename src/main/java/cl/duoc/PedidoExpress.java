package cl.duoc;

/**
 * Clase que representa los pedidos Express en el sistema SpeedFast
 * @author KatherineAvila
 */
public class PedidoExpress extends Pedido {

    private String tipoComercio;
    private int tiempoLLegada;
    private boolean disponibilidadInmediata;

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm, String tipoPedido, String tipoComercio, int tiempoLLegada, boolean disponibilidadInmediata) {
        super(idPedido, direccionEntrega, distanciaKm, tipoPedido);
        this.tipoComercio = tipoComercio;
        this.disponibilidadInmediata =  disponibilidadInmediata;
        this.tiempoLLegada = tiempoLLegada;
    }

    public String getTipoComercio() {
        return tipoComercio;
    }

    public void setTipoComercio(String tipoComercio) {
        this.tipoComercio = tipoComercio;
    }

    public int getTiempoLLegada() {
        return tiempoLLegada;
    }

    public void setTiempoLLegada(int tiempoLLegada) {
        this.tiempoLLegada = tiempoLLegada;
    }

    public boolean isDisponibilidadInmediata() {
        return disponibilidadInmediata;
    }

    public void setDisponibilidadInmediata(boolean disponibilidadInmediata) {
        this.disponibilidadInmediata = disponibilidadInmediata;
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
    int tiempo = 10;
    int minutosExtras= 5;
    if(getDistanciaKm() > 5) {
        tiempo += minutosExtras;
        System.out.println("Tiempo estimado de entrega " + tiempo + " minutos.");
    }else{
     System.out.println("Tiempo estimado de entrega " + tiempo + " minutos.");


}
        return tiempo;
    }

    /**
     * Método sobreescrito que muestra mensaje personalizado
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Asignando Repartidor...");
        }

    /**
     * Método sobrecargado, evalúa y asigna un repartidor especifico al pedido
     * Válida las reglas de negocio establecidas (tiempo máximo de llegada según el tipo de comercio y la disponibilidad inmediata). si el repartidor
     * cumple co los requisitos, confirma la asignación. De lo contrario, notifica el rechazo.
     * @param nombreRepartidor el nombre del repartidor que se intenta asignar al pedido.
     */
    public void asignarRepartidor(String nombreRepartidor){

        if (tipoComercio.equalsIgnoreCase("Farmacia") && (tiempoLLegada <= 15)) {
            if (disponibilidadInmediata) {
                System.out.println("Repartidor asignado: " + nombreRepartidor);
                System.out.println("Tu repartidor esta a: " + getTiempoLLegada() + " minutos.");
                setguardarRepartidor(nombreRepartidor);
                super.tieneRepartidor = true;
            } else {
                System.out.println("No hay repartidores disponibles en este momento.");
            }
        } else if (tipoComercio.equalsIgnoreCase("supermercado") && (tiempoLLegada <= 30)) {
            if (disponibilidadInmediata) {
                System.out.println("Repartidor asignado: " + nombreRepartidor);
                System.out.println("Tu repartidor esta a: " + getTiempoLLegada() + " minutos.");
                setguardarRepartidor(nombreRepartidor);
               super.tieneRepartidor = true;
            } else {
                System.out.println("No hay repartidores disponibles en este momento.");
            }
        }else{
            System.out.println("El pedido no cumple con las condiciones del servicio Express " + "\n" +
                                "(Comercio no habilitado o distancia fuera del limite de tiempo para entrega inmediata)");
        }

    }

    @Override
    public String toString() {
        return
                "Tipo de Comercio: " + tipoComercio + "\n" +
                "Tiempo de Llegada: " + tiempoLLegada + "\n" +
                "¿Disponibilidad Inmediata?: " + disponibilidadInmediata;
    }
}
