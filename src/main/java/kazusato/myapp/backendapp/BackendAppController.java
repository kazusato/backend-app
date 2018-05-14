package kazusato.myapp.backendapp;

import kazusato.myapp.backendapp.model.BookInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class BackendAppController {

    @GetMapping
    public List<BookInfo> getAllBookInfo() {
        List<BookInfo> bookList = new ArrayList<>();
        bookList.add(new BookInfo("1", "吾輩は猫である", "夏目漱石", "岩波書店", 756));
        bookList.add(new BookInfo("2", "走れメロス", "太宰治", "新潮社", 432));
        bookList.add(new BookInfo("3", "蜘蛛の糸・杜子春", "芥川龍之介", "新潮社", 346));

        return bookList;
    }

}
