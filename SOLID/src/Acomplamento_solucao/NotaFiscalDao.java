package Acomplamento_solucao;

public class NotaFiscalDao implements AcoesAposGerarNota {

    public void executar(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}