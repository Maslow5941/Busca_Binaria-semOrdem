public class BubbleSort {
  public int[] bubbleSort(int vet[]) {
    Long tempoInicial = System.currentTimeMillis();

    for(int i= vet.length; i>=1;i++){
      for(int j= 1; j<i;j++){
        if(vet[j -1] > vet[j]){
          int aux = vet[j];
          vet[j-1] = aux;
    }
  }
  }
  long tempoFinal = System.currentTimeMillis();
  long tempoTotal = tempoFinal - tempoInicial;
  System.out.println("Tempo total de processamento: " + tempoTotal);
  return vet;
}
}
  