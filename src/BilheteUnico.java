import java.util.Random;

public class BilheteUnico {
    static final double TARIFA = 5.20;
    long numero;
    double saldo;
    Usuario usuario;

    public BilheteUnico(long cpf, String nome, String perfil){
        Random random = new Random();
        numero = random.nextLong(1000,10000);
        usuario = new Usuario(cpf, nome, perfil);
    }

    //método para carregar o bilhete
    public void carregaSaldo(double valor){
        saldo += valor;
    }

    //método para consultar o saldo do bilhete
    public double consultaSaldo(){
        return saldo;
    }

    //método para passar na catraca
    public String passaCatraca(){
        double debito = TARIFA / 2;

        if(usuario.perfil.equalsIgnoreCase("Comum")){
            debito = TARIFA;
        }
        if(saldo >= debito){
            saldo -= debito;
            return "Catraca Liberada";
        }
        return "Saldo Insuficiente";
    }

}
