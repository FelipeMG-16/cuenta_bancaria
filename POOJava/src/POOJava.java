import java.util.Scanner;

public class POOJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CuentaBancaria cuenta_personal = new CuentaBancaria("Carlos Eduardo", 1461.14f);
	
	//CuentaBancaria cuenta_personal = new CuentaBancaria();
	
	
	/*Definimos las opciones de la cuenta bancaria.
	1. Retiro
	2. Depósito
	3. Imprimir saldo
	4. Estado de cuenta
	5. Agregar beneficiario
	6. Salir 	
	*/
	
	int opcion = 0;
	
	do {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println ("Menú cuenta bancaria \n");
		System.out.println ("Ingresa la opción deseada");
		System.out.println ("1. Retiro");
		System.out.println ("2. Deposito");
		System.out.println ("3. Imprimir saldo");
		System.out.println ("4. Estado de cuenta");
		System.out.println ("5. Agregar beneficiario");
		System.out.println ("6. Salir");
		
		opcion = leer.nextInt();
		
		
		switch (opcion) {
		case 1:
			System.out.println ("Ingrese la cantidad que desea retirar:");
			float monto = leer.nextFloat();
			cuenta_personal.retiros(monto);
			System.out.println("********************************* \n");
			break;
			
		case 2:
			System.out.println ("Ingrese la cantidad que desea depositar:");
			float deposito = leer.nextFloat();
			cuenta_personal.depositos(deposito);
			System.out.println("*********************************\n");
			break;
			
		case 3:
			System.out.println ("El monto total de su saldo es:" + 
		cuenta_personal.consultarSaldo());
			System.out.println("*********************************\n");
			break;
			
		case 4:
			System.out.println ("El beneficiario de la cuenta es:" + 
		cuenta_personal.beneficiario);
			System.out.println("*********************************\n");
			break;
			
		case 5:
			System.out.println("Ingrese el nombre del beneficiario");
			String nombre = leer.next();
			cuenta_personal.beneficiario = nombre;
			break;
		}
		
	} while(opcion != 6);
		
	
	/*
	cuenta_personal.beneficiario = "Felipe Maqueda";
	System.out.println ("Ingresa un monto a depositar:");
	
	float deposito = leer.nextFloat();
	
	System.out.println ("Ingresa un monto a retirar:");
	float retiro = leer.nextFloat();
	
	
	cuenta_personal.depositos(deposito);
	cuenta_personal.retiros(retiro);
	System.out.println("Tu saldo actual es: $" + cuenta_personal.consultarSaldo());
	
	
	System.out.println(cuenta_personal.beneficiario);
	
	/*
	CuentaBancaria cuenta_papa = new CuentaBancaria();
	cuenta_papa.beneficiario = "Francisco Maqueda";
	System.out.println(cuenta_papa.beneficiario);
	*/
	
	
	}

}
