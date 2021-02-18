// Algoritmos desenvolvido por Eduardo Luiz Pontes de Souza
public class Parcelamento_sem_juros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V = 0;  // Valor da compra
		int P = 0;  // Número de parcelas da compra
		int Plinhas = 0; // Número adequado de prints ou valor da sobra da divisão de V por P
		int i = 0;  // Auxiliar de controle
		
		V = View.inserir_int("Insira o valor da compra: ");	//Inicializando a variável V
		
		do {
			P = View.inserir_int("Insira o número de parcelas: ");	//Inicializando a variável P
			
			if(P > 18) {
				View.exibirERRO("So e permitido dividir em ate 18 vezes\n", "ERRO");
			}
		}while (P > 18);	// Controle do valor de parcelas não podendo ser maior que 18 vezes
		
		if(V % P == 0){ // Se o valor da variável V for divisível por P
			Plinhas = V/P;  // Inicializando a variável Plinhas responsável pelo print correto
			View.exibirMensagem("\nO valor das compras e divisivel por P.\nValor das parcelas:\n");
			
			for (i = 1; i <= P; i++) {  // Controle de print, printando Plinhas de i = 1 até a  i-ésima que é igual ao número de parcelas da compra
				View.exibirMensagem("" + Plinhas); // Printando o valor das parcelas nas quantidades adequadas
			}
		}else{  // Se o valor da variável V não for divisível por P
			View.exibirMensagem("\nO valor das compras nao e divisivel por P.");
			Plinhas = V % P;  // Plinhas assume o valor do resto, ou seja, número de parcelas que terão valor maior
			
			View.exibirMensagem("\nValor das parcelas:\n");
			
			for (i = 1; i <= Plinhas; i++) {
				View.exibirMensagem("" + V/P + 1); // Printando o valor das parcelas nas quantidades adequadas para compensar
			    }
			
			for (i = 1; i <= P - Plinhas; i++) {
				View.exibirMensagem("" + V/P);  // Printando o valor das parcelas nas quantidades adequadas
				}
		}
	}
}
