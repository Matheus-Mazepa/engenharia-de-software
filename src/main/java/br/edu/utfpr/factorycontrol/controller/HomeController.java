package br.edu.utfpr.factorycontrol.controller;

import br.edu.utfpr.factorycontrol.model.*;
import br.edu.utfpr.factorycontrol.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductionOrderService productionOrderService;

    @GetMapping
    public String showIndex() {
        User user = new User("mazepa", "123123", "Mazepa");
        user = this.userService.save(user);
        System.out.println("Usuário " + user.getName() + " foi criado");

        Client client = new Client("Comprador", "999.222.333-23", "(12) 12243-4343");
        client = this.clientService.save(client);
        System.out.println("Cliente " + client.getName() + " foi criado");

        Product product = new Product("123", 10d, "Pote 10L");
        product = this.productService.save(product);
        System.out.println("Produto " + product.getDescription() + " foi criado");

        Order order = new Order("0001", user, client);
        order = this.orderService.save(order);
        System.out.println("Pedido " + order.getCode() + " foi criado");
        order.addProduct(product);
        order = this.orderService.save(order);

        ProductionOrder productionOrder = new ProductionOrder("0001", user);
        productionOrder = this.productionOrderService.save(productionOrder);
        System.out.println("Pedido " + productionOrder.getCode() + " foi criado");
        productionOrder.addProduct(product);
        productionOrder = this.productionOrderService.save(productionOrder);

        return "home";
    }

}
