package com.itparis.b2.gestionref.basics;

public class User {
	private String gender;
	private String firstName;
	private String lastName;
	private String function;
	private String company;
	private String adress;
	private int zipCode;
	private String city;
	private String country;
	private int phone;
	private int fax;
	private String email;
	private String webSite;
	private String activity;
	private String otherActivity;
	private int workForce;
	private String title;
	private String keywords;
	private String summary;
	private String author;
	private String participantType;
	
	public User(String gender, String firstName, String lastName, String function, String company, String adress, int zipCode, String city, 
			String country, int phone, int fax, String email, String webSite, String activity, String otherActivity, int workForce, 
			String title, String keywords, String summary, String author, String participantType){
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.function = function;
		this.company = company;
		this.adress = adress;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.webSite = webSite;
		this.activity = activity;
		this.otherActivity = otherActivity;
		this.workForce = workForce;
		this.title = title;
		this.keywords = keywords;
		this.summary = summary;
		this.author = author;
		this.participantType = participantType;
	}
	
	public User(){
		this.gender = "";
		this.firstName = "";
		this.lastName = "";
		this.function = "";
		this.company = "";
		this.adress = "";
		this.zipCode = 0;
		this.city = "";
		this.country = "";
		this.phone = 0;
		this.fax = 0;
		this.email = "";
		this.webSite = "";
		this.activity = "";
		this.otherActivity = "";
		this.workForce = 0;
		this.title = "";
		this.keywords = "";
		this.summary = "";
		this.author = "";
		this.participantType = "";
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

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

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getOtherActivity() {
		return otherActivity;
	}

	public void setOtherActivity(String otherActivity) {
		this.otherActivity = otherActivity;
	}

	public int getWorkForce() {
		return workForce;
	}

	public void setWorkForce(int workForce) {
		this.workForce = workForce;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getParticipantType() {
		return participantType;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	@Override
	public String toString() {
		return "User [gender=" + gender + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", function=" + function
				+ ", company=" + company + ", adress=" + adress + ", zipCode="
				+ zipCode + ", city=" + city + ", country=" + country
				+ ", phone=" + phone + ", fax=" + fax + ", email=" + email
				+ ", webSite=" + webSite + ", activity=" + activity
				+ ", otherActivity=" + otherActivity + ", workForce="
				+ workForce + ", title=" + title + ", keywords=" + keywords
				+ ", summary=" + summary + ", author=" + author
				+ ", participantType=" + participantType + "]";
	}
	
	
}
