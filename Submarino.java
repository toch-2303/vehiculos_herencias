package herencias;

public class Submarino extends VehiculoMaritimo {
	private double profundidadMaxima;
	private boolean nuclear;

	public Submarino(String marca, String modelo, int año, double eslora, double calado, double profundidadMaxima,
			boolean nuclear) {
		super(marca, modelo, año, eslora, calado);
		this.profundidadMaxima = profundidadMaxima;
		this.nuclear = nuclear;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println(
				"Profundidad máxima: " + profundidadMaxima + " metros, " + "Es nuclear: " + (nuclear ? "Sí" : "No"));
	}

	public void sumergir() {
		System.out.println("El submarino se está sumergiendo...");
	}
}
