package aula4;

public class Principal {
	public static void main(String[] args) {
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Apple");
		pj1.setCnpj("5656565656-00001/25");
		pj1.setEmail("atendimento@apple.com");
		pj1.setNomeFantasia("Apple do Brasil");
		pj1.mandarEmail();
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Steve Jobs");
		pf1.setCpf("456.854.888-87");
		pf1.setEmail("sj@apple.com");
		pf1.setGenero("Masculino");
		pf1.mandarEmail();
	}
}
