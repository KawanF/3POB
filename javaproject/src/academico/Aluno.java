package academico;

public class Aluno {
	private String matricula;
	private String nome;
	private String endereço;
	private String cpf;
	
	public Aluno(String _matricula, String _nome, String _endereço, String _cpf) {
		matricula = _matricula;
		nome = _nome;
		endereço = _endereço;
		cpf = _cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
