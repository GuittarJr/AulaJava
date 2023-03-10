package aula.poo.java;

public class Banco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //getters and setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // metodos especiais
    public void ContaBanco (){
        this.setSaldo(0);  
        this.setStatus(false);
    }

    // metodos

    public void abrirConta() {
        setTipo(tipo);
        setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50);
        }
        else if(tipo == "CP"){
            this.setSaldo(100);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        setStatus(false);
        if (this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }
        else if (this.getSaldo()<0) {
            System.out.println("Conta não pode ser fechada pois o saldo está negativo");
        }
        
        System.out.println("Conta fechada");
    }
    
    public void depositar(float v) {
        if (this.status == true){
            setSaldo(getSaldo()+v);
        }
    }

    public void sacar(float saque) {
        if (this.status == true){
            setSaldo(getSaldo()-saque);
        }
    }
    
}
