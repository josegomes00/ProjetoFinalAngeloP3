package uniesp.angelo.projeto;

public class BoletoPaymentGenerator extends PaymentGenerator{
    @Override
    protected void generateUp() {
        System.out.println("Aguarde...");
    }

    @Override
    protected void generateMiddle() {
        System.out.println("Gerando Boleto");
    }

    @Override
    protected void generateDown() {
        System.out.println("Boleto gerado com sucesso!");
    }
}
