package threads;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarefa t = new Tarefa();
		t.start(); 
		System.out.println(t.contador);
		
	}

}
