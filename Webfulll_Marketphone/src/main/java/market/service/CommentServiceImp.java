package market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import market.model.Comment;
import market.repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService {
	@Autowired
	CommentRepository commentRepository;
	@Override
	public Comment create(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepository.save(comment);
	}
	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

}
