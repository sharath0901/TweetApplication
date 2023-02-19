package com.tweet.tweetapi.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweet.tweetapi.entity.Tweet;
import java.util.List;
import com.tweet.tweetapi.repository.TweetRepository;

@Service
public class TweetService {

	
	@Autowired
	private TweetRepository trepo;
	
	
	public List<Tweet> getAllTweet(){
		
		return trepo.findAll();
	}
	
	public Tweet saveTweet(Tweet t) {
		return  trepo.save(t);
		
	}
}
