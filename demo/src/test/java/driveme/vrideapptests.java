package driveme;

import java.util.logging.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import driveme.controllers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class vrideapptests {
	public Logger LOGGER = Logger.getLogger(vrideapptests.class.getName());

	@Test
	public void contextLoads() {
		
		
	}
	@Test
	public void acceptridetest()
	{
		ModelMap map;
		HttpServletRequest srequest;
		HttpServletResponse sresponse;
		
		LOGGER.info("entering into acceptridejunit test");
		//assertEquals("user_profile",findride.acceptRide(1001,map,srequest,sresponse));
	}

}
