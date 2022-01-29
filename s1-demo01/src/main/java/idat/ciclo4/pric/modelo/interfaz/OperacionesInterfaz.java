package idat.ciclo4.pric.modelo.interfaz;

public interface OperacionesInterfaz {
	public final Double OP1 = (Double)0.04;
	public final Double OP2 = (Double)0.12;
	public final Double OP3 = (Double)0.24;
	public final Double FINAL = (Double)0.60;
	
	public Double ec1();
	public Double ec2();
	public Double ec3();
	public Double ecfinal();
}
