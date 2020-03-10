package AbstractInterfaceTesting;

public class Car {
	
	private String make;
	private String reg;
	private AudioDeviceService hifi;
	private SatNavDeviceService satNav;
	
	
	public Car(String make, String reg, AudioDeviceService hifi, SatNavDeviceService satNav) {
		this.make = make;
		this.reg = reg;
		this.hifi = hifi;
		this.satNav = satNav;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public AudioDeviceService getHifi() {
		return hifi;
	}
	public void setHifi(AppleAudio hifi) {
		this.hifi = hifi;
	}
	public SatNavDeviceService getSatNav() {
		return satNav;
	}
	public void setSatNav(TomTomSatNav satNav) {
		this.satNav = satNav;
	}

	@Override
	public String toString() {
		return "Car [make= " + make + ", reg= " + reg + ", hifi= " + getHifi().displayDetails() + ", satNav= " + getSatNav().displayDetails() + "]";
	}
}
