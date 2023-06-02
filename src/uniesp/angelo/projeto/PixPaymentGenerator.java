package uniesp.angelo.projeto;

public class PixPaymentGenerator extends PaymentGenerator{

    @Override
    protected void generateUp() {
        System.out.println("Aguarde...");
    }

    @Override
    protected void generateMiddle() {
        System.out.println("Gerando QR Code Pix");
    }

    @Override
    protected void generateDown() {
        System.out.println("QR Code Pix gerado com sucesso!");
    }
}
