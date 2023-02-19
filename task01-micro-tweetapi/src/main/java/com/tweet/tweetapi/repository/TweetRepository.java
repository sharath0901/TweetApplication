package com.tweet.tweetapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweet.tweetapi.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {

}
