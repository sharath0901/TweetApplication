package com.registerlogin.micro.task01microregisterlogin.TweetAPI;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.registerlogin.micro.task01microregisterlogin.RestClient.ClientUser;

@FeignClient(name="TWEET-APP")
	public interface TweetRest {

	@GetMapping("/api/v3/tweets")
	public List<ClientUser> readAlltweets();
//		
//	@GetMapping("/api/v3/tweets/id")
//	public List<ClientUser> findByFirstName();
	
}
