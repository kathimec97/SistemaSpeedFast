package cl.duoc;


import java.util.ArrayList;
import java.util.List;

/**
 * Flujo de ejecución del programa SpeedFast
 * @author Katherine Avila
 */
public class Main {
    public static void main(String[] args) {

List<Pedido> misPedidos = new ArrayList<>();

        PedidoExpress e1 = new PedidoExpress("[E01]", "Lago Lanalhue 1280", 6, "Express", "Farmacia", 15, false);
        PedidoExpress e2 = new PedidoExpress("[E02]", "Vicente Mendez 800", 12.5, "Express", "Supermercado", 30, true);
        PedidoComida c3 = new PedidoComida("[C03]", "Eternia 548", 1, "Comida", false);
        PedidoComida c4 = new PedidoComida("[C04]", "El Pantano 100", 7.3, "Comida", true);
        PedidoEncomienda en5 = new PedidoEncomienda("[E05]", "Plataforma 934", 0.8, 6, "Encomienda", "Documento");
        PedidoEncomienda en6 = new PedidoEncomienda("[E06]", "Velaris 210", 2.8, 8, "Encomienda", "Paquete");


        //Pedidos Express--------------------
            System.out.println("...........................");
        e1.mostrarResumen();
        e1.asignarRepartidor();
        e1.asignarRepartidor("Fabiola Ramirez");
        e1.calcularTiempoEntrega();
        e1.despachar();
        misPedidos.add(e1);
            System.out.println("..........................");
        e2.mostrarResumen();
        e2.asignarRepartidor();
        e2.asignarRepartidor("Carmen Landaeta");
        e2.calcularTiempoEntrega();
        e2.despachar();
        misPedidos.add(e2);

        //Pedidos Comida--------------------
            System.out.println("...........................");
        c3.mostrarResumen();
        c3.asignarRepartidor();
        c3.asignarRepartidor("Adam");
        c3.calcularTiempoEntrega();
        c3.despachar();
        misPedidos.add(c3);
            System.out.println("...........................");
        c4.mostrarResumen();
        c4.asignarRepartidor();
        c4.asignarRepartidor("Sherk");
        c4.calcularTiempoEntrega();
        c4.despachar();
        misPedidos.add(c4);
            System.out.println("...........................");
        //Pedidos Encomienda
        en5.mostrarResumen();
        en5.asignarRepartidor();
        en5.asignarRepartidor("Hagrid");
        en5.calcularTiempoEntrega();
        en5.despachar();
        misPedidos.add(en5);
            System.out.println("...........................");
        en6.mostrarResumen();
        en6.asignarRepartidor();
        en6.asignarRepartidor("Rhysand");
        en6.calcularTiempoEntrega();
        en6.despachar();
        misPedidos.add(en6);
            System.out.println("...........................");

        // ----- Cancelar Pedidos-----

            //No tiene disponibilidad
            e1.cancelar();
            //No tiene mochila
            c3.cancelar();
            System.out.println("...........................");

        //------ Historial de Pedidos-----
        for(Pedido p : misPedidos){
            for(String evento : p.verHistorial()) {
                System.out.println(evento);
            }
        }
}
}