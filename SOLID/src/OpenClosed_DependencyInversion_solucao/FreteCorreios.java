package OpenClosed_DependencyInversion_solucao;

public class FreteCorreios implements Frete {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}