public class CalculoBonificacao {

    private double soma;

    public void  registra(Funcionario f){
        this.soma += f.bonificacao();

    }
    public double getSoma(){
        return this.soma;
    }
    
}