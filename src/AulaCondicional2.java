
public class AulaCondicional2 {
	public static void main(String[] args) {
		//Testando condicionais do tipo IF
				int idade = 18;
				int quantidadePessoas = 3;

				if (idade >= 18 || quantidadePessoas >=2) {
					System.out.println("Voc� j� pode transar");
				}  else {
						System.out.println("Voc� n�o pode Transar");
					}
				// a Condi��o OU � o PIPE LINE
				// a Condi��o E � && comercial
				
				if(idade >= 18 && quantidadePessoas >=2) {
					System.out.println("Agora VAIIIIIIIIIIII");
				} else {
					System.out.println("Agora Num Vai");
				}
				//Trablhando com Condi��o Boleana, ou seja TRUE ou FALSE
				
				int idadeFesta=16;
				int quantidadePessoasN=4;
				boolean acompanhado=true;
				boolean acompanhadoNovo= quantidadePessoasN<=4; //Exemplo de Bollean pois devolve falso ou verdadeiro
				System.out.println("Valor do Campo acompanhadoNovo :"+ acompanhadoNovo);
				
				if (idadeFesta >= 18 && acompanhado)
				//vc deve usar a expressao somente acompanhado que ja leva true "acompanhado ==true"
				{
					System.out.println("Voc� pode entrar na festa");
				}  else {
						System.out.println("Voc� n�o pode entrar na festa seu menor de idade do caralho");
					}
				//Para atribuir � =, == compara
				
				
				
			}
		}