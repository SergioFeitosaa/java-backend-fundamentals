package lambdaStream.predicate;

import java.util.function.Predicate;

public class UserIdoso {
    private String nome;
    private int idade;

    public UserIdoso(String nome, int idade) {
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
        UserIdoso userIdoso1 = new UserIdoso("Sérgio", 37);
        UserIdoso userIdoso2 = new UserIdoso("Carlos", 62);
        UserIdoso userIdoso3 = new UserIdoso("Ana", 70);

        Predicate<UserIdoso> idoso = userIdoso -> userIdoso.getIdade() >=60;

        System.out.println(idoso.test(userIdoso1));
        System.out.println(idoso.test(userIdoso2));
        System.out.println(idoso.test(userIdoso3));
    }
}
