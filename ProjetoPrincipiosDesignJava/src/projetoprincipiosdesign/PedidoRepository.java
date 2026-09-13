package projetoprincipiosdesign;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PedidoRepository {

    public void salvarPedido(Pedido pedido, double total){

        System.out.println("Salvando pedido em arquivo...");
        String linha = "Cliente: " + pedido.getCliente().getNome() + "; Valor da compra: " + total + System.lineSeparator();

        try {
            Files.writeString(
                    Path.of("pedidos.txt"),
                    linha,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar o pedido em arquivo.", e);
        }
    }

    public void gerarResumoPedido(Pedido pedido, double valorInicial, double total) {

        System.out.println("\nGerando resumo do pedido...");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.printf("Valor inicial: R$ %.2f%n", valorInicial);
        System.out.printf("Frete: R$ %.2f%n", pedido.getEntrega().calcularFrete(valorInicial));
        System.out.printf("Valor a pago com desconto: R$ %.2f%n", total);

    }
}