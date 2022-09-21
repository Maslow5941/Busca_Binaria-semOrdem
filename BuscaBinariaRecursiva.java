public class BuscaBinariaRecursiva {

  public static int busca(int[] vet, int meio) {

    return buscaBinariaRecursiva(vet, 0, vet.length - 1, meio);
  }

  public static int buscaBinariaRecursiva(int[] vet, int inicial, int vfinal, int meio) {
    int media = (vfinal + inicial) / 2;
    int valorMeio = vet[media];

    if (inicial > vfinal)
      return -1;
    else if (valorMeio == meio)
      return media;
    else if (valorMeio < meio)
      return buscaBinariaRecursiva(vet, media + 1, vfinal, meio);
    else
      return buscaBinariaRecursiva(vet, inicial, media - 1, meio);
  }

}
