package spo.sky.internetshop.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<String> basket=new ArrayList<>();

    public Basket() {
        this.basket = basket;
    }

    public void add(String ids) {
        basket.add(ids);
    }

    public List<String> showAllElements() {
        return basket;
    }
}
