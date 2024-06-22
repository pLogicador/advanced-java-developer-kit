/*
* Tamanho da lista:                     size()
* Obter o elemento de uma posição:      get(position)
* Inserir elemento na lista:            add(obj), add(int, obj)
* Remover elementos da lista:           remove(obj), remove(int), removeIf(Predicate)
* Encontrar posição de elemento:        indexOf(obj), lastIndexOf(obj)
*
* Filtrar lista com base em predicado:
*    List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
*
* Encontrar primeira ocorrência com base em predicado:
*    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
* */


package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        /* Adicionando itens */
        list.add("Bob");
        list.add("George");
        list.add("Gustavo");
        list.add("Henrique");
        list.add("Bianca");
        list.add("Ana");
        list.add("Antonieta");
        list.add(1, "Amelia");

        System.out.println(list.size()); // retorna o tamanho da lista
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println("----------Remove-----------");
        list.removeIf(x -> x.charAt(0) == 'B'); // remove cujo primeiro caractere começe com B
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println("----------Search-----------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Henrique"));
        System.out.println("----------filter-----------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String item : result) {
            System.out.println(item);
        }
        System.out.println("----------find with lambda predicate -----------");
        String firstName = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(firstName);

    }
}
