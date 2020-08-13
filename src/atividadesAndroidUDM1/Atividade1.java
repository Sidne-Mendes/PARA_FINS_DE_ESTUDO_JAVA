package atividadesAndroidUDM1;

public class Atividade1 {
	
	public void exerc1(){
		System.out.println("Hello World");
	}
	
	public int exerc2(String str){
		int valor =  str.length();
		return valor;
	}
	public int exerc3(String str) {

		int valor = str.length();
		System.out.println("A string '" + str + "' que foi passada tem : " + valor + ", character.");
		return valor;
	}
	public double exerc4(double num1,double num2) {
		
		double soma = (num1+num2);
		
		return soma;
	}
	public double exerc5(double x,double y,double z) {
		double resultado;
		
		resultado = ((x+y)*x)/z;
		
		return resultado;
	}
}
