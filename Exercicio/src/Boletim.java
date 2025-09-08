public class Boletim {
    public static void main(String[] args) {
        boolean notaPassou = true;
        boolean ficouRecuperacao = false;

        boolean passouDeAno = notaPassou || ficouRecuperacao;
        boolean passouDePrimeira = notaPassou && !ficouRecuperacao;
        boolean vaiGanharPS5 = passouDePrimeira;
        boolean reprovado = !passouDeAno;

        System.out.println("Passou de ano? " + passouDeAno);
        System.out.println("Passou de primeira? " + passouDePrimeira);
        System.out.println("Ficou de recuperação? " + ficouRecuperacao);
        System.out.println("Passou de primeira, pra ganhar o PS5? " + vaiGanharPS5);
        System.out.println("Foi reprovado? " + reprovado);
    }
}




