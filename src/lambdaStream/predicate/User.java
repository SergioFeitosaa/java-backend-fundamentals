package lambdaStream.predicate;

import java.util.function.Predicate;

public class User {
    String nome;
    int idade;

    public User(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        User user1 = new User("Sergio", 30);
        User user2 = new User("Pedro", 15);

        Predicate <User> maiorDeIdade = idade -> idade.idade >= 18;

        System.out.println(maiorDeIdade.test(user1));
        System.out.println(maiorDeIdade.test(user2));
    }
}
