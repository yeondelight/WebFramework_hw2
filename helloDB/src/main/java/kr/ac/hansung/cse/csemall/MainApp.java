package kr.ac.hansung.cse.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/hansung/cse/conf/beans.xml");
	
		OfferDao offerDao = (OfferDao) context.getBean("offerDao");
		System.out.println("The record count is " + offerDao.getRowCount());
		
		List<Offer> offerList = offerDao.getOffers();
		for(Offer offer:offerList)
			System.out.println(offer);
		
		Offer offer = new Offer();
		offer.setName("trudy");
		offer.setEmail("trudy@hansung.ac.kr");
		offer.setText("an instructor of spring framework");
		if(offerDao.insert(offer))
			System.out.println("Object insertion succeeded");
		else
			System.out.println("Object insertion failed");
		
		offer = offerDao.getOffer("trudy");
		offer.setName("dykim");
		if(offerDao.update(offer))
			System.out.println("Object update succeeded");
		else
			System.out.println("Object insertion failed");
		
		offer = offerDao.getOffer("dykim");
		System.out.println(offer);
		if(offerDao.delete(offer.getId()))
			System.out.println("Object deletion succeeded");
		else
			System.out.println("Object deletion failed");
		
		context.close();
	}

}
