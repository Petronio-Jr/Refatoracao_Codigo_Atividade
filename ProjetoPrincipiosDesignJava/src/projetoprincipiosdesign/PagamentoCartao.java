package projetoprincipiosdesign;

public class PagamentoCartao implements IPagamento {

    private int parcelas;

    public PagamentoCartao(int parcelas){
        this.parcelas = parcelas;
    }

    @Override
    public void pagar(double valor) {
        if(parcelas <= 1){
            System.out.println("Pago à vista no cartão: R$ " + valor);
        }
        else {
            double valorParcela = valor / this.parcelas;
            System.out.println("Pago no cartão em " + this.parcelas + "x de R$ " + valorParcela);
        }
    }

    @Override
    public String nomePagamento(){
        return "Cartao";
    }
}