package io.github.Balu479.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Balu479.Entity.Reading;
import io.github.Balu479.Repository.ReadingRepository;

@Service
public class ReadingServiceImpl implements ReadingService {
	@Autowired
	ReadingRepository readingRepo;

	public void postReadings(Reading reading) {
		// TODO Auto-generated method stub
		readingRepo.save(reading);
		
	}
	

}
