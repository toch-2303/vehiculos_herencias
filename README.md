# Sistema de Jerarquía de Vehículos en Java

Este proyecto demuestra el uso de herencia, polimorfismo y encapsulamiento en Java mediante un sistema de clasificación de vehículos.

## Estructura de Clases

### Clase Base
- **`Vehiculo`**: Clase abstracta que define propiedades y comportamientos comunes a todos los vehículos.
  - Atributos: marca, modelo, año
  - Métodos: arrancar(), detener(), mostrarInfo()

### Vehículos Terrestres
- **`VehiculoTerrestre`** (extiende `Vehiculo`)
  - Atributos adicionales: número de ruedas, tipo de combustible
  - Métodos adicionales: conducir()

- **`Automovil`** (extiende `VehiculoTerrestre`)
  - Atributos adicionales: número de puertas, tipo de transmisión
  - Métodos adicionales: abrirMaletero()

- **`Motocicleta`** (extiende `VehiculoTerrestre`)
  - Atributos adicionales: tieneSidecar, tipo de manillar
  - Métodos adicionales: hacerCaballito()

### Vehículos Marítimos
- **`VehiculoMaritimo`** (extiende `Vehiculo`)
  - Atributos adicionales: eslora, calado
  - Métodos adicionales: navegar()

- **`Barco`** (extiende `VehiculoMaritimo`)
  - Atributos adicionales: número de velas, tipo de casco
  - Métodos adicionales: izarVelas()

- **`Submarino`** (extiende `VehiculoMaritimo`)
  - Atributos adicionales: profundidad máxima, es nuclear
  - Métodos adicionales: sumergir()

## Características Implementadas

1. **Herencia**:
   - Uso de `extends` para crear jerarquías de clases
   - Herencia multinivel (Vehiculo → VehiculoTerrestre → Automovil)

2. **Polimorfismo**:
   - Sobrescritura de métodos (override)
   - Uso de instancias en colecciones del tipo base

3. **Encapsulamiento**:
   - Uso adecuado de modificadores de acceso (public, protected, private)
   - Métodos accesores para propiedades privadas

4. **Métodos específicos**:
   - Cada subclase implementa comportamientos únicos

## Ejemplo de Uso

```java
// Crear instancias
Automovil auto = new Automovil("Toyota", "Corolla", 2022, 4, "Gasolina", 4, "Automática");
Submarino submarino = new Submarino("General Dynamics", "Virginia", 2019, 115, 10.5, 500, true);

// Usar polimorfismo
Vehiculo[] vehiculos = {auto, submarino};
for (Vehiculo v : vehiculos) {
    v.mostrarInfo();
    v.arrancar();
}