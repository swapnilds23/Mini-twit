/**
 * 
 */
package cs.minitwit.minitwitapi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cs.minitwit.minitwitapi.model.Message;
import cs.minitwit.minitwitapi.model.User;

/**
 * @author Swapnil
 *
 */
@Controller
public class MiniTwitRestController {

	@GetMapping("/api/v1.0/user/{id}")
	public User getUsrInfo(@PathVariable String id) {
		return null;
	}
	
	@GetMapping("/api/v1.0/timeline/{username}")
	public List<Message> getUserTimeline(@PathVariable String username){
		return null;
	}
	
	@GetMapping("/api/v1.0/login")
	public String login(@RequestBody User user) {
		return null;
	}
	
	@PostMapping("/api/v1.0/user")
	public String register(@RequestBody User user) {
		return null;
	}
	
	
	@PostMapping("/api/v1.0/message")
	public String twit(@RequestBody Message message) {
		return null;
	}
	
	
	@GetMapping("/api/v1.0/messages")
	public List<Message> getAllMessages(){
		return null;
	}
	
	@GetMapping("/api/v1.0/home/{username}")
	public List<Message> getHomePage(@PathVariable String username){
		return null;
	}
	
	@PostMapping("/api/v1.0/follower/{username}")
	public String followUser(@PathVariable String username) {
		return null;
	}
	
	@DeleteMapping("/api/v1.0/follower/{username}")
	public String unFollowUser(@PathVariable String username) {
		return null;
	}
}
