package pROJETO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		aluno1.setNome("kawan");
		aluno1.setEndere�o("copa");
		aluno1.setCPF("1234");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome(aluno1.getNome());
		aluno2.setEndere�o(aluno1.getEndere�o());
		aluno2.setCPF(aluno1.getCPF());
		
		System.out.println(aluno1.getNome());
		
		aluno1.exibeAluno();
		aluno2.exibeAluno();
		
	}
	

}
