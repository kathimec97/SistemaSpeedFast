![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Caso: SpeedFast– Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** [Katherine del Carmen Avila Mecía]
- **Sección:** [003A]
- **Carrera:** Analista Programador Computacional
- **Sede:** [Campus Virtual]

---

# 📒 Actividad: Explorando la sobrecarga y la sobre escritura en clases derivadas

## Clases principales
* **Modelo de datos**: Jerarquía de clases (`Pedido`, `PedidoComida`, `PedidoEncomienda`, `PedidoExpress`) que implementan herencia, sobrescritura y sobrecarga de métodos.
* **Instancia y pruebas mediante la clase `Main`**:

## Características destacadas
* **Herencia y Polimorfismo**: Uso de una superclase `Pedido` y de métodos sobrescritos y sobrecargados 'asignarRepartidor()' que se comporta de manera diferente según el tipo de pedido.
* **Manejo de Condiciones**: Validación de reglas de negocio como tiempo de llegada, tipo de comercio, disponibilidad del repartidor, si tiene mochila o si el envío está dentro del rango de peso y características de embalaje.
* **Visualización por consola** del sistema.

## Instrucciones de ejecución
1. Asegúrate de tener configurado el JDK en tu entorno (IntelliJ IDEA recomendado).
2. Clona o descarga este repositorio en tu computadora local.
3. Navega hasta el paquete `cl.duoc.SistemaSpeedFast.main` y ejecuta la clase principal `Main.java`.

## 📂 Estructura General del Proyecto

```plaintext
SistemaSpeedFast/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── cl/duoc/
│   │   │       ├── Main.java
│   │   │       ├── Pedido.java
│   │   │       ├── PedidoComida.java
│   │   │       ├── PedidoEncomienda.java
│   │   │       └── PedidoExpress.java
│   │   └── resources/
│   └── test/
├── target/
├── .gitignore
├── pom.xml
└── README.md