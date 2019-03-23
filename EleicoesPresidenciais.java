//Esse programa faz a contabilização dos votos de uma eleição.
//Na cadeira de programação só vimos as condições if e else, porém só vimos o for como estrutra de repitação
//Para minimizar os riscos do usuário digitar um valor errado, na linha 36 inseri um "i = i-1;"
//No intuito de simular a estrutura de repetição while.

package EleicoesPresidenciais;

import java.util.Scanner;

public class EleicoesPresidenciais {

	public static void main(String[] args) {
		int qntdEleitores, candidato1=0, candidato2=0, candidato3=0, voto, nulo=0, branco=0, i, totalVotos;

        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite a quantidade de eleitores da cidade: ");
        qntdEleitores = entrada.nextInt();
   
        if (qntdEleitores > 0){
            for (i = 1; i <= qntdEleitores; i = i+1){
                System.out.println("Digite 0 para votar em branco, 1 para votar em Cabo Daciolo, \n"
                		+ "2 para votar em Haddad, 3 para votar em Ciro e 99 para anular seu voto: ");
                voto = entrada.nextInt();
                if (voto == 0){
                    branco = branco+1;
                }else if (voto == 1){
                    candidato1 = candidato1+1;
                }else if (voto == 2){
                    candidato2 = candidato2+1;
                }else if(voto == 3){
                    candidato3 = candidato3+1;
                }else if (voto == 99){
                    nulo = nulo+1;
                }else{
                    System.out.println("Você não digitou uma opção válida.");
                    i = i-1; 
                }
            }
            totalVotos = candidato1+candidato2+candidato3;
            System.out.println("O total de votos válidos foi de: "+totalVotos+", o total de votos em \n"
            		+ "branco: "+branco+" e o total de votos anulados foram de: "+nulo );
            
            if (candidato1 > candidato2 && candidato1 > candidato3 && candidato1 > nulo && candidato1 > branco) {
            	System.out.println("O candadito Cabo Daciolo ganhou a eleição. Ele é o novo presidente!");
            }else if(candidato2 > candidato1 && candidato2 > candidato3 && candidato2 > nulo && candidato2 > branco) {
            	System.out.println("O candidato Haddad ganhou a eleição. Ele é o novo presidente!");
            }else if (candidato3 > candidato1 && candidato3 > candidato2 && candidato3 > nulo && candidato3 > branco) {
            	System.out.println("O candidato Ciro ganhou a eleição. Ele é o novo presidente!");
            }else if (nulo > candidato1 && nulo > candidato2 && nulo > candidato3 && nulo > branco) {
            	System.out.println("A quantidade de votos nulos foram maiores que a quantidade de votos validos.");
            }else if(branco > candidato1 && branco > candidato2 && branco > candidato3 && branco > nulo){
            	System.out.println("A quantidade de votos em brancos foram maiores que a quantidade de votos válidos.");
            }else {
            	if(candidato1 == candidato2 && candidato2 == candidato1) {
            		System.out.println("Haverá segundo turno entre Cabo Daciolo e Haddad.");
            	}else if (candidato1 == candidato3 && candidato3 == candidato1){
            		System.out.println("Haverá segundo turno entre Cabo Daciolo e Ciro.");            		
            	}else if (candidato2 == candidato3 && candidato3 == candidato2) {
            		System.out.println("Haverá segundo turno entre Haddad e Ciro.");
            	}
            }
        }else {
        	System.out.println("Não houve eleições nessa cidade por falta de habitantes na cidade.");
        }
	}
}