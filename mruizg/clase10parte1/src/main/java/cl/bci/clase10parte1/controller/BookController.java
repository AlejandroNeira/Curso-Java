package cl.bci.clase10parte1.controller;

import cl.bci.clase10parte1.entity.Book;
import cl.bci.clase10parte1.reposiroty.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/create")
    public String create(Model model){
        Book book = new Book();
        model.addAttribute("book",book);
        model.addAttribute("message","");
        return "create";
    }

    @PostMapping("/create")
    public String create(Model model, @RequestParam("button1") String button1, @ModelAttribute Book book){

        if (button1.equals("Clear")) {
            book = new Book();
        }else{
            book = bookRepo.save(book);
            model.addAttribute("message","Saved book "+book.getBookId());
        }
        model.addAttribute("book",book);
        return "create";
    }

}
