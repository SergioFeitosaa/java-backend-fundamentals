package lambdaStream.predicate;

import java.util.function.Predicate;

public class NomeComS {

    private String nome;
    private int idade;

    public NomeComS(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        User user1 = new User("Sérgio Feitosa", 37);
        User user2 = new User("Carlos Bosch", 38);

        Predicate<User> nomeComS = user -> user.nome.startsWith("S");

        System.out.println(nomeComS.test(user1));
        System.out.println(nomeComS.test(user2));

    }
}
