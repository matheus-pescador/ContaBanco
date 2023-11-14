import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("Digite o número da conta: ");
        contaTerminal.setAccountNumber(sc.nextInt());
        System.out.println("Digite o número da agência: ");
        sc.nextLine();
        contaTerminal.setAgency(sc.nextLine());
        System.out.println("Digite seu nome: ");
        contaTerminal.setName(sc.nextLine());
        System.out.println("Agora digite seu saldo inicial: ");
        contaTerminal.setBalance(sc.nextDouble());

        System.out.println("Olá, "+ contaTerminal.getName() + ", obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.getAgency()+", conta de número "+contaTerminal.getAccountNumber()+", e seu saldo de R$"+contaTerminal.getBalance()+" já está disponível para saque.");
    }
}