public class Heapsort {

	private int tamanho;
	
	void maxHeapify(int[] filho, int pai){
		int esquerdo = (2*pai) +1;
		int direito = (2*pai)+2;
		int maior = pai;
		if(esquerdo <= tamanho && filho[esquerdo] > filho[maior]){
			maior = esquerdo;
		}
		if(direito <= tamanho && filho[direito] > filho[maior]){
			maior = direito;
		}
		if(maior != pai){
			int aux = filho[pai];
			filho[pai] = filho[maior];
			filho[maior] = aux;
			maxHeapify(filho, maior);
		}
	}
	void buildMaxHeap(int[] filho){
		tamanho=filho.length - 1;
		for(int pai = tamanho/2; pai>=0; pai--){
			maxHeapify(filho, pai);
		}
	}
	void heapSort(int[]filho){
		buildMaxHeap(filho);
		for(int i=tamanho; i>0; i--){
			int aux = filho[i];
			filho[i] = filho[0];
			filho[0] = aux;
			tamanho--;
			maxHeapify(filho,0);
		}
	}
}
