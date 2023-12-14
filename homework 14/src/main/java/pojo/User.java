package pojo;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;


public class User {
	
	@NotBlank(message = "请输入名字")
	@Pattern(regexp = "[a-z0-9A-Z]{1,15}", message = "用户名格式不正确")
	@Length(min=1, max=15)
	private String name;
	
	@NotBlank(message = "请输入密码")
	@Length(min=1, max=15)
	@Pattern(regexp = "^(?=.*[:#-@*])[a-zA-Z0-9!@#$%^&*]{1,15}$", message = "密码格式不正确")
	private String pwd;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Past(message = "必须是过去时间")
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}	
}
