package spo.sky.internetshop.service;

import java.util.List;

public interface BasketService {

    void addItem(String ids);

    List<String> showItems();
}
