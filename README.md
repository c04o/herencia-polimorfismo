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
        #String marca
        #String modelo
        +Vehiculo(marca, modelo)
        +getMarca() String
        +getModelo() String
        +mover()*
    }
    
    class Combustible {
        <<interface>>
        +recargar(cantidad double)*
        +getTipoCombustible() String*
    }
    
    class Carro {
        -double nivelCombustible
        -static final String TIPO_COMBUSTIBLE
        +Carro(marca, modelo)
        +mover()
        +recargar(cantidad double)
        +getTipoCombustible() String
        +getNivelCombustible() double
        +abrirMaletero()
    }
    
    class Moto {
        +Moto(marca, modelo)
        +mover()
        +hacerCaballito()
    }
    
    class Camion {
        -double capacidadCarga
        -double nivelCombustible
        -static final String TIPO_COMBUSTIBLE
        +Camion(marca, modelo, capacidadCarga)
        +mover()
        +recargar(cantidad double)
        +getTipoCombustible() String
        +getNivelCombustible() double
        +getCapacidadCarga() double
        +cargarMercancia()
    }
    
    class Main {
        +main(args String[])
    }
    
    Vehiculo <|-- Carro
    Vehiculo <|-- Moto
    Vehiculo <|-- Camion
    Combustible <|.. Carro
    Combustible <|.. Camion
    Main --> Vehiculo : usa
```
