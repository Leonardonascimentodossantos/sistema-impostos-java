package uc06atividade3;

import java.util.ArrayList;

public class Pagamentos {
    private String empresa;
    private ArrayList<Imposto> impostos = new ArrayList<>(); 

    public Pagamentos(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }
    
    public void adicionarImposto (Imposto imposto) {
        impostos.add(imposto);
    }
}
