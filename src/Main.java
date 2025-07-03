import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite o numero da conta: ");
        cliente.setNumero(scan.nextInt());
        scan.nextLine();

        System.out.println("Digite o nome do cliente: ");
        cliente.setNomeCliente(scan.nextLine());

        System.out.println("Digite a agencia: ");
        cliente.setAgencia(scan.nextLine());

        System.out.println("Digite o saldo: ");
        cliente.setSaldo(scan.nextDouble());


        System.out.println("\nOlá " + cliente.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.getAgencia() +
                ", conta " + cliente.getNumero() + " e seu saldo R$ " + cliente.getSaldo() + " já está disponível para saque.");

        scan.close();
    }
}
