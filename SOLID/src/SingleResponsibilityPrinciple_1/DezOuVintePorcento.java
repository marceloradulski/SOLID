package SingleResponsibilityPrinciple_1;

public class DezOuVintePorcento implements CalculadoraSalario {
    
    @Override
    public double calcular(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}
