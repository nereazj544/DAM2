package Tema2.Ejemplos;

public class UnHilo extends Thread {

	 //esta invocando al que recibe un String
public UnHilo(int id) {
	super("hilo " + id);
}

 
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
			}
			System.out.println(getName() + ", mensaje " + i);
		}
	}
}
