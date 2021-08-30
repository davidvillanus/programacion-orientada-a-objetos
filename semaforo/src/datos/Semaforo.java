public class Semaforo {
	//atributos
	private String orientation;
	private String color;
	//Constructor
	public Semaforo(String orientation, String color) {
		this.orientation = orientation;
		this.color = color;
	}
//metodos

	public void AtravezarIntercepcion(Calle calle, long timeStamp) {
		if (color=="verde"){
			System.out.println("El semaforo" + this.orientation +
				" Esta en color " + this.color +
				" Carros comienzan a cruzar " +  
				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				" seg");
			for (int i = 0; i < 5; i++) { 
				this.esperarXsegundos(calle.getCarros()[i]);
				System.out.println("Calle " + getOrientacion() + " Han cruzando " + (i + 1) +" carros " +  
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				" seg");
			}
			
		}
			
		else{
			System.out.println("El semaforo" + this.orientation + 
			" Esta en color "+ this.color+
			" Carros estan parados " +  
			" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
			" seg");
			for (int i = 0; i <5; i++) { 
				this.esperarXsegundos(calle.getCarros()[i]); 
				System.out.println("Calle " + getOrientacion() + " Hay " + (i + 1) + " Carros parados " + 
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				" seg");

		}
	}

	System.out.println("EL SEMAFORO " + this.orientation+ " HA CAMBIADO DE COLOR EN EL TIEMPO: " + 
	(System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	if (color=="verde"){
		setColor("rojo");
	}
	else {
		setColor("verde");
	}
	if (color=="verde"){
		System.out.println("El semaforo " + this.orientation +
			" Esta en color" + this.color +
			" Carros comienzan a cruzar " + 
			" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
			"seg");
		for (int i = 5; i <10; i++) { 
			this.esperarXsegundos(calle.getCarros()[i]);
			System.out.println("Calle " + getOrientacion() + " Han cruzando " + (i + 1) + " carros " +   
			" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
			"seg");
		}
	}
		
	else{
		System.out.println("El semaforo " + this.orientation + 
		" Esta en color "+ this.color+
		" Carros estan parados " +  
		" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
		"seg");
		for (int i = 0; i<10; i++) { 
			this.esperarXsegundos(calle.getCarros()[i]); 
			System.out.println("Calle " + getOrientacion() + " Hay " + (i + 1) + " Carros parados " +
			" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	}

}
System.out.println("EL SEMAFORO " + this.orientation+ " HA CAMBIADO DE COLOR EN EL TIEMPO: " + 
(System.currentTimeMillis() - timeStamp) / 1000 + "seg");
	}

	private void esperarXsegundos (int segundos)  {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	public String getOrientacion() {	
		return orientation;
	}
	
	public void setOrientacion(String orientation)  {
		this.orientation = orientation;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}