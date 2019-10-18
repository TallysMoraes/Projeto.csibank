
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 100.00;
		conta1.agencia = 1234;
		conta1.numero = 123456;
		conta1.titular = "maria";
		
		Conta conta2 = new Conta();
		conta2.saldo= 100.00;
		conta2.agencia = 1234;
		conta2.numero = 123456;
		conta2.titular = "maria";
		
		if(conta1.agencia == conta2.agencia) {
			System.out.println("contas iguais!");
		}else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		if(conta1.agencia == conta2.agencia) {
			System.out.println("Agências iguais!");
		} else {
			System.out.println("Agências diferentes");
		}
	
		int numero1 = 5;
		int numero2 = 5;
		
		if(numero1 == numero2) {
			System.out.println("Números iguais");
		} else {
			System.out.println("Números diferentes");
		}
	
	}

}
