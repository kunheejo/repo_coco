package com.cocok.demo.fapp.address;

public class AddressDto {

	 
	 
	private String seq;
	private int main;
	private String type;
	private String postNum;
	private String betterAddress;
	private int addressBook_seq;
	
//	=========
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getMain() {
		return main;
	}
	public void setMain(int main) {
		this.main = main;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public String getBetterAddress() {
		return betterAddress;
	}
	public void setBetterAddress(String betterAddress) {
		this.betterAddress = betterAddress;
	}
	public int getAddressBook_seq() {
		return addressBook_seq;
	}
	public void setAddressBook_seq(int addressBook_seq) {
		this.addressBook_seq = addressBook_seq;
	}
}
