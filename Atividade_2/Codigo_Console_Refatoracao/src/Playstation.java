public class Playstation implements IConsole{

    protected DadosConsole dadosConsole = new DadosConsole("Playstation", 3000);

    @Override
    public void ligar() {
        System.out.println("Ligando console Playstation...");
    }

    @Override
    public String getNome() {
        return dadosConsole.getNome();
    }

    @Override
    public double calcularPreco() {
        return dadosConsole.getPrecoBase() * 1.20;
    }


}
