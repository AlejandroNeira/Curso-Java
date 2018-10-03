package cl.bci.clase03oct.rest;

import cl.bci.clase03oct.entity.Producto;
import cl.bci.clase03oct.entity.Venta;
import cl.bci.clase03oct.repo.ProductoRepo;
import cl.bci.clase03oct.repo.VentaRepo;
import cl.bci.clase03oct.repo.VentaRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoRest {

    @Autowired
    private ProductoRepo productoRepo;

    @PostMapping("/")
    public int crear(@RequestBody Producto producto){
        producto = productoRepo.save(producto);
        return producto.getIdProducto();
    }

    @GetMapping("/")
    public List listar(){
        return (List<Producto>) productoRepo.findAll();
    }

    @GetMapping("/{id}")
    public Producto Obtener(@PathVariable("id") int id){
        Optional<Producto> optionalProducto = productoRepo.findById(id);
        return optionalProducto.isPresent()? optionalProducto.get() : new Producto();
    }

    @PutMapping("/")
    public int modificar(Producto producto){
        producto = productoRepo.save(producto);
        return producto.getIdProducto();
    }

    @GetMapping("/ordenada")
    public List ordenada(){
        return (List<Producto>) productoRepo.findAll();
    }

}
