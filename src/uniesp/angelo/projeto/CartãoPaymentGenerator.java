package uniesp.angelo.projeto;

public class CartãoPaymentGenerator extends PaymentGenerator{
    @Override
    protected void generateUp() {
        System.out.println("Aguarde...");
    }

    @Override
    protected void generateMiddle() {
        System.out.println("Confirmando Método na Maquininha...");
    }

    @Override
    protected void generateDown() {
        System.out.println("Pode inserir o dados do seu cartão:");
        //Aqui pode ter outras implementações
        //chamando métodos para ler o cartão.
    }
}
