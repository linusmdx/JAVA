public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Ele não irá descansar até alcançar sua vingança!");
        }

       if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
           System.out.println("Filme liberado");
       } else {
           System.out.println("Deve pagar a locação");
       }
    }
}
