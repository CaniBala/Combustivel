package mvc;

public class CalculoCombModel {
   
    private double valorGasolina, valorAlcool, valorResultado;
    private String resultado;
   
    public double getValorGasolina() {
        return valorGasolina;
    }
    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }
    public double getValorAlcool() {
        return valorAlcool;
    }
    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }
    public double getValorResultado() {
		return valorResultado;
	}
	public void setValorResultado(double valorResultado) {
		this.valorResultado = valorResultado;
	}
	public String getResultado() {
		return resultado;
	}
	
	//Calcula a % de alcool referente a gasolina
	public void valorResultado(){
       
        valorResultado = valorAlcool/valorGasolina;
       
    }
   
	//Imprime o resultado do que deve ser abastecido
    public void resultado(){
       
         if (valorResultado <= 0.7) {
        	 resultado = "Abasteca com Alcool";
             } else {
             resultado = "Abasteca com Gasolina";
             }
       
    }
   
   
   
}