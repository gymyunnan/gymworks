package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("annotationUser")
public class AnnotationUser {
	
	@Value("chenheng")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
