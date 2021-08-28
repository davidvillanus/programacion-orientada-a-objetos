public class MainRunnable implements Runnable{
	
	private Calle Calle;
	private Semaforo Semaforo;
	private long initialTime;
	
	public MainRunnable (Calle Calle, Semaforo Semaforo, long initialTime){
		this.Calle = Calle;
		this.Semaforo = Semaforo;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Calle Carro1 = new Calle("Carro 1", new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35});
		Calle Carro2 = new Calle("Carro 2", new int[] { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35 });
		
		Semaforo Sem1 = new Semaforo("Norte_Sur","verde");
		Semaforo Sem2 = new Semaforo("Oeste_Este","rojo");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new MainRunnable(Carro1, Sem1, initialTime);
		Runnable proceso2 = new MainRunnable(Carro2, Sem2, initialTime);
		
		new Thread(proceso1).start();
		new Thread(proceso2).start();

	}

	@Override
	public void run() {
		this.Semaforo.AtravezarIntercepcion(this.Calle, this.initialTime);
	}

}