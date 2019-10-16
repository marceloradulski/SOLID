package Acomplamento_solucao;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeNotaFiscal {

    /*private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;*/
	private final List<AcoesAposGerarNota> acoes;

    public GeradorDeNotaFiscal() {
        /*this.email = email;
        this.dao = dao;*/
        this.acoes = new ArrayList();
        
    }
    
    public GeradorDeNotaFiscal incluirAcaoAposGerarNota(AcoesAposGerarNota acao) {
    	acoes.add(acao);
    	return this;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
        
        /*email.enviaEmail(nf);
        dao.persiste(nf);*/
        acoes.forEach(acao->acao.executar(nf));

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}