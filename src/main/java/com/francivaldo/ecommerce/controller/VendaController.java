package com.francivaldo.ecommerce.controller;



import com.francivaldo.ecommerce.entities.Venda;
import com.francivaldo.ecommerce.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Transactional
@Controller
@RequestMapping("vendas")
public class VendaController {

    @Autowired
    VendaRepository repository;

    @GetMapping("/list")
    public String listar(Model model){
        List<Venda> vendas = repository.vendas();
        model.addAttribute("vendas", vendas);
        return "/vendas/list";
    }
}
