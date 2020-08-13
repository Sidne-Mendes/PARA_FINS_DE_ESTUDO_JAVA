public class EstruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ----------------------------------------------------------------------------
		// estrutura condicional se

		int classificacao = 17;

		if (classificacao < 15) {
			System.out.println("Categoria infantil");
		} else if (classificacao > 15 && classificacao < 18) {
			System.out.println("Categoria juvenil");
		} else {
			System.out.println("Profissinal");
		}
		// ----------------------------------------------------------------------------
		// Operador ternario
		int idade = 15;
		String nivel;
		// Antes do dois pontos vdd, depois do dois pontos, falso
		nivel = (classificacao < 18) ? "Não adulto" : "Adulto";
		System.out.println(nivel);
		// Aniamento OT
		nivel = (idade < 15) ? "infantil" : (idade >= 15) && (idade <= 18) ? "juvenil" : "profissional";
		System.out.println(nivel);

		// ----------------------------------------------------------------------------
		// Switch(Escolha)

	}

}
