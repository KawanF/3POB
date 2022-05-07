package pROJETO;

public class Aluno {
	private String Nome;
	private String Endereço;
	private String CPF;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public void exibeAluno() {
		
		System.out.println("Nome: "+ Nome);
		System.out.println("Endereço: "+ Endereço);
		System.out.println("CPF: "+ CPF);
	}
}

