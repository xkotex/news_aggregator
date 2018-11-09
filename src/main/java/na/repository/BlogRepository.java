package na.repository;

import na.entity.Blog;
import na.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByUser(User user);

}
