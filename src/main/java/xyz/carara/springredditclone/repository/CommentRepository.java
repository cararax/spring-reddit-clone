package xyz.carara.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.springredditclone.model.Comment;
import xyz.carara.springredditclone.model.Post;
import xyz.carara.springredditclone.model.User;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}