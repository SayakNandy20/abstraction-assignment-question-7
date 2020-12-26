package parentchildabs7;

public class Smartphone extends Nobile {
	private String cameraDetails;
	private String NetworkSupport;
	public Smartphone(int mobileId, String brandname, float price, String cameraDetails, String networkSupport) {
		super(mobileId, brandname, price);
		this.cameraDetails = cameraDetails;
		NetworkSupport = networkSupport;
	}
	public String getCameraDetails() {
		return cameraDetails;
	}
	public void setCameraDetails(String cameraDetails) {
		this.cameraDetails = cameraDetails;
	}
	public String getNetworkSupport() {
		return NetworkSupport;
	}
	public void setNetworkSupport(String networkSupport) {
		NetworkSupport = networkSupport;
	}
	@Override
	public float calculateDiscount() {
		// TODO Auto-generated method stub
		float correctDiscount=(15*super.Price)/100;
		return correctDiscount;
	}


}
