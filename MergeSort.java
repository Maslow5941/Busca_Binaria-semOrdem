public class MergeSort {

  public static int[] sort(int[] vet) {
    if (vet.length <= 1) {
      return vet;
    }
    int meio = vet.length / 2;
    int[] direita = vet.length % 2 == 0 ? new int[meio] : new int[meio + 1];
    int[] esquerda = new int[meio];
    int[] aux = new int[vet.length];

    for (int i = 0; i < vet.length; i++) {
      esquerda[i] = vet[i];
    }
    int indiceAux = 0;

    for (int i = meio; i < vet.length; i++) {
      direita[indiceAux] = vet[i];
      indiceAux++;
    }

    direita = sort(direita);
    esquerda = sort(esquerda);
    aux = mergeSort(esquerda, direita);
    return aux;

  }

static int[]  mergeSort(int[] direita, int[]esquerda){
  int[]aux= new int[esquerda.length+direita.length];
   int indiceDireita = 0;
   int indiceEsquerda = 0;
   int indiceAux = 0;

   while(indiceEsquerda<esquerda.length || indiceDireita<direita.length){
    if(indiceEsquerda<esquerda.length && indiceDireita<direita.length ){
      if(esquerda[indiceEsquerda] <= direita[indiceDireita]){
        aux[indiceAux]=esquerda[indiceEsquerda];
        indiceEsquerda++;
        indiceAux++;
      }
      
     }else{ 
      aux[indiceAux] = direita[indiceDireita];
      indiceAux++;
      indiceDireita++;
     }

   }if(indiceEsquerda < esquerda.length) {
    aux[indiceAux] = esquerda[indiceEsquerda];
    indiceAux++;
    indiceEsquerda++;
} else if (indiceDireita < direita.length) {
    aux[indiceAux] = direita[indiceDireita];
    indiceAux++;
    indiceDireita++;
}

   return aux;
}
}

