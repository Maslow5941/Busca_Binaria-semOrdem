import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        try {

            int[] vet = new int[] {1, 2, 3, 4, 5};
            System.out.println("O Índice do valor 5 é: " + buscaBinaria(vet, 5));

        } catch(Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
    private static int buscaBinaria(int[] vet, int valor) {

        int inicioVet = 0;
        int finalVet = vet.length - 1;

        while(inicioVet <= finalVet){

            int meio = (inicioVet + finalVet) / 2;
            int randomico = vet[meio];

            if (randomico == valor)
                return meio;

            if(randomico > valor) {
                finalVet = meio - 1;

            } else {
                inicioVet = meio + 1;
            }
        }
        throw new NoSuchElementException("O elemento não foi encontrado.");
    }
}