package aula4;

public class Pessoa {
	private String nome;
	private String email;
	
	public void mandarEmail() {
		System.out.println("Email enviado para " + this.email);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
