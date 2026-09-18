public class Nintendo implements IConsole{

    private DadosConsole dadosConsole;

    @Override
    public void ligar() {
        System.out.println("Ligando console...");
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
