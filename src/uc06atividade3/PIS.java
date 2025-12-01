package uc06atividade3;

public class PIS implements Imposto {
    private double debito, credito;

    public PIS(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double calcularImposto() {
        return (debito - credito) * 0.0165; 
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }  
}
