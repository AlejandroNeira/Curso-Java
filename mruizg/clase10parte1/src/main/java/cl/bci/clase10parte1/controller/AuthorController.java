package cl.bci.clase10parte1.controller;

import cl.bci.clase10parte1.entity.Author;
import cl.bci.clase10parte1.reposiroty.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepo authorRepo;

    @GetMapping("/list")
    public String list(Model model){
        List<Author> list = (List<Author>) getAuthorRepo().findAll();
        model.addAttribute("authorList", list);
        return "listAuthor";
    }

    @GetMapping("/{id}")
    public String update(Model model, @PathVariable("id") int id){

        Optional<Author> author = authorRepo.findById(id);
        model.addAttribute("author",author);
        model.addAttribute("message","");
        return "updateAuthor";
    }

    @PostMapping("/{id}")
    public String update(Model model, @ModelAttribute Author author){
        getAuthorRepo().save(author);
        return "redirect:/author/list";

    }

    @GetMapping("/create")
    public String create(Model model){
        Author author = new Author();
        model.addAttribute("author",author);
        model.addAttribute("message","");
        return "createAuthor";
    }

    @PostMapping("/create")
    public String create(Model model, @RequestParam("button1") String button1, @ModelAttribute Author author){

        if (button1.equals("Clear")) {
            author = new Author();
            model.addAttribute("author",author);
            model.addAttribute("message","Cleared");
            return "createAuthor";
        }else{
            author = getAuthorRepo().save(author);
            /*model.addAttribute("message","Saved Author "+author.getAuthorId());
            model.addAttribute("author",author);*/
            return "redirect:/author/list";
        }
    }

    public AuthorRepo getAuthorRepo() {
        return authorRepo;
    }

    public void setAuthorRepo(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
}
