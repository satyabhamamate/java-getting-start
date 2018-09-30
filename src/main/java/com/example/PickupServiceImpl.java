package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PickupServiceImpl implements PickupService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);
	
//	@Autowired
//	PickupDAO pickupDao;

	public PickupServiceImpl() {
		// needed for instantiation
	}

	@Override
	public Pickup getPickup(String conID) {
		Pickup loginRes = new Pickup();

//		log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		try {

//			String pickupDate="1234".equals(conID);
			//int count = loginDao.validateLogin(conID);
			int count=1;
			if("1234".equals(conID))
			{
				loginRes.setPickupDate("12 dec");
			}else
			{
				loginRes.setPickupDate("Incorrect Consignment");
			}
		} catch (Exception e) {
			log.error("Error while validating username password..." + e);
		} finally {

//			log.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return loginRes;
	}
}