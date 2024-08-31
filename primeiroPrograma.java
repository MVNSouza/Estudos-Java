public class primeiroPrograma{
    public static void main (String[] args) {
        int idade = 18;
        double altura = 1.77;
        char inicial = 'M' ;
        String nome = "Marcos";

        System.out.println("-- Informações sobre o usuário --");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Inicial: %c%n", inicial);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Altura: %.2f%n", altura);
    }
}
