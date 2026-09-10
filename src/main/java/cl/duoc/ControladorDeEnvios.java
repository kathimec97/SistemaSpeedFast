package cl.duoc;

import cl.duoc.interfaces.Despachable;
import cl.duoc.interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase controladora encargada de orquestar el despacho y la trazabilidad de los pedidos.
 * <p>
 * Implementa las interfaces Despachable y Rastreable, desacoplando la logística de las entidades concretas
 * de pedido. Mantiene un registro histórico de todas las entregas confirmadas.
 *
 * @author Katherine Avila
 */

public class ControladorDeEnvios implements Despachable, Rastreable {
    private final List<Pedido> pedido = new ArrayList<>();
    private final List<String> historial = new ArrayList<>();


    /**
     * Agrega los pedidos a la lista de 'pedido'
     *
     * @param pedido
     */
    public void agregarPedido(Pedido pedido) {
        this.pedido.add(pedido);
    }

    /**
     * Despacha el primer pedido disponible en la lista de espera.
     * <p>
     * Válida que la lista de pedido no esté vacía y extrae el elemento registrado
     * previamente mediante el método 'agregarPedido'.
     * Luego, verifica si el pedido cuenta con un repartidor asignado:
     * Si tiene repartidor: guarda el registro en el historial y muestra un mensaje de éxito.
     * Si no tiene repartidor: muestra un mensaje de error por consola y no lo registra en el historial.
     */
    @Override
    public void despachar() {
        if (!pedido.isEmpty()) {
            Pedido p = pedido.remove(0);
            if (p.isTieneRepartidor()) {
                historial.add("- Pedido " + p.getTipoPedido() + " " + p.getIdPedido() + " - " + "entregado por " + p.getGuardarRepartidor());
                System.out.println("Pedido despachado correctamente");
            } else {
                System.out.println("No se pudo despachar el pedido porque no tiene repartidor asignado.");
            }
        }
    }

    /**
     * Retorna una lista de historial para su visualización.
     *
     * @return una nueva lista con los eventos registrados en el historial
     */
    @Override
    public List<String> verHistorial() {
        return new ArrayList<>(historial);
    }

    /**
     * Permite imprimir en consola todo los eventos del historial.
     */
    public void mostrarTodosHistorial() {
        for (String verHistorial : verHistorial()) {
            System.out.println(verHistorial);
        }

    }
}


