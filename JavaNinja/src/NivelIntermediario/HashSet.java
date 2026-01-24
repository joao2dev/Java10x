package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("naruto uzumaki");
        ninjas.add("sasuke Uchicha");
        ninjas.add("sakura haruno");
        ninjas.add("naruto uzumaki");
        ninjas.add("boruto");

//        hashSet para tirar elementos duplicados sem ordem
        Set<String> ninjasSet = new java.util.HashSet<>();
        ninjasSet.addAll(ninjas);
//        TreeSet para tirar elemetos duplicados e deixar em ordem logica
        Set<String> ninjasTreeSet = new java.util.TreeSet<>();
        ninjasTreeSet.addAll(ninjas);
//        LinkedHashSet para tirar elementos duplicados e deixar com ordem de implementação
        Set<String> ninjasLinkSet = new java.util.LinkedHashSet<>();
        ninjasLinkSet.addAll(ninjas);


        System.out.println("ninjasList = " + ninjas);
        System.out.println("ninjasSet = " + ninjasSet);
        System.out.println("ninjasSet = " + ninjasTreeSet);
        System.out.println("ninjasSet = " + ninjasLinkSet);
    }
}
