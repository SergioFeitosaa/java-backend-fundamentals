package excecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_03 {

    public static void main(String[] args) {
//        Compila? - Não compila
//        Qual erro aparece? - Erro

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date data = sdf.parse("30-04-2026");
            System.out.println(data);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
    }
}
