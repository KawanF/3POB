package pROJETO;

public class Aluno {
	private String Nome;
	private String Enderešo;
	private String CPF;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEnderešo() {
		return Enderešo;
	}
	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public void exibeAluno() {
		
		System.out.println("Nome: "+ Nome);
		System.out.println("Enderešo: "+ Enderešo);
		System.out.println("CPF: "+ CPF);
	}
}

