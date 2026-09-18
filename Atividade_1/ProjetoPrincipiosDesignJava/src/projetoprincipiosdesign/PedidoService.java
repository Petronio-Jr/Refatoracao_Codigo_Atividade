package projetoprincipiosdesign;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PedidoService {

    PedidoRepository repository = new PedidoRepository();

    public double calcularValorInicial(Pedido pedido){
        double total = 0.0;

        for (ItemPedido item : pedido.getItens()) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    //calcularTotal agora só usa pedido como parâmetro e chama a função de desconto
    public double calcularTotal(Pedido pedido) {

        double total = calcularValorInicial(pedido);
        double frete = pedido.getEntrega().calcularFrete(total);

        Cliente cliente = pedido.getCliente();

        total = aplicarDesconto(total,cliente);

        return total + frete;
    }


    //Metodo de desconto baseado no tipo do cliente
    public double aplicarDesconto(Double totalPedido, Cliente cliente){
        return cliente.calcularDesconto(totalPedido);
    }


    public void realizarPagamento(IPagamento pagamento, double total){
        pagamento.pagar(total);
    }

    //Principio de Demetre aplicado
    public String obterCidadeEntrega(Pedido pedido) {
        return pedido.obterNomeCidade();
    }

    public void finalizarPedido(Pedido pedido, double total) {

        realizarPagamento(pedido.getPagamento(), total);

        double valorInicial = calcularValorInicial(pedido);
        repository.gerarResumoPedido(pedido,valorInicial,total);
        System.out.println("\nEnviando mensagem para " + pedido.getCliente().getNome() + ": pedido finalizado.");
    }
}