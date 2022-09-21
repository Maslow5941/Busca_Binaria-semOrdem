

public class QuickSort {

  public static int[] quickSort(int[] vet, int inicio, int fim) {
    
    int meio;

    if (inicio < fim) {
      meio = particao(vet, inicio, fim);
    
      quickSort(vet, inicio, meio);
      quickSort(vet, meio + 1, fim);
      
  }
    return vet;
  }

  public static int particao(int[] vet, int inicio, int fim) {

    if (inicio < fim) {
      int aux = vet[inicio];
    
  }
}

