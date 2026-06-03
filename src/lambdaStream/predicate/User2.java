package lambdaStream.predicate;

import java.util.function.Predicate;

public class User2 {
    private String nome;
    private int idade;

    public User2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        User2 user1 = new User2("Valentina", 22);
        User2 user2 = new User2("Maximiliano", 25);
        User2 user3 = new User2("Bia", 35);

        Predicate<User2> nome = user -> user.getNome().length() > 10;

        System.out.println(nome.test(user1));
        System.out.println(nome.test(user2));
        System.out.println(nome.test(user3));
    }
}
