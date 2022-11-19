package variaveis;

public class ClasseString {
	public static void main(String[] args) {
		char[] arrayChar = {'B', 'o', 'm', ' ', 'd', 'i', 'a'};
		System.out.println(arrayChar);
		System.out.println(arrayChar[2]);		
		
		String b = "Bom dia b";
		System.out.println(b);
		
		String c = new String();
		c = "Bom dia c";
		System.out.println(c);
		
		String d = new String("Bom dia d");
		System.out.println(d);
		
		String e = new String(arrayChar);
		System.out.println("e " + e);
		
		//Buscar o caractere na posição indicada
		System.out.println("Opa".charAt(1));
		
		String s = "Boa tarde";
		s = s.toUpperCase(); //caps		
		System.out.println(s);
		
		// Substituir o valor de s
		s = "Bom dia";
		System.out.println(s);
		
		//Concatenar usando o concat		
		System.out.println(s.concat("!"));
		
		// Concatenar usando +
		System.out.println(s + "!");
		
		// Inicia com
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.startsWith("bom"));
		
		//iniciar minúsculo
		System.out.println(s.toLowerCase().startsWith("bom"));
		
		//verificar tamanho da string
		System.out.println(s.length());
		
		// Termina com
		System.out.println(s.endsWith("dia"));
		System.out.println(s.endsWith("dia!"));
		System.out.println(s.endsWith("Dia"));
		System.out.println(s.endsWith("DIA"));		
		System.out.println(s.toUpperCase().endsWith("DIA"));
		System.out.println(s.toLowerCase().endsWith("dia"));
		
		
		// comparar com equals
		System.out.println(s.equals("Bom dia"));
		System.out.println(s.toLowerCase().equals("bom dia"));
		System.out.println(s.equals("Bom dia"));
		
	}
}
