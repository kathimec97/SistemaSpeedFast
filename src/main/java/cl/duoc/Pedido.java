package cl.duoc;

/**
 * Clase base abstracta que representa la información general de los pedidos en
 * el sistema SpeedFast.
 * Cuenta con un metodo concreto 'asignarRepartidor()', un metodo 'mostrarResumen()'
 * y un metodo abstracto 'calcularTiempoEntrega()'
 *
 * @author KatherineAvila
 */
public abstract class Pedido {

   protected String idPedido;
   protected String direccionEntrega;
   protected double distanciaKm;

   public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
       this.idPedido = idPedido;
       this.direccionEntrega = direccionEntrega;
       this.distanciaKm = distanciaKm;
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

    /**
     * Metodo mostrarResumen() muestra un resumen de la información
     * general de todos los pedidos
     */
    public void mostrarResumen(){
        System.out.println("ID: "+ idPedido);
        System.out.println("Direccion: "+ direccionEntrega);
        System.out.println("Distancia: "+ distanciaKm);
    }

    /**
     * Metodo abstracto para ser implementador de forma
     * distinta en cada subclase.
     * Calcula el tiempo de entrega según la distancia en km en cada tipo de pedido
     */

    public abstract int calcularTiempoEntrega();

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
