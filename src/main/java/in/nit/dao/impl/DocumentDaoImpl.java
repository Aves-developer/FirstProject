package in.nit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import in.nit.dao.IDocumentDao;
import in.nit.model.Document;

public class DocumentDaoImpl implements IDocumentDao {
    @Autowired
	private HibernateTemplate ht;
	public Integer saveDocument(Document doc) {
	
		return (Integer) ht.save(doc);
	}

}
