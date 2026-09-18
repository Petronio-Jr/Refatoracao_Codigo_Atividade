public class Nintendo implements IConsole{

    private DadosConsole dadosConsole = new DadosConsole("Nintendo", 2000);;

    @Override
    public void ligar() {
        System.out.println("Ligando console Nintendo...");
    }

    @Override
    public String getNome(){
        return dadosConsole.getNome();
    }

    @Override
    public double calcularPreco() {
        return dadosConsole.getPrecoBase() * 1.10;
    }
}
