package dom;

import ex.NomeIncompleto;

public class Colegio extends Professor{
	private String nome;
	private String sobrenome;
	private String ultimoNome;
	
	public void imprimir() throws NomeIncompleto{
		System.out.println(this.getNome());
	}

	public StringBuilder getNome() throws NomeIncompletoException {

		if(ultimoNome == null || nome == null || sobrenome == null) {
			throw new NomeIncompletoException("Preenchimento inv�lido!!!");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(ultimoNome.toUpperCase().charAt(0));
		sb.append(".");
		sb.append(", ");
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome.toLowerCase());

		return sb;
	}
	public void setNome(String nome) {
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");

		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

}
