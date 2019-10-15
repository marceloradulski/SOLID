package SingleResponsibilityPrinciple_1;

public enum Cargo {
    DESENVOLVEDOR (new DezOuVintePorcento()),
    DBA (new QuinzeOuVinteCincoPorcento()),
    TESTER (new QuinzeOuVinteCincoPorcento());
    
    private CalculadoraSalario tipoCalculo;

    private Cargo(CalculadoraSalario tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public CalculadoraSalario getTipoCalculo() {
        return tipoCalculo;
    }
    
    
    
}
