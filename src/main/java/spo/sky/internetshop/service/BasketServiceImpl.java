package spo.sky.internetshop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import spo.sky.internetshop.model.Basket;

import java.util.*;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private Basket basket= new Basket();

    @Override
    public void addItem(String ids) {
        basket.add(ids);
    }

    @Override
    public List<String> showItems() {
        return basket.showAllElements();
    }
}


