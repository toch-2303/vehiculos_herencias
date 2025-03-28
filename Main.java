package herencias;

public class Main {
	public static void main(String[] args) {
		// Crear instancias de diferentes vehículos
		Automovil auto = new Automovil("Toyota", "Corolla", 2022, 4, "Gasolina", 4, "Automática");
		Motocicleta moto = new Motocicleta("Honda", "CBR600", 2021, 2, "Gasolina", false, "Deportivo");
		Barco velero = new Barco("Beneteau", "Oceanis", 2020, 12.5, 2.3, 2, "Quillote");
		Submarino submarino = new Submarino("General Dynamics", "Virginia", 2019, 115, 10.5, 500, true);

		// Mostrar información de los vehículos
		System.out.println("=== Información del Automóvil ===");
		auto.mostrarInfo();
		auto.arrancar();
		auto.conducir();
		auto.abrirMaletero();

		System.out.println("\n=== Información de la Motocicleta ===");
		moto.mostrarInfo();
		moto.arrancar();
		moto.hacerCaballito();

		System.out.println("\n=== Información del Barco ===");
		velero.mostrarInfo();
		velero.arrancar();
		velero.navegar();
		velero.izarVelas();

		System.out.println("\n=== Información del Submarino ===");
		submarino.mostrarInfo();
		submarino.arrancar();
		submarino.sumergir();

		// Polimorfismo: tratar todos como Vehiculo
		System.out.println("\n=== Demostración de polimorfismo ===");
		Vehiculo[] vehiculos = { auto, moto, velero, submarino };

		for (Vehiculo v : vehiculos) {
			System.out.println("\n--- Procesando vehículo ---");
			v.mostrarInfo();
			v.arrancar();

			// Verificar el tipo específico para llamar a métodos exclusivos
			if (v instanceof Automovil) {
				((Automovil) v).abrirMaletero();
			} else if (v instanceof Motocicleta) {
				((Motocicleta) v).hacerCaballito();
			} else if (v instanceof Barco) {
				((Barco) v).izarVelas();
			} else if (v instanceof Submarino) {
				((Submarino) v).sumergir();
			}
		}
	}
}
