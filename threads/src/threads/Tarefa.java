package threads;

public class Tarefa extends Thread{
	
	public int contador;
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			contador++;
		}

	}
	
}
