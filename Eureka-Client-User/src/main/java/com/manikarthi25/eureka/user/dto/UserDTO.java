package com.manikarthi25.eureka.user.dto;

import java.io.Serializable;
import java.util.List;

import com.manikarthi25.eureka.user.response.model.AlbumResponseModel;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 4906196889834127621L;

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userId;
	private String encryptedPassword;
	private List<AlbumResponseModel> albumsList;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public List<AlbumResponseModel> getAlbumsList() {
		return albumsList;
	}

	public void setAlbumsList(List<AlbumResponseModel> albumsList) {
		this.albumsList = albumsList;
	}

}
