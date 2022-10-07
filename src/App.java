import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o preco do produto:");
        double preco = scanner.nextDouble();
        Produto produto = new Produto("sabao em po",preco);
        System.out.println("insira a hora da compra:");
        int hora = scanner.nextInt();
        System.out.println("insira os minutos da compra:");
        int minuto = scanner.nextInt();
        System.out.println("insira os segundos da compra:");
        int segundo = scanner.nextInt();

        Compra compra= new Compra(produto, LocalTime.of(hora, minuto, segundo));
        System.out.println("Insira o dia da semana sendo 1 segunda e 7 domingo:");
        int diaSemana = scanner.nextInt();
        compra.desconto(diaSemana);
        System.out.println(compra.getProduto().getPreco());
        
    }
}
