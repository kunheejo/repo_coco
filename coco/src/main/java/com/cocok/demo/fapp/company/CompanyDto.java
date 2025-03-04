package com.cocok.demo.fapp.company;





public class CompanyDto {

	
	private String seq;
	private String main;
	private String company;
	private String depart;
	private String position;
	private String addressBook_seq;
	
//	-----
	//게터세터를 꼭 dto에서 만들어야함
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(String addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
	
 
	
}
