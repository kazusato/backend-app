package kazusato.myapp.backendapp.web;

import kazusato.myapp.backendapp.model.BookInfo;
import kazusato.myapp.backendapp.repository.BookInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/booklist")
public class BookListController {

    @Autowired
    private BookInfoRepository repository;

    @ModelAttribute
    BookListForm setUpForm() {
        return new BookListForm();
    }

    @GetMapping
    public String getAllBookInfo(Model model) {
        final List<BookInfo> bookList = new ArrayList<>();
//        repository.findByAuthor("夏目漱石").forEach(b -> bookList.add(b));
        repository.findAll().forEach(b -> bookList.add(b));
        model.addAttribute("bookList", bookList);

        return "booklist";
    }

    @PostMapping(path = "register")
    public String registerBookInfo(BookListForm form, BindingResult result, Model model) {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setId(form.getId());
        bookInfo.setTitle(form.getTitle());
        bookInfo.setAuthor(form.getAuthor());
        bookInfo.setPublisher(form.getPublisher());
        bookInfo.setPrice(form.getPrice());

        repository.save(bookInfo);

        return "redirect:/booklist";
    }

}
