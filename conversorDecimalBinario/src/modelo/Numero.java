package modelo;

public class Numero {

	private int numDecimal;
	private int numBinario;
	
	public Numero(int numDecimal) {
		this.numDecimal = numDecimal;
	}
	
	public int convertirBinario() {
		int pos = 0;
		while (this.numDecimal != 0) {
			int digito = numDecimal % 2;
			numBinario = (int) (numBinario + digito * Math.pow(10, pos));
			pos++;
			this.numDecimal = this.numDecimal/2;
		}
		return numBinario;
	}

	public int getNumDecimal() {
		return numDecimal;
	}
	public void setNumDecimal(int numDecimal) {
		this.numDecimal = numDecimal;
	}

}
