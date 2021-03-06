package academico;

public class Aluno {
	private String matricula;
	private String nome;
	private String enderešo;
	private String cpf;
	
	public Aluno(String _matricula, String _nome, String _enderešo, String _cpf) {
		matricula = _matricula;
		nome = _nome;
		enderešo = _enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
