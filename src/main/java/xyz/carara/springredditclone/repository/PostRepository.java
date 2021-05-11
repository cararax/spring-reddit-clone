package xyz.carara.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.springredditclone.model.Post;
import xyz.carara.springredditclone.model.Subreddit;
import xyz.carara.springredditclone.model.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
