package in.nit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import in.nit.dao.IDocumentDao;
import in.nit.model.Document;
import in.nit.service.IDocumentService;

public class DocumentServiceImpl implements IDocumentService{
 
	@Autowired
	private IDocumentDao dao;
	@Override
	public Integer saveDocument(Document doc) {
		
		return dao.saveDocument(doc);
	}
	

}
