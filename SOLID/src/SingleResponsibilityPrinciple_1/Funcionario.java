package SingleResponsibilityPrinciple_1;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private double salarioBase;
    
    public Cargo getCargo() {
        return this.cargo;
    }
    
    public double getSalarioBase() {
        return this.salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    public double calcularSalario() {
        return this.getCargo().getTipoCalculo().calcular(this);
    }
}
