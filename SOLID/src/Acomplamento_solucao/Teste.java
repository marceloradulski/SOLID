package Acomplamento_solucao;

public class Teste {

	public static void main(String[] args) {
		Fatura fatura = new Fatura(1000, "Empresa Teste");
		NotaFiscal nf = new GeradorDeNotaFiscal().incluirAcaoAposGerarNota(new NotaFiscalDao()).incluirAcaoAposGerarNota(new EnviadorDeEmail()).gera(fatura);
	}

}
