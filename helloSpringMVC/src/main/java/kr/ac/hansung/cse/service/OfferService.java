package kr.ac.hansung.cse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.cse.dao.OfferDao;
import kr.ac.hansung.cse.model.Offer;

@Service
public class OfferService {
	
	@Autowired
	private OfferDao offerDao;
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}
	
	public void insert(Offer offer) {
		offerDao.insert(offer);
	}

}
