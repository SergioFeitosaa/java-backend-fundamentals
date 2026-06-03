package lambdaStream.anyAllNoneMatch;

import java.util.List;

public class UserService {
    private String nome;
    private Boolean admin;

    public UserService(String nome, Boolean admin) {
        this.nome = nome;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public static void main(String[] args) {
        UserService userService1 = new UserService("Carlos", false);
        UserService userService2 = new UserService("Ana", true);
        UserService userService3 = new UserService("Ana", false);
        UserService userService4 = new UserService("Maria", false);

        List<UserService> userServices = List.of(userService1, userService2, userService3, userService4);
        boolean userServiceList = userServices.stream()
                .anyMatch(UserService::getAdmin);
        if (userServiceList) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Nenhum admin encontrado");
        }

    }
}
