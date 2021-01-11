package hr.nursic.library.dto.user;

public class MRTDResponse {
	private String executionId;
	private String finishTime;
	private String startTime;
	private Result result;

	public String getDirectlyRawMrzString() {
		return result.getMrzData().getRawMrzString();
	}

	// Getter Methods

	public String getExecutionId() {
		return executionId;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public Result getResult() {
		return result;
	}

	// Setter Methods

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}

class Result {
	private DateOfBirth dateOfBirth;
	private ClassInfo classInfo;
	private String type;
	private boolean isBelowAgeLimit;
	private float age;
	private String recognitionStatus;
	private String firstName;
	private String lastName;
	private String fullName;
	private String address;
	private DateOfIssue dateOfIssue;
	private DateOfExpiry dateOfExpiry;
	private String documentNumber;
	private String sex;
	private DriverLicenseDetailedInfo driverLicenseDetailedInfo;
	private String fullDocumentImageBase64;
	private String faceImageBase64;
	private String additionalNameInformation;
	private String additionalAddressInformation;
	private String placeOfBirth;
	private String nationality;
	private String race;
	private String religion;
	private String profession;
	private String maritalStatus;
	private String residentialStatus;
	private String employer;
	private String personalIdNumber;
	private String documentAdditionalNumber;
	private String documentOptionalAdditionalNumber;
	private String issuingAuthority;
	private MrzData mrzData;
	private String conditions;
	private String localizedName;
	private boolean dateOfExpiryPermanent;
	private String additionalPersonalIdNumber;
	private Viz viz;
	private Barcode barcode;
	private ImageAnalysisResult imageAnalysisResult;
	private String processingStatus;
	private String recognitionMode;
	private String signatureImageBase64;

	// Getter Methods

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public String getType() {
		return type;
	}

	public boolean getIsBelowAgeLimit() {
		return isBelowAgeLimit;
	}

	public float getAge() {
		return age;
	}

	public String getRecognitionStatus() {
		return recognitionStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return address;
	}

	public DateOfIssue getDateOfIssue() {
		return dateOfIssue;
	}

	public DateOfExpiry getDateOfExpiry() {
		return dateOfExpiry;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getSex() {
		return sex;
	}

	public DriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
		return driverLicenseDetailedInfo;
	}

	public String getFullDocumentImageBase64() {
		return fullDocumentImageBase64;
	}

	public String getFaceImageBase64() {
		return faceImageBase64;
	}

	public String getAdditionalNameInformation() {
		return additionalNameInformation;
	}

