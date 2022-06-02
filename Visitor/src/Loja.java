import java.util.ArrayList;
import java.util.List;

class Loja {

    private final List<Equipamento> eqList = new ArrayList<>();

    public void addEquipamento(Equipamento e) {
        eqList.add(e);
    }

    public List<Equipamento> getEquipamentoList() {
        return eqList;
    }
}