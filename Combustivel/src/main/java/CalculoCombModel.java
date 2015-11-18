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
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public void valorResultado(){
       
        valorResultado = valorAlcool/valorGasolina;
       
    }
   
    public void resultado(){
       
         if (valorResultado <= 0.7) {
        	 resultado = "Abasteca com Alcool";
             } else {
             resultado = "Abasteca com Gasolina";
             }
       
    }
   
   
   
}