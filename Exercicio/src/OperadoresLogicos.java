public class OperadoresLogicos {
    public static void main(String[] args) {

        Boolean trabalho1 = false;
        Boolean trabalho2 = false;
        Boolean tv50 = trabalho1 && trabalho2;
        Boolean tv30 = trabalho1 == !trabalho2 ;  // Pode ser simplificado
        Boolean sorvete = trabalho1 || trabalho2;
        Boolean casa = trabalho1 || trabalho2 == true; // Correção

        System.out.println("Possui TV de 50? " + tv50);
        System.out.println("Possui TV de 30? " + tv30);
        System.out.println("Posso comer sorvete? " + sorvete);
        System.out.println("Consigo ir ? " + casa);
    }
}
