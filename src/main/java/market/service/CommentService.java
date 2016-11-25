package market.service;

import java.util.List;

import market.model.Comment;

public interface CommentService {
Comment create(Comment comment);
List<Comment> getAll();
}
