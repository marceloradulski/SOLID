package SingleResponsibilityPrinciple_1;

public class Teste {

    public static void main(String[] args) {
        Funcionario desenv = new Funcionario();
        desenv.setNome("Marcelo");
        desenv.setCargo(Cargo.DESENVOLVEDOR);
        desenv.setSalarioBase(1000);
        
        /*Implementação problematica. Classe CalculaSalarioProblematica nunca vai parar de crescer */
        CalculaSalarioProblematica calculadora = new CalculaSalarioProblematica();
        System.out.println(calculadora.calcula(desenv));
        
        /*Não é correto chamar tantos gets em sequencia*/
        System.out.println(desenv.getCargo().getTipoCalculo().calcular(desenv));
        
        System.out.println(desenv.calcularSalario());
        
        /*Uma classe coesa é aquela que contém apenas uma única responsabilidade. 
          Ou seja, ela toma conta de apenas um conceito dentro do sistema.
          Classes coesas tendem a ser menores, e por consequência, 
          mais fáceis de serem lidas e mantidas. Elas também tendem a 
          ser mais reutilizáveis, afinal são mais fáceis.*/
        
        /*Classes que não são coesas geralmente possuem muitos comportamentos (métodos). 
          Além disso, elas também tem a tendência de crescer pra sempre, ou seja, o tempo 
          inteiro o desenvolvedor tem que por a mão para escrever mais código.
         */
    }

}
