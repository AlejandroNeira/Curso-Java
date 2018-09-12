package cl.bci.clase8.demo.Controller;

import cl.bci.clase8.demo.model.Calculadora;
import cl.bci.clase8.demo.model.Producto;
import cl.bci.clase8.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService cservicio;

    @GetMapping("/producto")
    public String calcular(Model model){
        Producto producto = new Producto();
        producto.setNombre("");
        producto.setPrecioPeso(0);
        model.addAttribute("producto",producto);
        model.addAttribute("precioDolar",0);
        return "Producto";
    }

    @PostMapping("/producto")
    public String calcular(Producto producto, Model model){
        model.addAttribute("precioDolar",cservicio.calculoDolar(producto));
        model.addAttribute("producto",producto);
        return "Producto";
    }
}
