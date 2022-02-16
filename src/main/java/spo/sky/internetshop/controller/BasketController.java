package spo.sky.internetshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spo.sky.internetshop.service.BasketService;

import java.util.List;

@RestController
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/add")
    public void addItem(@RequestParam String ids) {
        basketService.addItem(ids);
    }

    @GetMapping("/store/order/get")
    public List<String> showItem() {
        return basketService.showItems();
    }
}
