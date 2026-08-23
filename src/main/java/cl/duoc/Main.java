package cl.duoc;




public class Main {
    public static void main(String[] args) {

        /**
         * Prueba de la Clase PedidoExpress
*/
    PedidoExpress p1 = new PedidoExpress("E01", "Lago Lanalhue 1280", 6, "Farmacia", 15, true);
    PedidoExpress p2 = new PedidoExpress("E02", "Vicente Mendez 800", 12.5, "Farmacia", 30, true);
    PedidoExpress p3 = new PedidoExpress("E03", "villa Rosario 200", 5, "Farmacia", 10, false);
    PedidoExpress p4 = new PedidoExpress("E04", "Callejon Diagon 174", 4.5, "supermercado", 15, true);
    PedidoExpress p5 = new PedidoExpress("E05", "TVA 000", 3.2, "Supermercado", 35, true);
    PedidoExpress p6 = new PedidoExpress("E06", "Asgard 074", 8.2, "Supermercado", 20, false);

    //tipo comercio: Farmacia,
    p1.mostrarResumen();
    p1.calcularTiempoEntrega();

//tipo comercio: Farmacia
    p2.mostrarResumen();
    p2.calcularTiempoEntrega();

//tipo comercio: Farmacia
    p3.mostrarResumen();
    p3.calcularTiempoEntrega();

//tipo comercio: supermercado
    p4.mostrarResumen();
    p4.calcularTiempoEntrega();

//tipo comercio: supermercado,
        p5.mostrarResumen();
        p5.calcularTiempoEntrega();

//tipo comercio: supermercado
        p6.mostrarResumen();
        p6.calcularTiempoEntrega();


        /**
         * Prueba clase PedidoComida
        */
        PedidoComida c1= new PedidoComida("C06", "Eternia 548", 1, true);
       PedidoComida c2= new PedidoComida("C07", "El pantano 100", 7.3, false);

        c1.mostrarResumen();
        c1.calcularTiempoEntrega();

        c2.mostrarResumen();
        c2.calcularTiempoEntrega();

        /**
         * Prueba clase PedidoEncomienda
        */
        PedidoEncomienda e1 = new PedidoEncomienda("E01", "Plataforma 934",0.8,6,"Documento");
        PedidoEncomienda e2 = new PedidoEncomienda("E02", "Velaris 210",2.8,8,"Documento");
        PedidoEncomienda e3 = new PedidoEncomienda("E03", "Campamento Mestizo 400",3.0,5.3,"Documento");
        PedidoEncomienda e4 = new PedidoEncomienda("E04", "Macondo 30",26.2,3.1,"Paquete");

        PedidoEncomienda e5 = new PedidoEncomienda("E05", "Bedford Street 90",20,30,"Paquete");
        PedidoEncomienda e6 = new PedidoEncomienda("E06", "Bleecker Street 177A",30,5.1,"Paquete");
        PedidoEncomienda e7 = new PedidoEncomienda("E07", "Narnia 004",15,12.6,"Caja");

//Tipo Embalaje: Documento, peso: 0.8 (dentro del rango)
        e1.mostrarResumen();
        e1.calcularTiempoEntrega();

//Tipo embalaje: documento, peso: 1.4 (dentro del rango)
        e2.mostrarResumen();
        e2.calcularTiempoEntrega();

//Tipo embalaje: documento, peso: 3.0 (fuera del rango)
        e3.mostrarResumen();
        e3.calcularTiempoEntrega();

  //Tipo embalaje: sobre (equivocado), peso: 0.2 (dentro del rango)
        e4.mostrarResumen();
        e4.calcularTiempoEntrega();

        //tipo embalaje: Paquete, peso: 20 (dentro del rango)
        e5.mostrarResumen();
        e5.calcularTiempoEntrega();

        //tipo Embalaje: paquete, peso: 30 (fuera del rango)
        e6.mostrarResumen();
        e6.calcularTiempoEntrega();

//tipo embalaje: Caja (equivocado), peso: 15 (dentro del rango)
        e7.mostrarResumen();
        e7.calcularTiempoEntrega();
    }
}