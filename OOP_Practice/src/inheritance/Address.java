package inheritance;

public class Address {
	
	private String houseNo,street,city,country;

	public Address(String houseNo, String street, String city, String country) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}

	
	
	
}
