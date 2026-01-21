package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

//    Inicializar nossa lista
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }



    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }
//  adicionar itens na lista
    public void colocarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }
//    Mostrar itens
    public void mostrarLista(){
        for (T equipamento : equipamentos){
            System.out.println(equipamento);
        }
    }
    public String toString(){
        return "Lista de equipamentos: "+ equipamentos.toString();
    }
}
