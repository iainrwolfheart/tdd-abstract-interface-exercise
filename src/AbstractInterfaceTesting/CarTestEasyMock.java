package AbstractInterfaceTesting;

import static org.junit.Assert.*;

import org.easymock.EasyMock;

import static org.easymock.EasyMock.createMock;


import org.junit.Before;
import org.junit.Test;

public class CarTestEasyMock {
	
	AudioDeviceService audioService;
	SatNavDeviceService satNavService;
	Car testCar;

	@Before
	public void setUp() throws Exception {
		audioService = createMock(AudioDeviceService.class);
		satNavService = createMock(SatNavDeviceService.class);
		testCar = new Car("Honda", "WF68 EET", audioService, satNavService);
	}

	@Test
	public void testAudio() {
		EasyMock.expect(audioService.displayDetails()).andReturn("Audio");
		EasyMock.replay(audioService);
		assertEquals("Audio", testCar.getHifi().displayDetails());
		EasyMock.verify(audioService); //Verifies that the service was actually used to pass expected value
	}
	
	@Test
	public void testSatNav() {
		EasyMock.expect(satNavService.displayDetails()).andReturn("Sat Nav");
		EasyMock.replay(satNavService);
		assertEquals("Sat Nav", testCar.getSatNav().displayDetails());
		EasyMock.verify(satNavService);
	}

}
