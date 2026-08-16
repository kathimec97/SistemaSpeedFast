package cl.duoc;

/**
 * Clase base que representa la información general de los pedidos en
 * el sistema SpeedFast.
 * Cuenta con un método general 'asignarRepartidor()'
 * @author KatherineAvila
 */
public class Pedido {

   private String idPedido;
   private String direccionEntrega;
   private String tipoPedido;

   public Pedido(String idPedido, String direccionEntrega, String tipoPedido){
       this.idPedido = idPedido;
       this.direccionEntrega = direccionEntrega;
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

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

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
                "Tipo de Pedido: " + tipoPedido;
    }
}
