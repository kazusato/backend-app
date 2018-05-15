package kazusato.myapp.backendapp.repository;

import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
import kazusato.myapp.backendapp.model.BookInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookInfoRepository extends DocumentDbRepository<BookInfo, String> {
    List<BookInfo> findByAuthor(String author);
}
