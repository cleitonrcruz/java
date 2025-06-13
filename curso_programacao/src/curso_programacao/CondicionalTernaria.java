package curso_programacao;

public class CondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		
		/*                (condicao) ? valor_se_verdadeiro : valor_se_falso */
		double desconto = (preco < 20.0) ? (preco * 0.1) : (preco *0.05);
		
		System.out.println(desconto);

	}

}
