public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamento de filmes");
        } else {
            System.out.println("Filmes retro");
        }


        if(incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar o aluguel");
        }
    }
}
