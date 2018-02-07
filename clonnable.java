package cloneDemo;

public class clonnable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad = new Address("pune", 12345);
		empl e1 = new empl(1, "megha", ad);

		empl e2 = (empl) e1.clone();
		System.out.println(e1 == e2);
		System.out.println(e1.getClass() == e2.getClass());
		System.out.println(e1.equals(e2));
		System.out.println("SHALLOW CLONNING");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("DEEP CLONNING");

		e1.setName("neha");
		e1.getAd().setCityname("mumbai");

		System.out.println(e1);
		System.out.println(e2);

	}

}

/**
 * @author megha
 *
 */
class empl implements Cloneable {
	int id;
	String name;
	Address ad;

	@Override
	public String toString() {
		return "empl [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}

	public empl(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		empl Cloneable = (empl) super.clone();
		Cloneable.setAd((Address) Cloneable.getAd().clone());
		return Cloneable;

		// Address Cloneable = set(Cloneable.ad)get(Cloneable.ad);
	}

}

class Address implements Cloneable {
	String cityname;
	int pincode;

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", pincode=" + pincode + "]";
	}

	public Address(String cityname, int pincode) {
		super();
		this.cityname = cityname;
		this.pincode = pincode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}