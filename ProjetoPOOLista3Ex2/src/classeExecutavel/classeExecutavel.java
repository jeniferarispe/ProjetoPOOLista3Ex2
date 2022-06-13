package classeExecutavel;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Endereco;
import model.Faculdade;
import model.Notas;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Usando set
		Endereco enderecoAluno1 = new Endereco();
		enderecoAluno1.setNomeRua("Rua 740");
		enderecoAluno1.setNumero(488);
		enderecoAluno1.setBairro("Morgado Rosa");
		enderecoAluno1.setCidade("Bage");
		
		enderecoAluno1.setUf("Rs");;
		enderecoAluno1.setComplemento("Abcdefg");
		enderecoAluno1.setCep(1234567);

		// Usando set
		Endereco enderecoFaculdade1 = new Endereco();
		enderecoFaculdade1.setNomeRua("Rua Oliveira");
		enderecoFaculdade1.setNumero(4120);
		enderecoFaculdade1.setBairro("Centro");
		enderecoFaculdade1.setCidade("Bage");
		enderecoFaculdade1.setUf("Rs");
		enderecoFaculdade1.setComplemento("hasuusd");
		enderecoFaculdade1.setCep(777777777);

		Notas notasAluno1 = new Notas();
		notasAluno1.setNota1(12);
		notasAluno1.setNota2(21);
		notasAluno1.setNota3(10);
		// Sobrecarregado

		Aluno aluno1 = new Aluno("Maria", 454545, "9876543", enderecoAluno1, notasAluno1);

		Disciplina disciplina1 = new Disciplina("Matematica", "1212", aluno1);

		Curso curso1 = new Curso("Engenharia", "13151", disciplina1);

		// Sobrecarregado

		Faculdade faculdade1 = new Faculdade(24598788, "faculdade@gmail.com", enderecoFaculdade1, curso1);
		// Sobrecarregado

		System.out.println("Informacoes da Faculdade: ");
		
		System.out.println("Telefone: "+faculdade1.getTelefone());
		System.out.println("Email: "+faculdade1.getEmail());
		System.out.println("");
		System.out.println("Endereco da Faculdade");
		System.out.println("");
		System.out.println("Rua: "+faculdade1.getEndereco().getNomeRua());
		System.out.println("Numero: "+faculdade1.getEndereco().getNumero());
		System.out.println("Bairro: "+faculdade1.getEndereco().getBairro());
		System.out.println("Cidade: "+faculdade1.getEndereco().getCidade());
		System.out.println("Uf: "+faculdade1.getEndereco().getUf());
		System.out.println("Complemento: "+faculdade1.getEndereco().getComplemento());
		System.out.println("Cep: "+faculdade1.getEndereco().getCep());
		System.out.println("-----------------------------------");
		System.out.println("Informacoes do Curso: ");
		System.out.println("Nome: "+faculdade1.getCurso().getNome());
		System.out.println("Codigo: "+faculdade1.getCurso().getCodigo());
		System.out.println("Informacoes da Disciplina: ");
		System.out.println("Disciplina: "+faculdade1.getCurso().getDisciplina().getNome());
		System.out.println("Disciplina: "+faculdade1.getCurso().getDisciplina().getCodigo());
	
		System.out.println("-----------------------------------");
		System.out.println("Informacoes do Aluno: ");
		System.out.println("-----------------------------------");
		System.out.println("Endereco do Aluno: ");
		System.out.println("");
	
		System.out.println("Rua: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getNomeRua());
		System.out.println("Numero: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getNumero());
		System.out.println("Bairro: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getBairro());
		System.out.println("Cidade: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getCidade());
		System.out.println("Uf: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getUf());
		System.out.println("Complemento: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getComplemento());
		System.out.println("Cep: "+faculdade1.getCurso().getDisciplina().getAluno().getEndereco().getCep());
		System.out.println("-----------------------------------");
		System.out.println("Dados do Aluno: ");
		System.out.println("Nome: "+faculdade1.getCurso().getDisciplina().getAluno().getNome());
		System.out.println("Matricula: "+faculdade1.getCurso().getDisciplina().getAluno().getMatricula());
		System.out.println("Cpf: "+faculdade1.getCurso().getDisciplina().getAluno().getCpf());
		System.out.println("Nota 1: "+faculdade1.getCurso().getDisciplina().getAluno().getNotas().getNota1());
		System.out.println("Nota 2 : "+faculdade1.getCurso().getDisciplina().getAluno().getNotas().getNota2());
		System.out.println("Nota 3: "+faculdade1.getCurso().getDisciplina().getAluno().getNotas().getNota3());
		
		
		System.out.println("Media: "+notasAluno1.calcularMedia());	
	
		System.out.println("Situacao: "+aluno1.mostrarSituacao(notasAluno1.verificarSituacao()));	
		
	
	}

}
