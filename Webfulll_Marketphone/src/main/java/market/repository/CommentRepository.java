package market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import market.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
