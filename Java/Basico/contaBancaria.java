import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        String nome = "Pedro Bial";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("                                    ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo De Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldoInicial);
        System.out.println("************************************************");

        Scanner leitura = new Scanner(System.in);

        String operacoes = """

                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Mostrar dados da conta
                5- Sair
                """;
        String opcao = "Digite a opção desejada:";

        int cont = 0;

        while (cont != 1) {
            System.out.println(operacoes);
            System.out.println(opcao);
            int codigo = leitura.nextInt();
            if (codigo == 1) {
                System.out.println("                           ");
                System.out.println("Esta e o valor de sua conta: ");
                System.out.println(saldoInicial);

            }
            if (codigo == 2) {
                System.out.println("Informe o valor a receber: ");
                System.out.println("                           ");
                int valorR = leitura.nextInt();
                saldoInicial += valorR;
                System.out.println("* Valor depositado *");
                System.out.println("Saldo Atual: " + saldoInicial);
            }
            if (codigo == 3) {
                System.out.println("Informe o valor a transferir: ");
                System.out.println("                           ");
                int valorT = leitura.nextInt();
                if (valorT > saldoInicial) {
                    System.out.println(" *** Não há saldo suficiente para fazer essa transferencia ***");
                    saldoInicial += valorT;
                }
                saldoInicial -= valorT;
                if (valorT < saldoInicial) {
                    System.out.println("* Valor Transferido *");
                }
                System.out.println("Saldo Atual: " + saldoInicial);
            }
            if (codigo == 4) {

                System.out.println("************************************************");
                System.out.println("Dados iniciais do cliente:");
                System.out.println("                                    ");
                System.out.println("Nome: " + nome);
                System.out.println("Tipo De Conta: " + tipoConta);
                System.out.println("Saldo Inicial: " + saldoInicial);
                System.out.println("************************************************");
            }
            if (codigo == 5) {
                cont++;
            }
            if (codigo != 1 && codigo != 2 && codigo != 3 && codigo != 4) {
                System.out.println("                           ");
                System.out.println("*** Opção Invalida ***");
            }
            int valorR = 0;
            int valorT = 0;
        }

    }
}
