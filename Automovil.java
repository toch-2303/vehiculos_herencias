package herencias;

public class Automovil extends VehiculoTerrestre {
	private int numPuertas;
	private String tipoTransmision;

	public Automovil(String marca, String modelo, int año, int numRuedas, String tipoCombustible, int numPuertas,
			String tipoTransmision) {
		super(marca, modelo, año, numRuedas, tipoCombustible);
		this.numPuertas = numPuertas;
		this.tipoTransmision = tipoTransmision;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Número de puertas: " + numPuertas + ", Transmisión: " + tipoTransmision);
	}

	public void abrirMaletero() {
		System.out.println("Abriendo el maletero del automóvil...");
	}
}
