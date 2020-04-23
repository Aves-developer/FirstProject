
package in.nit.pdfview; 
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.ShipmentType;


@Controller
public  class ShipmentTypePdfView extends AbstractPdfView {

	@SuppressWarnings("unchecked")
	protected void buildPdfDocument(Map<String, Object> model, Document document,
			PdfWriter writer, HttpServletRequest request, 
			HttpServletResponse response)
					throws Exception {

		response.addHeader("Content-Disposition",
				"atatchment;filename=Shipment.pdf");

		Paragraph p=new Paragraph("Welcome to shipment Type");

		document.add(p);

		List<ShipmentType> list=(List<ShipmentType>) model.get("list");

		PdfPTable t=new PdfPTable(6);

		t.addCell("ID");
		t.addCell("MODE");
		t.addCell("CODE");
		t.addCell("ENABLE");
		t.addCell("GRAD");
		t.addCell("NOTE");

		//adding data to table
		for(ShipmentType st:list) {

			t.addCell(st.getShipId().toString());
			t.addCell(st.getShipMode());
			t.addCell(st.getShipCode()); 
			t.addCell(st.getEnbShip());
			t.addCell(st.getShipGrad()); 
			t.addCell(st.getShipDesc());	  
		}

		//add table to document
		document.add(t);
		//print date and time
		document.add(new Paragraph(new Date().toString()));


	}

}
