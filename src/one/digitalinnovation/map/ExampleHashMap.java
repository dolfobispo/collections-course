package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String,Integer> campeoesMundiais = new HashMap<>();
        campeoesMundiais.put("Brasil",5);
        campeoesMundiais.put("Alemanha",4);
        campeoesMundiais.put("Italia",4);
        campeoesMundiais.put("Uruguai",2);
        campeoesMundiais.put("Argentina",2);
        campeoesMundiais.put("França",2);
        campeoesMundiais.put("Inglaterra",1);
        campeoesMundiais.put("Espanha",1);
        System.out.println(campeoesMundiais);
        System.out.println(campeoesMundiais.get("Alemanha"));
        if(campeoesMundiais.containsKey("Brasil")){campeoesMundiais.put("Brasil",6);};
        System.out.println(campeoesMundiais);
        campeoesMundiais.remove("Espanha");
        System.out.println(campeoesMundiais);
        campeoesMundiais.forEach((s, integer) -> {
            campeoesMundiais.put(s,integer+1);
        });

        System.out.println(campeoesMundiais);
        System.out.println(campeoesMundiais.get("abs"));
        campeoesMundiais.put(null,123);

    }

}
