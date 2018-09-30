package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	private static Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

//	@Autowired
//	DeliveryDAO deliveryDao;

	public DeliveryServiceImpl() {
		// needed for instantiation
	}

	@Override
	public Delivery getDelivery(String conID) {
		Delivery loginRes = new Delivery();

//		log.debug(ApplicationConstants.LOG_ENTRY_MESSAGE);
		try {

//			String deliveryDate=deliveryDao.validateLogin(conID);
			//int count = loginDao.validateLogin(conID);
			int count=1;
			if("1234".equals(conID))
			{
				loginRes.setDeliveryDate("12 dec");
			}else
			{
				loginRes.setDeliveryDate("Incorrect Consignment");
			}
		} catch (Exception e) {
			log.error("Error while validating username password..." + e);
		} finally {

//			log.debug(ApplicationConstants.LOG_EXIT_MESSAGE);
		}
		return loginRes;
	}

}