package lambdaStream.anyAllNoneMatch;

import java.util.List;

public class Funcionario {
    private String nome;
    private boolean bloqueado;

    public Funcionario(String nome, boolean bloqueado) {
        this.nome = nome;
        this.bloqueado = bloqueado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos", false);
        Funcionario funcionario2 = new Funcionario("Ana", false);
        Funcionario funcionario3 = new Funcionario("João", false);

        List<Funcionario> funcionarios = List.of(funcionario1, funcionario2,funcionario3);
        boolean nenhumBloqueados = funcionarios
                .stream()
                .noneMatch(Funcionario::isBloqueado);
        if (nenhumBloqueados){
            System.out.println("Sistema ok");
        }else {
            System.out.println("Funcionário bloqueado encontrado");
        }
    }
}
