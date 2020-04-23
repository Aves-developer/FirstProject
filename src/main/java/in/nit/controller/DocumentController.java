/*
 * package in.nit.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * 
 * 
 * import in.nit.service.IDocumentService;
 * 
 * @RequestMapping("/docs") public class DocumentController {
 * 
 * @Autowired private IDocumentService service;
 * 
 * @RequestMapping("/show") public String showDocument() { return "Document";
 * 
 * 
 * }
 * 
 * @RequestMapping(value="/upload", method=RequestMethod.POST) public String
 * doUpload(@RequestParam Integer id,
 * 
 * @RequestParam CommonsMultipartFile fileOb, Model model) { if(fileOb!=null) {
 * Document d=new Document(); //d.getFileId(fileId);
 * d.setFileName(fileOb.getOriginalFilename());
 * d.setFileData(fileOb.getBytes()); service.saveDocument(d); String
 * msg="file is Successfully uploaded"; model.addAttribute("message", msg);
 * 
 * }
 * 
 * return "Document";
 * 
 * } }
 */