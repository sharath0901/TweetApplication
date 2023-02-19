package com.tweet.tweetapi.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tweet.tweetapi.Service.TweetService;
import com.tweet.tweetapi.entity.Tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3/tweets")
public class TweetController {

	@Autowired
	private TweetService  ts;

	
	@GetMapping
	 public List<Tweet> getTweets(){
		System.out.println("IT came to second microservice");
	//return ts.getAllTweet();
		System.out.println("data"+ts.getAllTweet().get(0));
		return ts.getAllTweet();
	 }


}
