package pROJETO;

public class Aluno {
	private String Nome;
	private String Endere�o;
	private String CPF;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public void exibeAluno() {
		
		System.out.println("Nome: "+ Nome);
		System.out.println("Endere�o: "+ Endere�o);
		System.out.println("CPF: "+ CPF);
	}
}

