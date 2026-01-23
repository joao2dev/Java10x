package NivelIntermediario.Desafio6;

import java.util.LinkedList;
// NinjaGenerico tem um ninja
public class NinjaGenerico<T extends Ninja>  {
   private LinkedList<T> listaDeNinjas;

    public NinjaGenerico() {
        this.listaDeNinjas = new LinkedList<>();
    }


//  METODO PARA ADICIONAR NOVO NINJA
    public void colocarNinja(T ninja){
        listaDeNinjas.add(ninja);
    }


//  METODO PARA REMOVER O PRIMEIRO NINJA DA LISTA
    public void removerPrimeiroNinja(){
        listaDeNinjas.remove(0);
    }


//  METODO PARA ADICIONAR UM NOVO NINJA NO INICIO
    public void adiconarNinjaInicio(T ninja  ){
        listaDeNinjas.add(0,ninja);
    }


//    ACESSAR INFORMAÇOES DE UM NINJA
    public void infoNinja(int linha){
        System.out.println(listaDeNinjas.get(linha));
    }


//    MOSTRAR LISTA
    public void mostrarLista(){
        for (T ninja : listaDeNinjas){
            System.out.println( listaDeNinjas.indexOf(ninja) + " - " + ninja.getNome());
        }
    }


    public LinkedList<T> getListaDeNinjas() {
        return listaDeNinjas;
    }


    public void setListaDeNinjas(LinkedList<T> listaDeNinjas) {
        this.listaDeNinjas = listaDeNinjas;
    }



    @Override
    public String toString() {
        return "Lista de ninjas: \n" + listaDeNinjas.toString();
    }
}
