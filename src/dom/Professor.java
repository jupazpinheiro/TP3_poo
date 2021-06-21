package dom;

import heranca.Heranca;

public class Professor {

	private int id;
	private String nome;
	private int idade;
	private int horas;
	
	public Professor() {
		nome = "Fantasma";
		idade = 18;
		horas = 8;
	}
	
	public Professor(int idade, int horas) {
		this();
		this.idade = idade;
		this.horas= horas;
	}
	
	public Professor(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getSituacao(float horas) {
		return horas >= 8 ? "ativo" : "inativo";
	}
	
	public void imprimir() {
		
		System.out.printf("%d :: %s - %d - %.2f - %s", 
				id, 
				nome, 
				idade,
				horas,
				this.toString(),
				getSituacao(horas)
			);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
}