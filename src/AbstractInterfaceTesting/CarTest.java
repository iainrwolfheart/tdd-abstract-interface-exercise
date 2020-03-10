package AbstractInterfaceTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

	private Car honda;
	private Car bmw;
	private AppleAudio apple;
	private AudioDeviceService bose;
	private TomTomSatNav tomTom;
	private SatNavDeviceService garmin;

	
	@Before
	public void setUp() throws Exception {
		apple = new AppleAudio();
		bose = new BoseAudio();
		tomTom = new TomTomSatNav();
		garmin = new GarminSatNav();
		honda = new Car("Honda", "WF68 EET", apple, tomTom);
		bmw = new Car("BWM", "NT68 BMW", bose, garmin);
	}

	@Test
	public void testInstanceOfAudioDeviceService() {
		Assert.assertTrue(apple instanceof AudioDeviceService);
		Assert.assertTrue(bose instanceof BoseAudio);
	}

	@Test
	public void testNotInstanceOfOtherBrands() {
		Assert.assertFalse(bose instanceof AppleAudio);
		
	}
	
	@Test
	public void testCarsHaveAudioDeviceAndSatNav() {
		Assert.assertEquals("Apple Audio", honda.getHifi().displayDetails());
		Assert.assertEquals("Bose Audio", bmw.getHifi().displayDetails());
		Assert.assertEquals("Tom Tom", honda.getSatNav().displayDetails());
		Assert.assertEquals("Garmin", bmw.getSatNav().displayDetails());
	}
	
	@After
	public void tearDown() {
		apple = null;
		bose = null;
		tomTom = null;
		garmin = null;
		honda = null;
		bmw = null;
	}
}
