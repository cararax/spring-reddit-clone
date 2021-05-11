package xyz.carara.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.springredditclone.model.Post;
import xyz.carara.springredditclone.model.User;
import xyz.carara.springredditclone.model.Vote;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);

}