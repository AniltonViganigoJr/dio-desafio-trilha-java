import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Conta conta = new Conta();

        System.out.print("Por favor, digite o número da agência:");
        conta.setAgencia(scanner.nextLine());

        System.out.print("Por favor, digite o número da conta:");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente:");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, digite o saldo inicial:");
        while(!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Por favor, digite um número para o saldo inicial:");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        conta.depositar(valor);

        scanner.close();

        System.out.println("\n ============ DADOS DA CONTA ============ ");
        System.out.println(conta.toString());
    }
}
