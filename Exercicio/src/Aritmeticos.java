public class Aritmeticos {
    public static void main (String[] args){
        // Primeiro Cálculo
        var x = 6*(3+2);
        var expoente = Math.pow(x, 2);
        var y = 3*2;
        var resultado1 = (expoente /y);
        System.out.println(resultado1);

        // Segu0Cálculo
        var numb1 = 1-5;
        var numb2 = 2-7;
        var resultado2 = (numb1 * numb2 / 2);
        var expoente1 = Math.pow(resultado2, 2);
        System.out.println(expoente1);

        // Terceiro Cálculo
        var potencia1 = (resultado1-expoente1);
        var expoente2 = Math.pow(potencia1, 3);
        var expoente3 = Math.pow(10, 3);
        System.out.println(expoente2/expoente3);





    }
}
