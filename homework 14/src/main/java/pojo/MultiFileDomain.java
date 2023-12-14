package pojo;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public class MultiFileDomain {
	
	private ArrayList<String> description;
	private ArrayList<MultipartFile> myfiles;
	
	public ArrayList<String> getDescription() {
		return description;
	}
	public void setDescription(ArrayList<String> description) {
		this.description = description;
	}
	public ArrayList<MultipartFile> getMyfiles() {
		return myfiles;
	}
	public void setMyfiles(ArrayList<MultipartFile> myfiles) {
		this.myfiles = myfiles;
	}
	
}
