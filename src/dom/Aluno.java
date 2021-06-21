package dom;

import heranca.Heranca;

public class Aluno extends Professor {

	private float av1;
	private float av2;
	private  float media;
	
	
	@Override
	public String toString() {
		return String.format("%.2f - %s", av1, av2);
	}
	
	@Override
	public void exibirFormaCalculo() {
		System.out.println("(av1 + av2) / 2");
		System.out.println("= " + getMedia());
		System.out.println("= " + calcularMedia());
	}
	
	@Override
	public float calcularMedia() {		
		media = (av1 + av2) / 2;
		return media;
	}

	public float getMedia() {
		return media;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	public float av1() {
		return av1;
	}
	public float av2() {
		return av2;
	}


}