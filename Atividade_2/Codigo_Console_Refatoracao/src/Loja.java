import java.util.List;

public class Loja {

    public void venderConsole(IConsole console) {
        console.ligar();
        System.out.printf("Preço : %.2f",console.calcularPreco());
        System.out.println();
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
