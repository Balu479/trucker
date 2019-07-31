package io.github.Balu479.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.Balu479.Entity.Reading;
import io.github.Balu479.Service.ReadingService;

@Controller
public class ReadingController {
	@Autowired
	ReadingService readingService;
	@ResponseBody()
	@RequestMapping(method=RequestMethod.POST,value="/readings")
	public void postReadings(@RequestBody() Reading reading) {
		readingService.postReadings(reading);
	}

}
