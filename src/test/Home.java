package test;

import java.util.Scanner;

import dom.Professor;
import dom.Aluno;
import dom.Calculo;


public class Home {
	private static Professor[] professores;
	
	private static int index;	

	private static final int QTDE = 5;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		professores = new Professor[QTDE];
		
		String opcao = null;
		
		int posicao = 0;
		
		do {
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Exibir situação");
			System.out.println("[4] Consultar um");
			System.out.println("[5] Consultar todos");
			System.out.println("[6] Sair");
			
			System.out.print("Informe a opcao desejada: ");
			opcao = in.next();
			
			switch (opcao) {
			case "1": 
				if(index < QTDE) {
					Calculo adm = new Calculo();
					
					adm.setId(index);
					
					System.out.println("Informe o seu nome: ");
					adm.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					adm.setIdade(in.nextInt());
					
					System.out.println("Informe o seu AV1: ");
					adm.setAv1(in.nextFloat());
	
					System.out.println("Informe o seu AV2: ");
					adm.setAv2(in.nextFloat());


					professores[index] = adm;
					
					System.out.println("Administrativo cadastrado com sucesso: ");
					professores[index].imprimir();
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;

			case "2": 
				if(index < QTDE) {
					Aluno al = new Aluno();
					
					al.setId(index);
					
					System.out.println("Informe o seu nome: ");
					al.setNome(in.next());
					
					System.out.println("Informe a sua idade: ");
					al.setIdade(in.nextInt());
					
					System.out.println("Informe o seu salario: ");
					al.setMedia(in.nextFloat());


					professores[index] = al;
					
					System.out.println("Estagiário cadastrado com sucesso: ");
					professores[index].imprimir();
					
					index++;
				} else {
					System.out.println("Não existe mais vaga para o cadastramento!!!");
				}
				
				break;
			
			
			case "3":
				System.out.print("Informe a posicao: ");
				posicao = in.nextInt();
				
				if(posicao >= 0 && posicao < index) {
					professores[posicao].exibirFormaCalculo();
				} else {
					System.out.println("Funcionário inexistente!!!");
				}
				
				break;
				
			case "4":
				System.out.print("Informe a posicao: ");
				posicao = in.nextInt();
				
				if(posicao >= 0 && posicao < index) {
					professores[posicao].imprimir();
				} else {
					System.out.println("Funcionário inexistente!!!");
				}
				
				break;

			case "5":
				imprimir();
				
				break;

			case "6":
				System.out.println("Finalizou!!!");
				break;
				
			default:
				System.out.println("Opcao invalida!!!");
				break;
			}

		} while (!opcao.equals("6"));
		
		exibirRelatorio();
		
		in.close();		
	}
	
	private static float calcularMediaHoras() {
		float soma = 0;
		
		for(int i = 0; i < index; i++) {
			soma = soma + professores[i].calcularHoras();
		}
		
		return soma / index;
	}
	
	private static void exibirRelatorio() {
		int qtde = index;

		System.out.println("Relatório:");
		System.out.println("Quantidade de funcionários: " + qtde);
		System.out.println("Média salarial dos funcionários: " + calcularMediaHoras());
	}
	
	private static void imprimir() {
		System.out.println("Listagem de inscritos:");
		for(int i = 0; i < index; i++) {
			professores[i].imprimir();
		}
	}
}
