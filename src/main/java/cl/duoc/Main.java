package cl.duoc;




public class Main {
    public static void main(String[] args) {

        /**
         * Prueba de la Clase PedidoExpress
         */
    PedidoExpress p1 = new PedidoExpress("E01", "Lago Lanalhue 1280", "Express", "Farmacia", 15, true);
    PedidoExpress p2 = new PedidoExpress("E02", "Vicente Mendez 800", "Express", "Farmacia", 30, true);
    PedidoExpress p3 = new PedidoExpress("E03", "villa Rosario 200", "Express", "Farmacia", 10, false);
    PedidoExpress p4 = new PedidoExpress("E04", "Callejon Diagon 174", "Express", "supermercado", 15, true);
    PedidoExpress p5 = new PedidoExpress("E05", "TVA 000", "Express", "Supermercado", 35, true);
    PedidoExpress p6 = new PedidoExpress("E06", "Asgard 074", "Express", "Supermercado", 20, false);

    //tipo comercio: Farmacia, tiempo de llegada: 15 (dentro del rango), con disponibilidad inmediata
    p1.asignarRepartidor();
    p1.asignarRepartidor("CarlosG");

//tipo comercio: Farmacia, tiempo llegada 30 (fuera del rango), con disponibilidad inmediata
    p2.asignarRepartidor();
    p2.asignarRepartidor("StefaniaM");

//tipo comercio: Farmacia, tiempo llegada 10 (dentro del rango), sin disponibilidad inmediata de repartidor
    p3.asignarRepartidor();
    p3.asignarRepartidor("NoeliaD");

//tipo comercio: supermercado, tiempo de llegada: 15 (dentro del rango), con disponibilidad inmediata
    p4.asignarRepartidor();
    p4.asignarRepartidor("HarryP");

//tipo comercio: supermercado, tiempo de llegada: 35 (fuera del rango), con disponibilidad inmediata
    p5.asignarRepartidor();
    p5.asignarRepartidor("Loki");


//tipo comercio: supermercado, tiempo de llegada: 20 (dentro del rango), sin disponibilidad inmediata
    p6.asignarRepartidor();
    p6.asignarRepartidor("Thor");

        /**
         * Prueba clase PedidoComida
         */

       PedidoComida c1= new PedidoComida("C06", "Eternia 548", "Comida", true);
       PedidoComida c2= new PedidoComida("C07", "El pantano 100", "Comida", false);
        //con mochila térmica
        c1.asignarRepartidor();
        c1.asignarRepartidor("Adam");
        //sin mochila térmica
        c2.asignarRepartidor();
        c2.asignarRepartidor("Fiona");

        /**
         * Prueba clase PedidoEncomienda
         */
    PedidoEncomienda e1 = new PedidoEncomienda("E01", "Plataforma 934","Encomienda",0.8,"Documento");
        PedidoEncomienda e2 = new PedidoEncomienda("E02", "Velaris 210","Encomienda",1.4,"documento");
        PedidoEncomienda e3 = new PedidoEncomienda("E03", "Campamento Mestizo 400","Encomienda",3.0,"Documento");
        PedidoEncomienda e4 = new PedidoEncomienda("E04", "Macondo 30","Encomienda",0.2,"Sobre");

        PedidoEncomienda e5 = new PedidoEncomienda("E05", "Bedford Street 90","Encomienda",20,"Paquete");
        PedidoEncomienda e6 = new PedidoEncomienda("E06", "Bleecker Street 177A","Encomienda",30,"Paquete");
        PedidoEncomienda e7 = new PedidoEncomienda("E07", "Narnia 004","Encomienda",15,"Caja");

//Tipo Embalaje: Documento, peso: 0.8 (dentro del rango)
        e1.asignarRepartidor();
        e1.asignarRepartidor("Hagrid");

//Tipo embalaje: documento, peso: 1.4 (dentro del rango)
        e2.asignarRepartidor();
        e2.asignarRepartidor("Feyre");

//Tipo embalaje: documento, peso: 3.0 (fuera del rango)
        e3.asignarRepartidor();
        e3.asignarRepartidor("Hermes");

  //Tipo embalaje: sobre (equivocado), peso: 0.2 (dentro del rango)
        e4.asignarRepartidor();
        e4.asignarRepartidor("AurelianoB");

        //tipo embalaje: Paquete, peso: 20 (dentro del rango)
        e5.asignarRepartidor();
        e5.asignarRepartidor("MonicaG");

        //tipo Embalaje: paquete, peso: 30 (fuera del rango)
        e6.asignarRepartidor();
        e6.asignarRepartidor("StevenS");

//tipo embalaje: Caja (equivocado), peso: 15 (dentro del rango)
        e7.asignarRepartidor();
        e7.asignarRepartidor("LucyP");
    }
}