package projetoprincipiosdesign;

public class PagamentoBoleto implements IPagamento {

    //O boleto apenas deve ser gerado, ele será pago em outro lugar
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto gerado no valor de: R$ %.2f%n", valor);
    }

    @Override
    public String nomePagamento(){
        return "Boleto";
    }
}