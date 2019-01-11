package falon.bean;

import java.util.Date;

public class User {
	/**
	 * id int auto_increment primary key ,
    userName varchar(32) not null,
    passWord varchar(32) not null,
    nickname varchar(32) ,
    profilePhoto varchar(32), -- 头像
    phone varchar(32) not null,
	createtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP 
	 */
	
	private int id;
	
	private String userName;
	
	private String passWord;
	
	private String nickName;
	
	private String profilePhoto;
	
	private String phone;
	
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", nickName=" + nickName
				+ ", profilePhoto=" + profilePhoto + ", phone=" + phone + ", createTime=" + createTime + "]";
	}
	
}
