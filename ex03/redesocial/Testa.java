package redesocial;

public class Testa {
    
    public static void main(String args[]){

        Usuario usr1 = new Usuario("carlinhos@email.com", "145");

        Usuario usr2 = new Usuario("baltazar@gmail.com", "458");
    
        Usuario usr3 = new Usuario("douglas@email.com", "784");
    
        RedeSocial rs = new RedeSocial(1, "Instagram", "www.instagram");

        rs.addUsuario(usr1); // adiciona usuáro na rede social
        rs.addUsuario(usr2); 
        rs.addUsuario(usr3); 

        System.out.println(rs.toString());
    }
}