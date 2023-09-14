package aula4;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String nomeFantasia;
	
	public void mandarEmail() {
		System.out.println("Enviar email para " + "maca@atendimentopj.com.br");
		super.mandarEmail();
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
