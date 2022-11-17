package variaveis;

public class TipoPrimitivo {
	public static void main(String[] args) {
		int idade;
		
		// setando valor na variável idade
		idade = 17;
		
		// setando valor inicial na altura
		double altura = 1.8;
		
		// console
		System.out.println("Idade: " + idade + " anos.");
		
		// atribuindo valor da variável idade em idade2
		int idade2 = idade;
		
		// atribuindo +1 na variável idade
		idade++;
		
		
		System.out.println(idade);
		System.out.println(idade2);
		
		
		final double DISSIDIO = 10.8;
		
		//versões recentes do Java entendem o tipo da variável, no caso o valor é um double
		var valor = 5.6;
		double valor2 = valor;
		
		int idade3 = idade + idade2;
		System.out.println(idade3);
		
		// Tipos Primários
		//boolean
		
		// byte - 1 byte (de -128 a 127)
		byte byteExemplo = 126;
		
		//short - 2 byes (de -32768 a 32767)
		short shortExemplo = 32555;
		
		//char 2 bytes (recebe apenas um caractere)
		char charExemplo = 'a';
		
		//int - 4 bytes (de -2147483645 a 2147483647)
		int intExemplo = 34578;
		
		//long - 8 bytes (de -9.223.372.036.854.775.807 a 9.223.372.036.854.775.808) 
		long longExemplo = 1561515615689794L;
		
		//float - 4 bytes (de +/-1/4 * 10⁴⁵ +/-33.4028235 * 10³⁸ )
		float floatExemplo = 2.1f;
		
		//double - 8 bytes (de +/-4.9 a +/-1.7976931348623147 * 10³⁰⁸)
		double doubleExemplo = 3.85;
		
		/* Colocando uma int dentro de um double, adiciona casas decimais. No caso de colocar um double dentro de um int,
		 precisa dizer que o double é um int. Assim, ele perde as casas decimais e se transforma em um int. 
		 */
		
		
		int i = 5;
		double d2 = i;
		
		
		double d = 3.14;
		int i2 = (int) d;
		
		System.out.println("i2: " + i2);
	
	}
}
