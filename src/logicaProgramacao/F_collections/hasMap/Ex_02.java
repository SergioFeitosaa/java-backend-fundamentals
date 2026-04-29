package logicaProgramacao.F_collections.hasMap;

import java.util.HashMap;
import java.util.Map;

public class Ex_02 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        //Add dados
        products.put("Mouse", 100);
        products.put("Teclado", 200);
        products.put("Monitor", 900);

        System.out.println(products);

        //Buscando valor
        System.out.println(products.get("Mouse"));

        //Verificar se existe
        System.out.println(products.containsKey("Teclado"));
        System.out.println(products.containsKey("Monitor"));

        //Removendo
        System.out.println(products.remove("Monitor"));

        //Pecorrendo Map
        for (String key : products.keySet()){
            System.out.println(key);
        }

        for (Integer value : products.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Atualizar valor
        System.out.println(products.put("Mouse", 150));

    }
}
