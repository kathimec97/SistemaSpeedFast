package cl.duoc;

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

    public void asignarRepartidor(){
        System.out.println("Pedido asignando repartidor");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido='" + idPedido + '\'' +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", tipoPedido='" + tipoPedido + '\'' +
                '}';
    }
}
