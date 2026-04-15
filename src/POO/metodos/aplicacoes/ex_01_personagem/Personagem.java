package POO.metodos.aplicacoes.ex_01_personagem;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    public void exibeFichaPersonagem() {
        System.out.printf("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    // Metodo passando paramento String "alvo", "habilidade"
    void atacer(String alvo, String habilidade) {
        if (habilidade.length() == 0) {
            System.out.printf("%s atacou %s e causou %d de dano\n", nome, alvo, forca);
        } else {
            System.out.printf("%s usou %s contra %s e causou %d de dano.\n",
                    nome, habilidade, alvo, forca);
        }
    }
}