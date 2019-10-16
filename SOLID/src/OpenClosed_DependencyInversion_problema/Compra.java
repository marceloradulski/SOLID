package OpenClosed_DependencyInversion_problema;

public class Compra {
	private double valor;
	private String cidade;
			
	public Compra(double valor, String cidade) {
		super();
		this.valor = valor;
		this.cidade = cidade;
	}
	public double getValor() {
		return valor;
	}
	
	public String getCidade() {
		return cidade;
	}	
}
