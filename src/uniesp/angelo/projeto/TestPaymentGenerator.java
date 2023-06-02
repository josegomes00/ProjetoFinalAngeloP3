package uniesp.angelo.projeto;

public class TestPaymentGenerator {
    public static void main(String[] args) {
        PaymentGenerator pixpayment = new PixPaymentGenerator();
        PaymentGenerator boletopayment = new BoletoPaymentGenerator();
        PaymentGenerator cartaopayment = new CartãoPaymentGenerator();

        pixpayment.generatePayment();
        System.out.println("--------------------------");

        boletopayment.generatePayment();
        System.out.println("--------------------------");

        cartaopayment.generatePayment();
        System.out.println("--------------------------");
    }
}
