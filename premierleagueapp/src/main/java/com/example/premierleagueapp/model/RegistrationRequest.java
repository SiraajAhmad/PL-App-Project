package com.example.premierleagueapp.model;

public class RegistrationRequest {

    private String email;
    private String password;
    private String firstName;
    private String surname;
    private Role role;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String firstName, String surname, String password, String email, Role role) {
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}
