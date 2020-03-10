package AbstractInterfaceTesting;

public class GarminSatNav implements SatNavDeviceService {

	@Override
	public String displayDetails() {
		return "Garmin";
	}
}
