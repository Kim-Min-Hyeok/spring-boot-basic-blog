package alsgur.rla.springbootdeveloperblog.repository;

import alsgur.rla.springbootdeveloperblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
