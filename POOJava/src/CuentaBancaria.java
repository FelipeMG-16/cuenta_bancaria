
public class CuentaBancaria {

	
	//Atributos de la clase
	
		String institucion = "";
		String beneficiario = "";
		float saldo = 0;
		long cuenta = 0;
		String producto = "";
		String direcci�n = "";
		String RFC = "";
		
		
		CuentaBancaria(String beneficiario, float saldo){
			this.beneficiario = beneficiario;
			this.saldo = saldo;
		}
		
		//M�todos de la clase
		public void depositos (float monto) {
			this.saldo = this.saldo + monto;
				
		}
		
		public void retiros (float monto) {
			if (monto < this.saldo && monto >0 ) {
				this.saldo = this.saldo - monto;
			
			}
		}
		
		public float consultarSaldo() {
			return this.saldo;
		}
		
		public String estadoDeCuenta() {
			return "";
		}
	}