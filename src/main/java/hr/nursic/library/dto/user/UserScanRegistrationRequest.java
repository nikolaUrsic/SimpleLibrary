package hr.nursic.library.dto.user;

public class UserScanRegistrationRequest {
	private String image;
	
	public UserScanRegistrationRequest(){
		super();
	}

	public UserScanRegistrationRequest(String image) {
		super();
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	};
	
	
}
