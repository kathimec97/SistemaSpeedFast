package cl.duoc;

import cl.duoc.interfaces.Cancelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase base abstracta que representa la información general de los pedidos en
 * el sistema SpeedFast.
 *
 * @author KatherineAvila
 */
public abstract class Pedido implements Cancelable {

    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String tipoPedido;
    protected String guardarRepartidor;
    protected boolean tieneRepartidor = false;


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

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setGuardarRepartidor(String guardarRepartidor) {
        this.guardarRepartidor = guardarRepartidor;
    }

    public String getGuardarRepartidor() {
        return guardarRepartidor;
    }

    public boolean isTieneRepartidor() {
        return tieneRepartidor;
    }

    public void setTieneRepartidor(boolean tieneRepartidor) {
        this.tieneRepartidor = tieneRepartidor;
    }

    /**
     * Arroja un mensaje por consola con la confirmación de pedido cancelado exitosamente.
     */
    @Override
    public void cancelar() {
        System.out.println("Cancelando Pedido: " + this.tipoPedido + " #" + this.idPedido);
        System.out.println("-> Pedido cancelado exitosamente.");
    }

    /**
     * Método abstracto para ser implementador de forma
     * distinta en cada subclase.
     * Calcula el tiempo de entrega según la distancia en km en cada tipo de pedido
     */

    public abstract int calcularTiempoEntrega();

    /**
     * Método mostrarResumen() muestra un resumen de la información
     * general de todos los pedidos
     */
    public void mostrarResumen() {
        System.out.println("Pedido " + this.tipoPedido);
        System.out.println("ID: " + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " Km");
    }

    /**
     * Método general destinado a sobreescribirse en las clases hijas
     * para personalización
     */
    public void asignarRepartidor() {
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
