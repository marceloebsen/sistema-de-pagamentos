import java.util.Scanner;

public class SistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha um método de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Boleto");

        int escolha = scanner.nextInt();
        String metodoPagamento;

        switch (escolha) {
            case 1:
                metodoPagamento = "pix";
                break;
            case 2:
                metodoPagamento = "cartão de crédito";
                break;
            case 3:
                metodoPagamento = "boleto";
                break;
            default:
                System.out.println("Opção inválida. Tente de novo!");
                return;
        }

        System.out.print("Qual o valor da transação? R$");
        double valor = scanner.nextDouble();

        EstrategiaPagamento estrategiaPagamento = FabricaPagamento.obterMetodoPagamento(metodoPagamento);

        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(estrategiaPagamento);
        processadorPagamento.processarPagamento(valor);

        System.out.println("Pagamento realizado com sucesso! Valeu!");

        scanner.close();
    }
}