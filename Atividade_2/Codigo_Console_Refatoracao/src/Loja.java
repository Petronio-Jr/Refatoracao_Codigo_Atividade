import java.util.List;

public class Loja {

    public void venderConsole(IConsole console) {
        console.ligar();
        console.calcularPreco();
    }

    public void venderVarios(List<IConsole> consoles){
        for(int i = 0; i < consoles.size(); i++){
            venderConsole(consoles.get(i));
        }
    }

    public double calcularFaturamentoTotal(List<IConsole> consoles){
        double somaTotal = 0;
        for (int i = 0; i < consoles.size(); i++) {
            somaTotal += consoles.get(i).calcularPreco();
        }
        return somaTotal;
    }

}
