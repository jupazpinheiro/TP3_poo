package dom;


public class Calculo extends Aluno{
	
	private float av1;
	private float av2;

	public Calculo() {
		this.setNome("Administrador Fantasma");
	}
	
	public Calculo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void exibirFormaCalculo() {
		System.out.println("av1 + av2 = média");
		System.out.println("= " + getMedia() + " + " + av1 + " - " + av2);
		System.out.println("= " + calcularMedia());
	}
	
	@Override
	public String toString() {
		return String.format("%.2f - %.2f", av1, av2);
	}

	@Override
	public float calcularMedia() {
		getMedia() = (av1 + av2) / 2;
		return getMedia();
	}

}