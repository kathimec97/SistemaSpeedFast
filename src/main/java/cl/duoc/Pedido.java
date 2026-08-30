package cl.duoc;

import cl.duoc.interfaces.Cancelable;
import cl.duoc.interfaces.Despachable;
import cl.duoc.interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;



/**
 * Clase base abstracta que representa la información general de los pedidos en
 * el sistema SpeedFast.
 * @author KatherineAvila
 */
public abstract class Pedido implements Cancelable, Rastreable, Despachable {

   protected String idPedido;
   protected String direccionEntrega;
   protected double distanciaKm;
   protected String tipoPedido;
   protected String guardarRepartidor;
   protected boolean tieneRepartidor = false;
   private   List<String> historial = new ArrayList<>();

   public Pedido(String idPedido, String direccionEntrega, double distanciaKm, String tipoPedido) {
       this.idPedido = idPedido;
       this.direccionEntrega = direccionEntrega;
       this.distanciaKm = distanciaKm;
       this.tipoPedido = tipoPedido;

   }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getTipoPedido() {return tipoPedido;}

    public void setguardarRepartidor(String guardarRepartidor) {
       this.guardarRepartidor = guardarRepartidor;
    }

/**
 * Muestra un mensaje por consola cuando el pedido haya sido despachado exitosamente.
 * Verifica que el pedido tenga un repartidor asignado y si lo tiene guarda los datos en un historial,
 * Sí no tiene repartidor asignado arroja un mensaje y no guarda los datos en el historial.
 */
    @Override
    public void despachar() {
 if(this.tieneRepartidor) {
     historial.add("- Pedido " + tipoPedido + " " + idPedido + " - entregado por: " + " " + guardarRepartidor);
     System.out.println("Pedido despachado correctamente.");
}else {
     System.out.println("No se puede despachar el pedido porque no tiene un repartidor asignado");
 }
    }

    /**
     * Muestra un mensaje para confirmar la cancelación de un pedido.
     */

    @Override
    public void cancelar() {
        System.out.println("Cancelando pedido " + tipoPedido + " #" + idPedido + " ...");
        System.out.println(">> Pedido cancelado correctamente");
    }

    /**
     *Retorna una lista de historial para su visualización.
     * @return una nueva lista con los eventos registrados en el historial
     */
    @Override
    public List<String> verHistorial() {
        return new ArrayList<>(historial);
    }

    /**
     * permite imprimir en consola todo los eventos del historial.
     */
    public void mostrarTodosHistorial() {
        for (String verHistorial : verHistorial()) {
            System.out.println(verHistorial);
        }

    }

    /**
     * Método mostrarResumen() muestra un resumen de la información
     * general de todos los pedidos
     */
    public void mostrarResumen(){
        System.out.println("Pedido " + this.tipoPedido);
        System.out.println("ID: "+ idPedido);
        System.out.println("Dirección: "+ direccionEntrega);
        System.out.println("Distancia: "+ distanciaKm + " Km");
    }

    /**
     * Método abstracto para ser implementador de forma
     * distinta en cada subclase.
     * Calcula el tiempo de entrega según la distancia en km en cada tipo de pedido
     */

    public abstract int calcularTiempoEntrega();

    /**
     * Método general destinado a sobreescribirse en las clases hijas
     * para personalización
     */
    public void asignarRepartidor(){
        System.out.println("Pedido asignando repartidor");
    }

    @Override
    public String toString() {
        return
                "ID Pedido:" + idPedido + "\n" +
                "Dirección de Entrega: " + direccionEntrega + "\n" +
                "Distancia: " + distanciaKm + "\n";
    }
}
