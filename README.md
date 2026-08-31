![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Caso: SpeedFast– Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** [Katherine del Carmen Avila Mecía]
- **Sección:** [003A]
- **Carrera:** Analista Programador Computacional
- **Bimestre:** 3
- **Sede:** [Campus Virtual]
---

---
# 🏁 Actividad Sumativa N.° 1  (24/08/2026-31/08/2026): Diseñando un sistema orientado a objetos con clases abstractas, polimorfismo e interfaces.

## Descripción del Proyecto:
 Sistema orientado a objetos desarrollado en Java que implementa Herencia, Abstracción, Polimorfismo, Interfaces, sobrescritura y sobrecarga de métodos.

### Clases principales
* **Modelo de datos**: Jerarquía de clases (`Pedido`, `PedidoComida`, `PedidoEncomienda`, `PedidoExpress`) que implementan Abstracción, polimorfismo, Interfaces, sobrescritura y sobrecarga de métodos.
* **Implementación de interfaces** (`Rastreable`, `Cancelable`, `Despachable`) y sus métodos (`verHistorial`, `cancelar()`, `despachar()`).
* **Instancia y pruebas mediante la clase `Main`**.

### Características destacadas
* **Abstracción y Polimorfismo**: mediante el uso de un conjunto de interfaces para definir contratos claros y estandarizar el comportamiento de los distintos tipos de pedidos
* asegurando un diseño desacoplado.
* `Rastreable`: Establece las operaciones de seguimiento, permitiendo almacenar y consultar un registro histórico de los pedidos entregados mediante el metodo `verHistorial`.
* `Despachable`: Define el contrato para la gestión de envíos mostrando un mensaje de despacho exitoso mediante `despachar()`.
* `Cancelable`: Proporciona el comportamiento para la anulación de pedidos dentro del sistema mediante `cancelar()`.

* **secuencia de ejecución en la clase `Main`**:
*  ↓ Creación de objetos para los distintos tipos de pedidos(`PedidoComida`, `PedidoEncomienda`, `PedidoExpress`).
*  ↓ Ejecución de reglas de negocio para mostrar resumen de pedido, asignar repartidores y calcular tiempos de entrega.
*  ↓ Verificación de estados para confirmar envíos exitosos y registrar los eventos.
*  ↓ Recorrido de la lista de pedidos para la visualización masiva del historial.



---
# 📒 Actividad Formativa N.º 2 (17/08/2026-24/08/2026): Definiendo una clase abstracta y su jerarquía.
## Clases principales
* **Modelo de datos**: Jerarquía de clases (`Pedido`, `PedidoComida`, `PedidoEncomienda`, `PedidoExpress`) que implementan Abstracción, Herencia, sobrescritura y sobrecarga de métodos.
* **Instancia y pruebas mediante la clase `Main`**.

## Características destacadas
* **Herencia y Polimorfismo**: Uso de una superclase abstracta `Pedido` y de métodos sobrescritos implementado como mostrarResumen() y abstracto como calcularTiempoEntrega() que se comporta de manera diferente según el tipo de pedido.
* **Manejo de Condiciones**: calcula tiempo de entrega de cada pedido según su propia lógica, con un tiempo base diferente para cada pedido, minutos extras variables y con 
* condiciones de tipo if/else validando que después de ciertos kilómetros se sumen minutos extras al reparto.
* **Visualización por consola** del sistema.

---
# 📒 Actividad Formativa N.º 1 (11/08/2026-17/08/2026): Explorando la sobrecarga y la sobre escritura en clases derivadas.

## Clases principales
* **Modelo de datos**: Jerarquía de clases (`Pedido`, `PedidoComida`, `PedidoEncomienda`, `PedidoExpress`) que implementan herencia, sobrescritura y sobrecarga de métodos.
* **Instancia y pruebas mediante la clase `Main`**:

## Características destacadas
* **Herencia y Polimorfismo**: Uso de una superclase `Pedido` y de métodos sobrescritos y sobrecargados 'asignarRepartidor()' que se comporta de manera diferente según el tipo de pedido.
* **Manejo de Condiciones**: Validación de reglas de negocio como tiempo de llegada, tipo de comercio, disponibilidad del repartidor, si tiene mochila o si el envío está dentro del rango de peso y características de embalaje.
* **Visualización por consola** del sistema.
---

## Instrucciones de ejecución
1. Asegúrate de tener configurado el JDK en tu entorno (IntelliJ IDEA recomendado).
2. Clona o descarga este repositorio en tu computadora local.
3. Navega hasta el paquete `cl.duoc.SistemaSpeedFast.main` y ejecuta la clase principal `Main.java`.
---

## 📂 Estructura General del Proyecto

```plaintext
SistemaSpeedFast/
│
├── src/
│   └── main/
│       └── java/
│           └── cl/
│               └── duoc/
│                   ├── interfaces/
│                   │   ├── Cancelable.java
│                   │   ├── Despachable.java
│                   │   └── Rastreable.java
│                   ├── Main.java
│                   ├── Pedido.java
│                   ├── PedidoComida.java
│                   ├── PedidoEncomienda.java
│                   └── PedidoExpress.java
│
├── pom.xml
└── README.md

---