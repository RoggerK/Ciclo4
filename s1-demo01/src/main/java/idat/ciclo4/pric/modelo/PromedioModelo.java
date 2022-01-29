package idat.ciclo4.pric.modelo;

import idat.ciclo4.pric.modelo.entidad.NotasEntidad;
import idat.ciclo4.pric.modelo.interfaz.OperacionesInterfaz;

public class PromedioModelo extends NotasEntidad implements OperacionesInterfaz {

	public String resultado() {
		String mensaje = "";
		
		Double notafinal = this.ec1() + this.ec2() + this.ec3() + this.ecfinal();
		
		/*
		if (ec1 < 0.0 || ec2 < 0.0 || ec3 < 0.0 || ecfinal < 0.0) {

			if (ec1 < 0.0)
				ec1 = 0.0;

			if (ec2 < 0.0)
				ec2 = 0.0;

			if (ec3 < 0.0)
				ec3 = 0.0;

			if (ecfinal < 0.0)
				ecfinal = 0.0;
		}
		*/
		
		   
		mensaje += "EC1: " + this.ec1() + "\nEC2: " + this.ec2() + "\nEC3: " + this.ec3() + "\nEFINAL: " + this.ecfinal() + "\nNOTA FINAL: "
				+ notafinal;

		return mensaje;
	}

	@Override
	public Double ec1() {
		Double op1 = this.getNota1() * OP1;
		return op1;
	}

	@Override
	public Double ec2() {
		Double op2 = this.getNota2() * OP2;
		return op2;
	}

	@Override
	public Double ec3() {
		Double op3 = this.getNota3() * OP3;
		return op3;
	}

	@Override
	public Double ecfinal() {
		Double opfinal = this.getNota4() * FINAL;
		return opfinal;
	}
}
