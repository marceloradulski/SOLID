package OpenClosed_DependencyInversion_solucao;

public class Teste {

	public static void main(String[] args) {
		CalculadoraDePrecos calc = new CalculadoraDePrecos(new FreteCorreios(), new TabelaDePrecoPadrao());
		
		System.out.println(calc.calcula(new Compra(5000, "Joinville")));
	}

}
