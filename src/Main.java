import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double saldo = 2500.00;
        String pessoa = "Gabriel Stangari Silva";
        String conta = "Conta Corrente";

        System.out.println("**********************************");
        System.out.println("Informações do cliente:");
        System.out.println("Nome do Cliente: " + pessoa);
        System.out.println("Saldo Conta corrente: " + saldo);
        System.out.println("Tipo da conta: " + conta);
        System.out.println("**********************************");

        Scanner entrada = new Scanner(System.in);


        while (true) {

            System.out.println("1 - Saldo da Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - transferência pix");
            System.out.println("4 - Sair");

            int opcao = entrada.nextInt();

            if (opcao == 4) {
                System.out.println("Transação finalizada");
                break;

            } else if (opcao == 1) {
                System.out.println("Saldo da conta é: " + saldo);
            } else if (opcao == 2) {

                System.out.println("Digite o valor do depósito ?:");
                double deposito = entrada.nextDouble();
                saldo = saldo + deposito;
                System.out.println("O seu saldo é:" + saldo);
            } else if (opcao == 3) {

                System.out.println("Digite o valor da transferência pix :");
                double pix = entrada.nextDouble();
                if (pix > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - pix;
                    System.out.println("Pix enviado com sucesso");
                    System.out.println("Saldo após transferência :" + saldo);

                }
            }

        }
    }

}

