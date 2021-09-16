package com.lti.mini;

public class ComplaintPojo {
	
	private String dt_received;
	private String prod;
	private String sub_prod;
	private  String issue;
	private String sub_issue;
	private String company;
	private String state;
	private String zipcode;
	private String sub_via;		//complaint submitted via
	private String dt_sent_to_comp;
	private String comp_response;
	private String timely_res;
	private String consumer_disputed;
	
	public ComplaintPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplaintPojo(String dt_received, String prod, String sub_prod, String issue, String sub_issue,
			String company, String state, String zipcode, String sub_via, String dt_sent_to_comp, String comp_response,
			String timely_res, String consumer_disputed) {
		super();
		this.dt_received = dt_received;
		this.prod = prod;
		this.sub_prod = sub_prod;
		this.issue = issue;
		this.sub_issue = sub_issue;
		this.company = company;
		this.state = state;
		this.zipcode = zipcode;
		this.sub_via = sub_via;
		this.dt_sent_to_comp = dt_sent_to_comp;
		this.comp_response = comp_response;
		this.timely_res = timely_res;
		this.consumer_disputed = consumer_disputed;
		
	}

	public String getDt_received() {
		return dt_received;
	}

	public void setDt_received(String dt_received) {
		this.dt_received = dt_received;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getSub_prod() {
		return sub_prod;
	}

	public void setSub_prod(String sub_prod) {
		this.sub_prod = sub_prod;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getSub_issue() {
		return sub_issue;
	}

	public void setSub_issue(String sub_issue) {
		this.sub_issue = sub_issue;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSub_via() {
		return sub_via;
	}

	public void setSub_via(String sub_via) {
		this.sub_via = sub_via;
	}

	public String getDt_sent_to_comp() {
		return dt_sent_to_comp;
	}

	public void setDt_sent_to_comp(String dt_sent_to_comp) {
		this.dt_sent_to_comp = dt_sent_to_comp;
	}

	public String getComp_response() {
		return comp_response;
	}

	public void setComp_response(String comp_response) {
		this.comp_response = comp_response;
	}

	public String getTimely_res() {
		return timely_res;
	}

	public void setTimely_res(String timely_res) {
		this.timely_res = timely_res;
	}

	public String getConsumer_disputed() {
		return consumer_disputed;
	}

	public void setConsumer_disputed(String consumer_disputed) {
		this.consumer_disputed = consumer_disputed;
	}

	/*public int getComplaint_id() {
		return complaint_id;
	}

	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}*/
	
	
	
	
}
