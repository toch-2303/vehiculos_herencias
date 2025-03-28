package herencias;

public class VehiculoMaritimo extends Vehiculo {
	protected double eslora; // longitud
	protected double calado; // profundidad que alcanza bajo el agua

	public VehiculoMaritimo(String marca, String modelo, int año, double eslora, double calado) {
		super(marca, modelo, año);
		this.eslora = eslora;
		this.calado = calado;
	}

	@Override
	public void arrancar() {
		System.out.println("Encendiendo motores del vehículo marítimo...");
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Eslora: " + eslora + " metros, Calado: " + calado + " metros");
	}

	public void navegar() {
		System.out.println("El vehículo marítimo está navegando...");
	}
}
