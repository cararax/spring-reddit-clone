package xyz.carara.springredditclone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import xyz.carara.springredditclone.model.Subreddit;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

    Optional<Subreddit> findByName(String subredditName);

}