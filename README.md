## Instrucciones:
- Crea una clase abstracta `Vehiculo` con atributos `marca` y `modelo`, y un método abstracto `mover()`.
- Implementa subclases como  `Carro`, `Moto` y `Camion`, cada una sobrescribiendo `mover()`.
- Crea una interfaz `Combustible` con un método `recargar()`. Haz que `Carro` y `Camion` la implementen.
- En el `main`, genera un arreglo de `Vehiculo` e invoca sus métodos polimórficamente.
- Entrega esperada: Repositorio con código documentado + un diagrama sencillo de la jerarquía de clases.

## Diagrama de jerarquía de clases

```mermaid
classDiagram
    direction LR
    
    class Vehiculo {
        <<abstract>>
        -String marca
        -String modelo
        +Vehiculo(marca, modelo)
        +mover()*
        +getMarca() String
        +getModelo() String
    }
    
    class Combustible {
        <<interface>>
        +recargar()*
    }
    
    class Carro {
        -int capacidadCombustible
        +Carro(marca, modelo, capacidad)
        +mover()
        +recargar()
        +getCapacidadCombustible() int
    }
    
    class Moto {
        -int cilindrada
        +Moto(marca, modelo, cilindrada)
        +mover()
        +getCilindrada() int
    }
    
    class Camion {
        -double capacidadCarga
        +Camion(marca, modelo, capacidadCarga)
        +mover()
        +recargar()
        +getCapacidadCarga() double
    }
    
    class Main {
        +main()
    }
    
    Vehiculo <|-- Carro
    Vehiculo <|-- Moto
    Vehiculo <|-- Camion
    Combustible <|.. Carro
    Combustible <|.. Camion
    Main --> Vehiculo
```
