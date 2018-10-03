package cl.bci.clase03oct.rest;

import cl.bci.clase03oct.entity.Cliente;
import cl.bci.clase03oct.entity.Venta;
import cl.bci.clase03oct.repo.VentaRepo;
import cl.bci.clase03oct.repo.VentaRepo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteRest {

    @Autowired
    private VentaRepo ventaRepo;

    @Autowired
    private VentaRepo2 ventaRepo2;

    @GetMapping("/listar")
    public List<Venta> listar(){
        return (List<Venta>) ventaRepo.findAll();
    }

    @GetMapping("/venta/{id}")
    public Venta obtener(@PathVariable(name = "id") int id){
        Optional<Venta> optionalVenta = ventaRepo.findById(id);
        return optionalVenta.isPresent()? optionalVenta.get() : new Venta();
    }

    //MIA
    @GetMapping("/venta/cliente/{idcliente}")
    public Venta obtenerVentaPorCliente(@PathVariable(name = "idcliente") int id){
        Optional<Venta> optionalVenta = ventaRepo.findById(id);
        return optionalVenta.isPresent()? optionalVenta.filter(p -> p.getCliente().getIdCliente() == id).get() : new Venta();
    }

    //MIA
    @GetMapping("/venta/producto/{idproducto}")
    public Venta obtenerVentaPorProducto(@PathVariable(name = "idproducto") int id){
        Optional<Venta> optionalVenta = ventaRepo.findById(id);
        return optionalVenta.isPresent()? optionalVenta.filter(p -> p.getProducto().getIdProducto() == id).get() : new Venta();
    }

    //PROFE
    @GetMapping("/venta/cliente2/{idcliente}")
    public List<Venta> obtenerVentaPorCliente2(@PathVariable(name = "idcliente") int id){
        return ventaRepo.listarPorCliente(id);
    }

    //PROFE
    @GetMapping("/venta/cliente3/{idcliente}")
    public List<Venta> obtenerVentaPorCliente3(@PathVariable(name = "idcliente") int id){
        return ventaRepo2.listarPorCliente(id);
    }
}
