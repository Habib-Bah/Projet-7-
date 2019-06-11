package com.opendevup.model;

public class AppUser {
	
	
		private Long userId;	
		private String userName;	
	    private String encrytedPassword;
	    private String prenom;
		private String email;
		private String role;	
		private int enabled;
	 
	    public AppUser() {
	
	    	this.role = "user";
	        this.enabled = 1;
	    }
	 
	    public AppUser(String userName, String prenom, String encrytedPassword, String email) {
	        
	        this.userName = userName;
	        this.encrytedPassword = encrytedPassword;
	        this.prenom = prenom;
	        this.email = email;
	        this.role = "user";
	        this.enabled = 1;
	        
	    }
	 
	    public Long getUserId() {
	        return userId;
	    }
	 
	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }
	 
	    public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getEncrytedPassword() {
	        return encrytedPassword;
	    }
	 
	    public void setEncrytedPassword(String encrytedPassword) {
	        this.encrytedPassword = encrytedPassword;
	    }
	    
	    
	 
	    public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getEnabled() {
			return enabled;
		}

		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}
		
		

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
	    public String toString() {
	        return this.userName + "/" + this.encrytedPassword;
	    }
	   
}
