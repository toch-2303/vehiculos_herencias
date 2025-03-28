package herencias;

public class Barco extends VehiculoMaritimo {
	private int numVelas;
	private String tipoCasco;

	public Barco(String marca, String modelo, int año, double eslora, double calado, int numVelas, String tipoCasco) {
		super(marca, modelo, año, eslora, calado);
		this.numVelas = numVelas;
		this.tipoCasco = tipoCasco;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Número de velas: " + numVelas + ", Tipo de casco: " + tipoCasco);
	}

	public void izarVelas() {
		System.out.println("Izando las " + numVelas + " velas del barco...");
	}
}
