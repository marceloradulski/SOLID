package OpenClosed_DependencyInversion_solucao;

public class CalculadoraDePrecos {
	private Frete frete;
	private TabelaPreco tabelaPreco;	


	public CalculadoraDePrecos(Frete frete, TabelaPreco tabelaPreco) {
		this.frete = frete;
		this.tabelaPreco = tabelaPreco;
	}


	public double calcula(Compra produto) {
        //TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
        //FreteCorreios correios = new FreteCorreios();

        double desconto = this.tabelaPreco.descontoPara(produto.getValor());
        double frete = this.frete.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}