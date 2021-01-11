package hr.nursic.library.dto.user;

public class MRTDRequest {

	private String imageSource;
	private boolean returnFullDocumentImage;
	private boolean returnFaceImage;
	private boolean returnSignatureImage;

	public MRTDRequest(String imageSource, boolean returnFullDocumentImage, boolean returnFaceImage,
			boolean returnSignatureImage) {
		super();
		this.imageSource = imageSource;
		this.returnFullDocumentImage = returnFullDocumentImage;
		this.returnFaceImage = returnFaceImage;
		this.returnSignatureImage = returnSignatureImage;
	}

	public String getImageSource() {
		return imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}

	public boolean isReturnFullDocumentImage() {
		return returnFullDocumentImage;
	}

	public void setReturnFullDocumentImage(boolean returnFullDocumentImage) {
		this.returnFullDocumentImage = returnFullDocumentImage;
	}

	public boolean isReturnFaceImage() {
		return returnFaceImage;
	}

	public void setReturnFaceImage(boolean returnFaceImage) {
		this.returnFaceImage = returnFaceImage;
	}

	public boolean isReturnSignatureImage() {
		return returnSignatureImage;
	}

	public void setReturnSignatureImage(boolean returnSignatureImage) {
		this.returnSignatureImage = returnSignatureImage;
	}

}
