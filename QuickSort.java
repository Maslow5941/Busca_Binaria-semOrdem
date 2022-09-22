

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

    int pontoCerto;
    int topo;
    int i;
    pontoCerto = vet[inicio];
    topo = inicio;

    for (i = inicio +1; i <= fim; i++) {
      if (vet[i] < pontoCerto) {
        vet[topo] = vet[i];
        topo++;
      }
    }
    vet[topo] = pontoCerto;
    return topo;

  }
}

