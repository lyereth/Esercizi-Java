public class UsaDueConti{
    public static void main(String[] args){

        ContoCorrente conto1 = new ContoCorrente(2000);
        ContoCorrente conto2 = new ContoCorrente(200);

        conto1.preleva(700);
        conto2.versa(700);

        System.out.println("Numero conto: " + conto1.ottieniNumero());
        System.out.println("Saldo primo conto " + conto1.ottieniSaldo());

        System.out.println("Numero conto: " + conto2.ottieniNumero());
        System.out.println("Saldo secondo conto " + conto2.ottieniSaldo());
    }
}