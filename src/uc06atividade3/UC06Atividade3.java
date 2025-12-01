package uc06atividade3;

import java.util.Scanner;

public class UC06Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empresa, tipo;
        
        System.out.println("Digite o nome da empresa: ");
        empresa = sc.nextLine();
        
        Pagamentos pagamentos = new Pagamentos(empresa);
        
        do {
            System.out.println("\nCadastrar imposto. Digite o tipo (PIS / IPI) ou 'pare' para finalizar: ");
            tipo = sc.nextLine().toLowerCase();
            
            if (!tipo.equals("pare")){
                switch (tipo) {
                    case "pis":
                        System.out.println("Digite o valor de DÉBITO da empresa: ");
                        double debito = sc.nextDouble();
                        System.out.println("Digite o valor de CRÉDITO da empresa: ");
                        double credito = sc.nextDouble();
                        sc.nextLine();
                        pagamentos.adicionarImposto(new PIS(debito, credito));
                        break;
                        
                    case "ipi":
                        System.out.println("Digite o valor da ALÍQUOTA (%): ");
                        double aliquota = sc.nextDouble();
                        System.out.println("Digite o valor do PRODUTO: ");
                        double valorProduto = sc.nextDouble();
                        System.out.println("Digite o valor do FRETE: ");
                        double frete = sc.nextDouble();
                        System.out.println("Digite o valor do SEGURO: ");
                        double seguro = sc.nextDouble();
                        System.out.println("Digite o valor de OUTRAS DESPESAS: ");
                        double outrasDespesas = sc.nextDouble();
                        sc.nextLine();
                        pagamentos.adicionarImposto(new IPI(aliquota, valorProduto, frete, seguro, outrasDespesas));
                        break;
                        
                    default:
                        System.out.println("Tipo inválido!");
                        System.out.println("Digite 'PIS', 'IPI' ou 'pare'.");
                }
            } else {
                System.out.println("Finalizando cadastro de impostos...");
            }
        } while (!tipo.equals("pare"));
        
        System.out.println("\n===============================================");
        System.out.println("Impostos cadastrados na empresa: " + pagamentos.getEmpresa());
        for (Imposto i : pagamentos.getImpostos()) {
            System.out.println(i.getDescricao() + " R$ " + i.calcularImposto());
        }
        sc.close();
    }    
}
