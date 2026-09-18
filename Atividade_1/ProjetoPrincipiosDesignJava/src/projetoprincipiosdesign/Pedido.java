package projetoprincipiosdesign;

import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento pagamento;
    private IEntrega entrega;

    public Pedido(Cliente cliente, List<ItemPedido> itens, IPagamento pagamento, IEntrega entrega) {
        this.cliente = cliente;
        this.itens = itens;
        this.pagamento = pagamento;
        this.entrega = entrega;
    }

    public String obterNomeCidade(){
        return cliente.obterNomeCidade();
    }

    //Getters and Setters
    public IPagamento getPagamento() {
        return pagamento;
    }
    public IEntrega getEntrega(){
        return entrega;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<ItemPedido> getItens() {
        return itens;
    }
    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}