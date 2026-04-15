package POO.metodos.aplicacoes.ex_01_personagem;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Chrono";
        heroi.nivel = 10;
        heroi.forca = 20;

        heroi.exibeFichaPersonagem();
        //chamei um metodo atacar e passei como argumento uma string "Hydra"
        heroi.atacer("Hydra", "Golpe Duplo");


    }
}
