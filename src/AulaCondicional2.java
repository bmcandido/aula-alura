
public class AulaCondicional2 {
	public static void main(String[] args) {
		//Testando condicionais do tipo IF
				int idade = 18;
				int quantidadePessoas = 3;

				if (idade >= 18 || quantidadePessoas >=2) {
					System.out.println("Você já pode transar");
				}  else {
						System.out.println("Você não pode Transar");
					}
				// a Condição OU é o PIPE LINE
				// a Condição E é && comercial
				
				if(idade >= 18 && quantidadePessoas >=2) {
					System.out.println("Agora VAIIIIIIIIIIII");
				} else {
					System.out.println("Agora Num Vai");
				}
				//Trablhando com Condição Boleana, ou seja TRUE ou FALSE
				
				int idadeFesta=16;
				int quantidadePessoasN=4;
				boolean acompanhado=true;
				boolean acompanhadoNovo= quantidadePessoasN<=4; //Exemplo de Bollean pois devolve falso ou verdadeiro
				System.out.println("Valor do Campo acompanhadoNovo :"+ acompanhadoNovo);
				
				if (idadeFesta >= 18 && acompanhado)
				//vc deve usar a expressao somente acompanhado que ja leva true "acompanhado ==true"
				{
					System.out.println("Você pode entrar na festa");
				}  else {
						System.out.println("Você não pode entrar na festa seu menor de idade do caralho");
					}
				//Para atribuir é =, == compara
				
				
				
			}
		}