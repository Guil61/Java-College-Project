import java.math.BigInteger;

public class EncontraPrimo extends Thread{
	
	//propriedades
	
	private BigInteger candidatoPrimo = null;

	
	//metodo construtor
	
	
	public EncontraPrimo(BigInteger candidatoPrimo) {
		super();
		this.candidatoPrimo = candidatoPrimo;
	}
	
	//metodo de execucao paralela
	
	public void run() {
		boolean achei = true;
		
		for (BigInteger divisor = BigInteger.TWO;
			divisor.compareTo(candidatoPrimo.divide(BigInteger.TWO)) < 0;
			divisor = divisor.add(BigInteger.ONE)) {
			if(candidatoPrimo.remainder(divisor) == BigInteger.ZERO) {
				achei = false;
				break;
			}
			
		}
		
		if (achei) {
			System.out.println("======================");
			System.out.println("Achei");
			System.out.println(candidatoPrimo);
		} 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
