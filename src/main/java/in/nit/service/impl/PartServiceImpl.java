package in.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nit.dao.IPartDao;
import in.nit.model.Part;
import in.nit.service.IPartService;

@Service
public class PartServiceImpl implements IPartService {

	@Autowired
	private IPartDao dao;
	 
	@Transactional
	public Integer savePart(Part p) {
		
		return dao.savePart(p);
	}

	@Transactional(readOnly=true)
	public List<Part> getAllPart() {
		List<Part>list=dao.getAllPart();
		Collections.sort(list,(p1,p2)->{
			return p1.getId()-p2.getId();
		});
		
		return list;
	}

	@Transactional
	public void deletePart(Integer id) {
		dao.deletePart(id);
		
	}
	@Transactional(readOnly=true)
	public Part getOnePart(Integer id) {
		
		return dao.getOnePart(id);
	}

	@Transactional
	public void updatePart(Part p) {
		
		dao.updatePart(p);
		
	}
	

}
