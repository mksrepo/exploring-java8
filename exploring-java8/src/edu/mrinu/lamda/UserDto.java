package edu.mrinu.lamda;

public class UserDto {
	private String userName;
	private String fullName;
	private Boolean active;

	public UserDto(String userName, String fullName, Boolean active) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.active = active;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
