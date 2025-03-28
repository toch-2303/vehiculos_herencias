package herencias;

public class VehiculoTerrestre extends Vehiculo {
	protected int numRuedas;
	protected String tipoCombustible;

	public VehiculoTerrestre(String marca, String modelo, int año, int numRuedas, String tipoCombustible) {
		super(marca, modelo, año);
		this.numRuedas = numRuedas;
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Número de ruedas: " + numRuedas + ", Tipo de combustible: " + tipoCombustible);
	}

	public void conducir() {
		System.out.println("Conduciendo el vehículo terrestre...");
	}
}
