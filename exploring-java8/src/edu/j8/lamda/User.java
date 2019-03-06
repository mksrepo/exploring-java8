package edu.j8.lamda;

public class User {
	private String userName;
	private String fullName;
	private Boolean active;

	public User(String userName, String fullName, Boolean active) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.active = active;
	}

	public User(UserDto userdto) {
		super();
		this.userName = userdto.getUserName();
		this.fullName = userdto.getFullName();
		this.active = userdto.getActive();
	}

	public User() {
		super();
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

	@Override
	public String toString() {
		return "User [userName=" + userName + ", fullName=" + fullName + ", active=" + active + "]";
	}

}
