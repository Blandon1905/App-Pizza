README.md
#  Pizza – Sistema de Gestión de Pedidos

## Objetivo

Desarrollar una aplicación en **Java** que permita comprender el funcionamiento de la estructura de datos **Pila (Stack)** mediante un simulador de gestión de pedidos para una pizzería, implementando operaciones de **Registrar, Deshacer (Undo) y Rehacer (Redo)**.

---

## Tecnologías utilizadas

* Java
* VS Code
* JDK Eclipse Temurin
* GitHub

---

## Estructura del proyecto

```
Pizza
│
├── Pizza.java
├── Nodo.java
├── Pila.java
├── GestionPedidos.java
├── Main.java

README.md
```

**Pizza.java** → Modelo de datos de la pizza (nombre + 3 ingredientes).
**Nodo.java** → Nodo de la lista ligada.
**Pila.java** → Implementación manual de la pila con métodos `push`, `pop`, `peek`, `isEmpty`.
**GestionPedidos.java** → Controla las operaciones de pedidos usando dos pilas (Undo/Redo).
**Main.java** → Menú interactivo del sistema.

---

## Funcionamiento

El sistema utiliza **dos pilas**:

* **Pila Principal** → Guarda los pedidos activos.
* **Pila Secundaria** → Guarda los pedidos deshechos para poder rehacerlos.

Operaciones disponibles:

1. Registrar Pizza
2. Deshacer pedido (Undo)
3. Rehacer pedido (Redo)
4. Mostrar pedido actual

---

## Ejecución del programa

Compilar:

```
javac *.java
```

Ejecutar:

```
java Main
```

---

## Capturas del programa



---

## Video de sustentación

Link del video explicativo:

```
PEGAR AQUÍ EL LINK DEL VIDEO
```

---

## Autor

Samuel Blandon Sanchez
Proyecto desarrollado en Java usando pilas manuales con listas ligadas.