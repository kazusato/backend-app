package kazusato.myapp.backendapp.api;

import kazusato.myapp.backendapp.model.BookInfo;
import kazusato.myapp.backendapp.repository.BookInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class BackendAppController {

    @Autowired
    private BookInfoRepository repository;

    @GetMapping
    public List<BookInfo> getAllBookInfo() {
        final List<BookInfo> bookList = new ArrayList<>();
        repository.findByAuthor("夏目漱石").forEach(b -> bookList.add(b));

        return bookList;
    }

}
