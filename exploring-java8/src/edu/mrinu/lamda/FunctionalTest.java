package edu.mrinu.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalTest {
	public static void main(String[] args) {
		FunctionalTest test = new FunctionalTest();
		System.out.println(test.getAllUsers());
	}

	// public List<User> getAllUsers() {
	// return getAllUserdtos().stream().map(userdto -> {
	// User user = new User();
	// user.setUserName(userdto.getUserName());
	// user.setFullName(userdto.getFullName());
	// user.setActive(userdto.getActive());
	// return user;
	// }).collect(Collectors.toList());
	// }

	// public List<User> getAllUsers() {
	// return Arrays.asList(new UserDto("sam", "sam zen", true), new UserDto("john",
	// "john lucks", false))
	// .stream()
	// .map(User::new)
	// .collect(Collectors.toList());
	// }
	public List<User> getAllUsers() {
		return Arrays.asList(new UserDto("sam", "sam zen", true), new UserDto("john", "john lucks", false))
				.stream()
				.map(UserMapper::toUser)
				.collect(Collectors.toList());
	}
	// private User toUser(UserDto userdto) {
	// User user = new User();
	// user.setUserName(userdto.getUserName());
	// user.setFullName(userdto.getFullName());
	// user.setActive(userdto.getActive());
	// return user;
	// }

	// private List<UserDto> getAllUserdtos() {
	// return Arrays.asList(new UserDto("sam", "sam zen", true), new UserDto("john",
	// "john lucks", true));
	// }
}
