
public class AulaCondicional {
	public static void main(String[] args) {
//Testando condicionais do tipo IF
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você já pode transar");
		} else {
			if (quantidadePessoas > 2) {
				System.out.println("Você pode Transar de Galera Agora");
			} else {
				System.out.println("Você não pode Transar");
			}
		}
	}
}
