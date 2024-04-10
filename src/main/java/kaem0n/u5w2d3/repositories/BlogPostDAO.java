package kaem0n.u5w2d3.repositories;

import kaem0n.u5w2d3.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostDAO extends JpaRepository<BlogPost, Long> {
}
