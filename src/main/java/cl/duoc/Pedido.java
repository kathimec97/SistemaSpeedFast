package cl.duoc;

import cl.duoc.interfaces.Cancelable;
import cl.duoc.interfaces.Despachable;
import cl.duoc.interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;



/**
 * Clase base abstracta que representa la información general de los pedidos en
 * el sistema SpeedFast.
 * Cuenta con un metodo concreto 'asignarRepartidor()', un metodo 'mostrarResumen()'
 * y un metodo abstracto 'calcularTiempoEntrega()'
 *
 * @author KatherineAvila
 */
public abstract class Pedido implements Cancelable, Rastreable, Despachable {

   protected String idPedido;
   protected String direccionEntrega;
   protected double distanciaKm;
   protected String tipoPedido;
   protected String guardarRepartidor;
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
 * Muestra un mensaje por consola cuando el pedido haya sido despachado exitosamente
 */
    @Override
    public void despachar() {

        System.out.println("Pedido despachado correctamente");
        historial.add("- Pedido " + tipoPedido +  idPedido +" - entregado por " + guardarRepartidor);
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando pedido " + tipoPedido + " #" + idPedido + " ...");
        System.out.println(">> Pedido cancelado correctamente");
    }

    @Override
    public List<String> verHistorial() {
        return new ArrayList<>(historial);
    }

    public void mostrarTodosHistorial() {
        for (String verHistorial : verHistorial()) {
            System.out.println(verHistorial);
        }

    }

    /**
     * Metodo mostrarResumen() muestra un resumen de la información
     * general de todos los pedidos
     */
    public void mostrarResumen(){
        System.out.println("Pedido de " + this.tipoPedido);
        System.out.println("ID: "+ idPedido);
        System.out.println("Dirección: "+ direccionEntrega);
        System.out.println("Distancia: "+ distanciaKm);
    }

    /**
     * Metodo abstracto para ser implementador de forma
     * distinta en cada subclase.
     * Calcula el tiempo de entrega según la distancia en km en cada tipo de pedido
     */

    public abstract void calcularTiempoEntrega();

    /**
     * Metodo general destinado a sobreescribirse en las clases hijas
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