	public String getAdditionalAddressInformation() {
		return additionalAddressInformation;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public String getRace() {
		return race;
	}

	public String getReligion() {
		return religion;
	}

	public String getProfession() {
		return profession;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public String getEmployer() {
		return employer;
	}

	public String getPersonalIdNumber() {
		return personalIdNumber;
	}

	public String getDocumentAdditionalNumber() {
		return documentAdditionalNumber;
	}

	public String getDocumentOptionalAdditionalNumber() {
		return documentOptionalAdditionalNumber;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public MrzData getMrzData() {
		return mrzData;
	}

	public String getConditions() {
		return conditions;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public boolean getDateOfExpiryPermanent() {
		return dateOfExpiryPermanent;
	}

	public String getAdditionalPersonalIdNumber() {
		return additionalPersonalIdNumber;
	}

	public Viz getViz() {
		return viz;
	}

	public Barcode getBarcode() {
		return barcode;
	}

	public ImageAnalysisResult getImageAnalysisResult() {
		return imageAnalysisResult;
	}

	public String getProcessingStatus() {
		return processingStatus;
	}

	public String getRecognitionMode() {
		return recognitionMode;
	}

	public String getSignatureImageBase64() {
		return signatureImageBase64;
	}

	// Setter Methods

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setIsBelowAgeLimit(boolean isBelowAgeLimit) {
		this.isBelowAgeLimit = isBelowAgeLimit;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public void setRecognitionStatus(String recognitionStatus) {
		this.recognitionStatus = recognitionStatus;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDateOfIssue(DateOfIssue dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfExpiry(DateOfExpiry dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDriverLicenseDetailedInfo(DriverLicenseDetailedInfo driverLicenseDetailedInfo) {
		this.driverLicenseDetailedInfo = driverLicenseDetailedInfo;
	}

	public void setFullDocumentImageBase64(String fullDocumentImageBase64) {
		this.fullDocumentImageBase64 = fullDocumentImageBase64;
	}

	public void setFaceImageBase64(String faceImageBase64) {
		this.faceImageBase64 = faceImageBase64;
	}

	public void setAdditionalNameInformation(String additionalNameInformation) {
		this.additionalNameInformation = additionalNameInformation;
	}

	public void setAdditionalAddressInformation(String additionalAddressInformation) {
		this.additionalAddressInformation = additionalAddressInformation;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setPersonalIdNumber(String personalIdNumber) {
		this.personalIdNumber = personalIdNumber;
	}

	public void setDocumentAdditionalNumber(String documentAdditionalNumber) {
		this.documentAdditionalNumber = documentAdditionalNumber;
	}

	public void setDocumentOptionalAdditionalNumber(String documentOptionalAdditionalNumber) {
		this.documentOptionalAdditionalNumber = documentOptionalAdditionalNumber;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public void setMrzData(MrzData mrzData) {
		this.mrzData = mrzData;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public void setDateOfExpiryPermanent(boolean dateOfExpiryPermanent) {
		this.dateOfExpiryPermanent = dateOfExpiryPermanent;
	}

	public void setAdditionalPersonalIdNumber(String additionalPersonalIdNumber) {
		this.additionalPersonalIdNumber = additionalPersonalIdNumber;
	}

	public void setViz(Viz viz) {
		this.viz = viz;
	}

	public void setBarcode(Barcode barcode) {
		this.barcode = barcode;
	}

	public void setImageAnalysisResult(ImageAnalysisResult imageAnalysisResult) {
		this.imageAnalysisResult = imageAnalysisResult;
	}

	public void setProcessingStatus(String processingStatus) {
		this.processingStatus = processingStatus;
	}

	public void setRecognitionMode(String recognitionMode) {
		this.recognitionMode = recognitionMode;
	}

	public void setSignatureImageBase64(String signatureImageBase64) {
		this.signatureImageBase64 = signatureImageBase64;
	}
}

class ImageAnalysisResult {
	private boolean blurred;
	private String documentImageColorStatus;
	private String documentImageMoireStatus;
	private String faceDetectionStatus;
	private String mrzDetectionStatus;
	private String barcodeDetectionStatus;

	// Getter Methods

	public boolean getBlurred() {
		return blurred;
	}

	public String getDocumentImageColorStatus() {
		return documentImageColorStatus;
	}

	public String getDocumentImageMoireStatus() {
		return documentImageMoireStatus;
	}

	public String getFaceDetectionStatus() {
		return faceDetectionStatus;
	}

	public String getMrzDetectionStatus() {
		return mrzDetectionStatus;
	}

	public String getBarcodeDetectionStatus() {
		return barcodeDetectionStatus;
	}

	// Setter Methods

	public void setBlurred(boolean blurred) {
		this.blurred = blurred;
	}

	public void setDocumentImageColorStatus(String documentImageColorStatus) {
		this.documentImageColorStatus = documentImageColorStatus;
	}

	public void setDocumentImageMoireStatus(String documentImageMoireStatus) {
		this.documentImageMoireStatus = documentImageMoireStatus;
	}

	public void setFaceDetectionStatus(String faceDetectionStatus) {
		this.faceDetectionStatus = faceDetectionStatus;
	}

	public void setMrzDetectionStatus(String mrzDetectionStatus) {
		this.mrzDetectionStatus = mrzDetectionStatus;
	}

	public void setBarcodeDetectionStatus(String barcodeDetectionStatus) {
		this.barcodeDetectionStatus = barcodeDetectionStatus;
	}
}

class Barcode {
	private String rawDataBase64;
	private String stringData;
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String additionalNameInformation;
	private String address;
	private String placeOfBirth;
	private String nationality;
	private String race;
	private String religion;
	private String profession;
	private String maritalStatus;
	private String residentialStatus;
	private String employer;
	private String sex;
	private DateOfBirth dateOfBirth;
	private DateOfIssue dateOfIssue;
	private DateOfExpiry dateOfExpiry;
	private String documentNumber;
	private String personalIdNumber;
	private String documentAdditionalNumber;
	private String issuingAuthority;
	private AddressDetailedInfo addressDetailedInfo;
	private DriverLicenseDetailedInfo driverLicenseDetailedInfo;

	// Getter Methods

	public String getRawDataBase64() {
		return rawDataBase64;
	}

	public String getStringData() {
		return stringData;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAdditionalNameInformation() {
		return additionalNameInformation;
	}

	public String getAddress() {
		return address;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public String getRace() {
		return race;
	}

	public String getReligion() {
		return religion;
	}

	public String getProfession() {
		return profession;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public String getEmployer() {
		return employer;
	}

	public String getSex() {
		return sex;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public DateOfIssue getDateOfIssue() {
		return dateOfIssue;
	}

	public DateOfExpiry getDateOfExpiry() {
		return dateOfExpiry;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getPersonalIdNumber() {
		return personalIdNumber;
	}

	public String getDocumentAdditionalNumber() {
		return documentAdditionalNumber;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public AddressDetailedInfo getAddressDetailedInfo() {
		return addressDetailedInfo;
	}

	public DriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
		return driverLicenseDetailedInfo;
	}

	// Setter Methods

	public void setRawDataBase64(String rawDataBase64) {
		this.rawDataBase64 = rawDataBase64;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAdditionalNameInformation(String additionalNameInformation) {
		this.additionalNameInformation = additionalNameInformation;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfIssue(DateOfIssue dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfExpiry(DateOfExpiry dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public void setPersonalIdNumber(String personalIdNumber) {
		this.personalIdNumber = personalIdNumber;
	}

	public void setDocumentAdditionalNumber(String documentAdditionalNumber) {
		this.documentAdditionalNumber = documentAdditionalNumber;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public void setAddressDetailedInfo(AddressDetailedInfo addressDetailedInfo) {
		this.addressDetailedInfo = addressDetailedInfo;
	}

	public void setDriverLicenseDetailedInfo(DriverLicenseDetailedInfo driverLicenseDetailedInfo) {
		this.driverLicenseDetailedInfo = driverLicenseDetailedInfo;
	}
}

class DriverLicenseDetailedInfo {
	private String restrictions;
	private String endorsements;
	private String vehicleClass;
	private String conditions;

	// Getter Methods

	public String getRestrictions() {
		return restrictions;
	}

	public String getEndorsements() {
		return endorsements;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public String getConditions() {
		return conditions;
	}

	// Setter Methods

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	public void setEndorsements(String endorsements) {
		this.endorsements = endorsements;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
}

class AddressDetailedInfo {
	private String street;
	private String postalCode;
	private String city;
	private String jurisdiction;

	// Getter Methods

	public String getStreet() {
		return street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	// Setter Methods

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
}

class DateOfExpiry {
	private float day;
	private float month;
	private float year;
	private boolean successfullyParsed;
	private String originalString;

	// Getter Methods

	public float getDay() {
		return day;
	}

	public float getMonth() {
		return month;
	}

	public float getYear() {
		return year;
	}

	public boolean getSuccessfullyParsed() {
		return successfullyParsed;
	}

	public String getOriginalString() {
		return originalString;
	}

	// Setter Methods

	public void setDay(float day) {
		this.day = day;
	}

	public void setMonth(float month) {
		this.month = month;
	}

	public void setYear(float year) {
		this.year = year;
	}

	public void setSuccessfullyParsed(boolean successfullyParsed) {
		this.successfullyParsed = successfullyParsed;
	}

	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
}

class DateOfIssue {
	private float day;
	private float month;
	private float year;
	private boolean successfullyParsed;
	private String originalString;

	// Getter Methods

	public float getDay() {
		return day;
	}

	public float getMonth() {
		return month;
	}

	public float getYear() {
		return year;
	}

	public boolean getSuccessfullyParsed() {
		return successfullyParsed;
	}

	public String getOriginalString() {
		return originalString;
	}

	// Setter Methods

	public void setDay(float day) {
		this.day = day;
	}

	public void setMonth(float month) {
		this.month = month;
	}

	public void setYear(float year) {
		this.year = year;
	}

	public void setSuccessfullyParsed(boolean successfullyParsed) {
		this.successfullyParsed = successfullyParsed;
	}

	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
}

class DateOfBirth {
	private float day;
	private float month;
	private float year;
	private boolean successfullyParsed;
	private String originalString;

	// Getter Methods

	public float getDay() {
		return day;
	}

	public float getMonth() {
		return month;
	}

	public float getYear() {
		return year;
	}

	public boolean getSuccessfullyParsed() {
		return successfullyParsed;
	}

	public String getOriginalString() {
		return originalString;
	}

	// Setter Methods

	public void setDay(float day) {
		this.day = day;
	}

	public void setMonth(float month) {
		this.month = month;
	}

	public void setYear(float year) {
		this.year = year;
	}

	public void setSuccessfullyParsed(boolean successfullyParsed) {
		this.successfullyParsed = successfullyParsed;
	}

	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
}

class Viz {
	private String firstName;
	private String lastName;
	private String fullName;
	private String additionalNameInformation;
	private String localizedName;
	private String address;
	private String additionalAddressInformation;
	private String placeOfBirth;
	private String nationality;
	private String race;
	private String religion;
	private String profession;
	private String maritalStatus;
	private String residentialStatus;
	private String employer;
	private String sex;
	private DateOfBirth dateOfBirth;
	private DateOfIssue dateOfIssue;
	private DateOfExpiry dateOfExpiry;
	private boolean dateOfExpiryPermanent;
	private String documentNumber;
	private String personalIdNumber;
	private String documentAdditionalNumber;
	private String additionalPersonalIdNumber;
	private String documentOptionalAdditionalNumber;
	private String issuingAuthority;
	private DriverLicenseDetailedInfo driverLicenseDetailedInfo;
	private String conditions;

	// Getter Methods

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAdditionalNameInformation() {
		return additionalNameInformation;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public String getAddress() {
		return address;
	}

	public String getAdditionalAddressInformation() {
		return additionalAddressInformation;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public String getRace() {
		return race;
	}

	public String getReligion() {
		return religion;
	}

	public String getProfession() {
		return profession;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public String getEmployer() {
		return employer;
	}

	public String getSex() {
		return sex;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public DateOfIssue getDateOfIssue() {
		return dateOfIssue;
	}

	public DateOfExpiry getDateOfExpiry() {
		return dateOfExpiry;
	}

	public boolean getDateOfExpiryPermanent() {
		return dateOfExpiryPermanent;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getPersonalIdNumber() {
		return personalIdNumber;
	}

	public String getDocumentAdditionalNumber() {
		return documentAdditionalNumber;
	}

	public String getAdditionalPersonalIdNumber() {
		return additionalPersonalIdNumber;
	}

	public String getDocumentOptionalAdditionalNumber() {
		return documentOptionalAdditionalNumber;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public DriverLicenseDetailedInfo getDriverLicenseDetailedInfo() {
		return driverLicenseDetailedInfo;
	}

	public String getConditions() {
		return conditions;
	}

	// Setter Methods

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAdditionalNameInformation(String additionalNameInformation) {
		this.additionalNameInformation = additionalNameInformation;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAdditionalAddressInformation(String additionalAddressInformation) {
		this.additionalAddressInformation = additionalAddressInformation;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfIssue(DateOfIssue dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfExpiry(DateOfExpiry dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void setDateOfExpiryPermanent(boolean dateOfExpiryPermanent) {
		this.dateOfExpiryPermanent = dateOfExpiryPermanent;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public void setPersonalIdNumber(String personalIdNumber) {
		this.personalIdNumber = personalIdNumber;
	}

	public void setDocumentAdditionalNumber(String documentAdditionalNumber) {
		this.documentAdditionalNumber = documentAdditionalNumber;
	}

	public void setAdditionalPersonalIdNumber(String additionalPersonalIdNumber) {
		this.additionalPersonalIdNumber = additionalPersonalIdNumber;
	}

	public void setDocumentOptionalAdditionalNumber(String documentOptionalAdditionalNumber) {
		this.documentOptionalAdditionalNumber = documentOptionalAdditionalNumber;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public void setDriverLicenseDetailedInfo(DriverLicenseDetailedInfo driverLicenseDetailedInfo) {
		this.driverLicenseDetailedInfo = driverLicenseDetailedInfo;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
}

class MrzData {
	private String rawMrzString;
	private String documentCode;
	private String issuer;
	private String documentNumber;
	private String opt1;
	private String opt2;
	private String gender;
	private String nationality;
	private String primaryId;
	private String secondaryId;
	private String alienNumber;
	private String applicationReceiptNumber;
	private String immigrantCaseNumber;
	private boolean mrzVerified;
	private boolean mrzParsed;
	private DateOfBirth dateOfBirth;
	private DateOfExpiry dateOfExpiry;
	private String documentType;
	private String issuerName;
	private String nationalityName;

	// Getter Methods

	public String getRawMrzString() {
		return rawMrzString;
	}

	public String getDocumentCode() {
		return documentCode;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getOpt1() {
		return opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public String getGender() {
		return gender;
	}

	public String getNationality() {
		return nationality;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public String getSecondaryId() {
		return secondaryId;
	}

	public String getAlienNumber() {
		return alienNumber;
	}

	public String getApplicationReceiptNumber() {
		return applicationReceiptNumber;
	}

	public String getImmigrantCaseNumber() {
		return immigrantCaseNumber;
	}

	public boolean getMrzVerified() {
		return mrzVerified;
	}

	public boolean getMrzParsed() {
		return mrzParsed;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public DateOfExpiry getDateOfExpiry() {
		return dateOfExpiry;
	}

	public String getDocumentType() {
		return documentType;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	// Setter Methods

	public void setRawMrzString(String rawMrzString) {
		this.rawMrzString = rawMrzString;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public void setSecondaryId(String secondaryId) {
		this.secondaryId = secondaryId;
	}

	public void setAlienNumber(String alienNumber) {
		this.alienNumber = alienNumber;
	}

	public void setApplicationReceiptNumber(String applicationReceiptNumber) {
		this.applicationReceiptNumber = applicationReceiptNumber;
	}

	public void setImmigrantCaseNumber(String immigrantCaseNumber) {
		this.immigrantCaseNumber = immigrantCaseNumber;
	}

	public void setMrzVerified(boolean mrzVerified) {
		this.mrzVerified = mrzVerified;
	}

	public void setMrzParsed(boolean mrzParsed) {
		this.mrzParsed = mrzParsed;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfExpiry(DateOfExpiry dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}
}

class ClassInfo {
	private String country;
	private String region;
	private String type;

	// Getter Methods

	public String getCountry() {
		return country;
	}

	public String getRegion() {
		return region;
	}

	public String getType() {
		return type;
	}

	// Setter Methods

	public void setCountry(String country) {
		this.country = country;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setType(String type) {
		this.type = type;
	}
}
