package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoRoupas {
    private List<Roupas> listRoupas;

    public CarrinhoRoupas() {
        this.listRoupas = new ArrayList<>();
    }

    public void addRoupas(String name, String large, Double price, int quantity) {
        listRoupas.add(new Roupas(name, large, price, quantity));
    }

    public void removeRoupas(String name) {
        List<Roupas> removeRoupas = new ArrayList<>();
        if (!listRoupas.isEmpty()) {
            for (Roupas r : listRoupas) {
                if (r.getName().equalsIgnoreCase(name)) {
                    removeRoupas.add(r);
                }
            }
            listRoupas.removeAll(removeRoupas);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public List<Roupas> searchRoupas(String name) {
        List<Roupas> searchingRoupas = new ArrayList<>();
        if (!listRoupas.isEmpty()) {
            for (Roupas p : listRoupas) {
                if (p.getName().equalsIgnoreCase(name)) {
                    searchingRoupas.add(p);
                }
            }
            return searchingRoupas;
        }

        return searchingRoupas;
    }

    public Double calcValueTotal() {
        Double valueTotal = 0d;
        if (!listRoupas.isEmpty()){
            for (Roupas rp : listRoupas) {
                Double valueRoupa = rp.getPrice() * rp.getQuantity();
                valueTotal += valueRoupa;
            }
            return valueTotal;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }
}
