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
    }

    public void fecharConta() {
        setStatus(false);
    }
    
    public void depositar() {
        setSaldo(saldo);
    }

    public void sacar() {
    }
    
}
