package herencias;

public class Motocicleta extends VehiculoTerrestre {
	private boolean tieneSidecar;
	private String tipoManillar;

	public Motocicleta(String marca, String modelo, int año, int numRuedas, String tipoCombustible,
			boolean tieneSidecar, String tipoManillar) {
		super(marca, modelo, año, numRuedas, tipoCombustible);
		this.tieneSidecar = tieneSidecar;
		this.tipoManillar = tipoManillar;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No") + ", Tipo de manillar: " + tipoManillar);
	}

	public void hacerCaballito() {
		System.out.println("La motocicleta está haciendo un caballito!");
	}
}
