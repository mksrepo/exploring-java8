package edu.mrinu.lamda;

public class UserMapper {
	public static User toUser(UserDto userdto) {
		return new User(userdto.getUserName(), userdto.getFullName(), userdto.getActive());
	}
}
