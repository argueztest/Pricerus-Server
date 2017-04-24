package com.pricerus.api.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	  	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;

	    private String userName;

	    private String password;
	    
	    private String salt; 

	    
	    public String getSalt() {
			return salt;
		}


		public void setSalt(String salt) {
			this.salt = salt;
		}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String username) {
			this.userName = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    

}
