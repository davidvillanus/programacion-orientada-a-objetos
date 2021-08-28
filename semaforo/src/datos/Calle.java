public class Calle {
	//atributos
	private String orientacion;
	private int[] Carros;
	//Constructor
	public Calle(String orientacion, int[] Carros) {
		this.orientacion = orientacion;
		this.Carros = Carros;
	}
	//metodos
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	public int[] getCarros() {
		return Carros;
	}
	public void setCarros(int[] Carros) {
		this.Carros = Carros;
	}

}