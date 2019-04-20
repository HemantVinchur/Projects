package com.hv.jdbc;

public class JDBC_DTO {

	
	private int id;
	private String first_name;
	private String last_name;
	private String gender;
	private String enrollment_no;
	private String contact_no;
	private String email;
	private String user_name;
	private String password;
	private String role;
	private String inAction;
	private String submit;
	private String event_name;
	private String department;
	private String description;
	private String venue;
	private String date;
	private String time;
	private String message;
	private String feedback;
	private String reply;
public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	/*    private String pass;
    private String userName;
    public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}*/
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubmit() {
		return submit;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEnrollment_no() {
		return enrollment_no;
	}
	public void setEnrollment_no(String enrollment_no) {
		this.enrollment_no = enrollment_no;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setInAction(String inAction) {
		this.inAction = inAction;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public String getInAction() {
		return inAction;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "JDBC_DTO [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
				+ ", enrollment_no=" + enrollment_no + ", contact_no=" + contact_no + ", email=" + email
				+ ", user_name=" + user_name + ", password=" + password + ", role=" + role + ", inAction=" + inAction
				+ ", submit=" + submit + ", event_name=" + event_name + ", department=" + department + ", description="
				+ description + ", venue=" + venue + ", date=" + date + ", time=" + time + ", message=" + message
				+ ", feedback=" + feedback + ", reply=" + reply + "]";
	}

}
