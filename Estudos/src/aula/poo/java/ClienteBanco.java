package aula.poo.java;

public class ClienteBanco {
    public static void main(String[] args) {
       Banco banco = new Banco();

       banco.setTipo("CC");
       banco.abrirConta();
       banco.ContaBanco();

       System.out.println(banco.getTipo());


    }
}
