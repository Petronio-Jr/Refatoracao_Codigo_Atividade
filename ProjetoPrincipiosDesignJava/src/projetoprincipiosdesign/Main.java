package projetoprincipiosdesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("\tLOJA ACADÊMICA");
        System.out.println("===================================");

        Cliente cliente = new Cliente(
                "Pet",
                new Endereco("Rua Caetés", new Cidade("Alfenas")),
                Cliente.TipoCliente.ALUNO
        );

        Pedido pedido = new Pedido(
                cliente,
                List.of(
                        new ItemPedido("Livro de Engenharia de Software", 120.0, 1),
                        new ItemPedido("Caderno", 20.0, 2)
                ),
                new PagamentoPix(),
                new EntregaResidencia()
        );

        PedidoService servico = new PedidoService();
        PedidoRepository repository = new PedidoRepository();

        double totalPedido = servico.calcularTotal(pedido);

        System.out.println();
        System.out.println("Cidade de entrega:");
        System.out.println(servico.obterCidadeEntrega(pedido));

        System.out.println();
        System.out.println("Total a pagar:");
        System.out.printf("R$ %.2f%n", totalPedido);

        System.out.println();
        System.out.println("Forma pagamento: " + pedido.getPagamento().nomePagamento());
        System.out.println();
        repository.salvarPedido(pedido,totalPedido);
        System.out.println("------------------------------------------------");
        servico.finalizarPedido(pedido, totalPedido);
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Programa executado com sucesso.");
    }
}