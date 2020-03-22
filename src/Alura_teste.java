
public class Alura_teste {

	public static void main(String[] args) {
		// Teste
		System.out.println("Vai toma no cu!");
		
		double Numerointeiro;
		Numerointeiro=5/2;
		System.out.println(Numerointeiro);
		//Leva o Resultado da divisão "INTEIRO" pois na divisão os dois numeros que  estão dividindo
		//são inteiros
		
		
		double NumeroDecimal;
		NumeroDecimal=5.0/2;
		System.out.println(NumeroDecimal);
		//Leva o Resultado "DECIMAL" pois na divisão os dois numeros que  estão dividindo
		//são inteiros
		
		
		double Salario=1789.90;
	    int valor=(int)Salario;
	    System.out.println(valor);
	    //Leva o Resultado inteiro fazendo a Conversão de Double para inteiro
	    
	    //Declarando Variaveis*******************************************
	    
	    double NumerosDecimais; //Numeros Decimais
	    int NumerosInteiros; //Numeros Inteiros
	    Long NumeroMuitoLongos = 873638736873L;// Numeros Muitos longos Repare que tem o L no Final
	    short ValorPequeno = 1234; //Pouco Usado, Valor Pequeno
	    byte binario; //Valores Binarios, utilizado muito p/ arquivos binarios
	    char unicocaractere='a'; //Isso mesmo que vc viu, guarda somente um unico caracter
	    
	    char teste =66;
	    System.out.println("Traz a Letra :" + teste);
	    char resultado1=(char)(teste+1); //Char entre parentese ~´e a contaversão, e a sintax entre parentese (SOMA AS LETRAS)
	    System.out.println("Traz a Somatoria das Letras :" +resultado1);                                 //é o que ele está convertendo
	    
	    String Palavra ="Bruno é Muito Lidao "; //Tem que ser em aspas duplas
	    System.out.println(Palavra + 20932);
	}

}
