package ro.mh.jspractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("/addBook")
    public String addBookView(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @GetMapping("/view")
    public String view(){
        return "view-books";
    }



}
