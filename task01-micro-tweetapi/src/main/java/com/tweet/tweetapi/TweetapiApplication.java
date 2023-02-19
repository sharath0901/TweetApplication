package com.tweet.tweetapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tweet.tweetapi.Service.TweetService;
import com.tweet.tweetapi.entity.Tweet;

@SpringBootApplication
public class TweetapiApplication implements CommandLineRunner   {

	
	@Autowired
	private TweetService ts;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ts.saveTweet(new Tweet("sharath", "heroda",LocalDate.parse("12-Nov-2021",DateTimeFormatter.ofPattern("dd-MMM-yyyy")),11, "better"));	
		ts.saveTweet(new Tweet("sharath", "herionda",LocalDate.parse("11-Nov-2021",DateTimeFormatter.ofPattern("dd-MMM-yyyy")),16, "okay"));
		ts.saveTweet(new Tweet("bharath", "gllodda",LocalDate.parse("12-Jan-2021",DateTimeFormatter.ofPattern("dd-MMM-yyyy")),1, "not bad"));
		ts.saveTweet(new Tweet("ganesh", "hdhdhd",LocalDate.parse("12-Feb-2021",DateTimeFormatter.ofPattern("dd-MMM-yyyy")),8, "super"));
		ts.saveTweet(new Tweet("suresh", "ydshsd",LocalDate.parse("12-Oct-2021",DateTimeFormatter.ofPattern("dd-MMM-yyyy")),10, "great tweet"));
	}

	
	public static void main(String[] args) {
		SpringApplication.run(TweetapiApplication.class, args);
	}


}
