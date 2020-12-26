package parentchildabs7;

public class Nobile {
	protected int mobileId;
	protected String Brandname;
	protected float Price;
	public Nobile(int mobileId, String brandname, float price) {
		this.mobileId = mobileId;
		Brandname = brandname;
		Price = price;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public float calculateDiscount()
	{
		float discount=(Price*10)/100;
		return discount;
	}

}
