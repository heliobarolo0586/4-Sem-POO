package viagem;
import java.util.Date;

public class Testa {
    public static void main(String args[]){

        // passageiro é criado independente da reserva - agregação
        Passageiro pas1 = new Passageiro("15.425.987-5", "987.654.157-00", "Carlos");
        // voo é criado independente da reserva - agregação
        Voo vo1 = new Voo(852, "Minas", "Aeroportp", new Date());
       // agregação -> associados reserva, voo e passageiro
        Reserva re1 = new Reserva(3, new Date(), 3600, pas1, vo1);

        System.out.println(re1.toString());
    }
}
