package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImpl implements RestService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

//	@Autowired
//	private LoginService service;
//
//	@Autowired
//	private CreateUserAccountService createUserAccountService;
	@Autowired
	private DeliveryService deliverDervice;
	@Autowired
	private PickupService pickService;
	
	public RestServiceImpl() {
		// needed for autowiring
	}
	@Override
	public String login() {
		// log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		return "Satya";
	}
//	@Override
//	public NewUserResponse createUserAccount(String firstname, String lastname, String dob, String gender, String address,
//			String city, String state, String zip, String email, String userid, String password, String usertype,
//			String usercode, Long phone, Integer age) throws Exception {
//		 log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
//		return createUserAccountService.createUserAccount(firstname, lastname, dob, gender, address, city, state, zip, email, userid, password,usertype,usercode, phone, age);
//	}
	
	@Override
	public Delivery getDelivery(String conID) {
//		 log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		return deliverDervice.getDelivery(conID);
	}
	@Override
	public Pickup getPickup(String conID) {
//		 log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		return pickService.getPickup(conID);
	}

}
