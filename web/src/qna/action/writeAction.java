package qna.action;

import java.io.File;
import java.io.Reader;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import qna.dao.QnaDAO;
import qna.model.qnaVo;
import user.model.userVo;

public class writeAction extends ActionSupport {
	
	public String form() throws Exception {
		return SUCCESS;
	}
	
	public static Reader reader;
	private qnaVo paramClass;
	private qnaVo resultClass;
	
	private int currentPage;
	
	private int qnaNo;
	private String qnaSubject;
	private String password;
	private String qnaContent;
	private String qnaOrgFile;
	private String qnaFileNm;
	
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String fileUploadPath ="d:/test/upload/qna/";
	

	@Override
	public String execute() throws Exception {
		
		paramClass = new qnaVo();
		resultClass = new qnaVo();
		
		Map session = ActionContext.getContext().getSession();
		userVo  user = (userVo)session.get("user");
		
		paramClass.setId(user.getId());
		paramClass.setQnaSubject(qnaSubject);
		paramClass.setPassword(password);
		paramClass.setQnaContent(qnaContent);
		
		QnaDAO.qnaInsert(paramClass);
		
		if (getUpload() != null) {
			resultClass = (qnaVo)QnaDAO.qnaLastNo();
			String file_name = "qnaBoard_" + resultClass.getQnaNo();
			String file_ext = getUploadFileName().substring(getUploadFileName().lastIndexOf(".")+1,getUploadFileName().length() );
			
			File destFile = new File(fileUploadPath + file_name + "." + file_ext);
			FileUtils.copyFile(getUpload(), destFile);
			
			paramClass.setQnaNo(resultClass.getQnaNo());
			paramClass.setQnaOrgFile(getUploadFileName());
			paramClass.setQnaFileNm( file_name + "." + file_ext);
			QnaDAO.qnaUpdateFile(paramClass);
		}
		
		return SUCCESS;
	}


	public static Reader getReader() {
		return reader;
	}


	public static void setReader(Reader reader) {
		writeAction.reader = reader;
	}


	public qnaVo getParamClass() {
		return paramClass;
	}


	public void setParamClass(qnaVo paramClass) {
		this.paramClass = paramClass;
	}


	public qnaVo getResultClass() {
		return resultClass;
	}


	public void setResultClass(qnaVo resultClass) {
		this.resultClass = resultClass;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getQnaNo() {
		return qnaNo;
	}


	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}


	public String getQnaSubject() {
		return qnaSubject;
	}


	public void setQnaSubject(String qnaSubject) {
		this.qnaSubject = qnaSubject;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getQnaContent() {
		return qnaContent;
	}


	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}


	public String getQnaOrgFile() {
		return qnaOrgFile;
	}


	public void setQnaOrgFile(String qnaOrgFile) {
		this.qnaOrgFile = qnaOrgFile;
	}


	public String getQnaFileNm() {
		return qnaFileNm;
	}


	public void setQnaFileNm(String qnaFileNm) {
		this.qnaFileNm = qnaFileNm;
	}


	public File getUpload() {
		return upload;
	}


	public void setUpload(File upload) {
		this.upload = upload;
	}


	public String getUploadContentType() {
		return uploadContentType;
	}


	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}


	public String getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public String getFileUploadPath() {
		return fileUploadPath;
	}


	public void setFileUploadPath(String fileUploadPath) {
		this.fileUploadPath = fileUploadPath;
	}
	
	

}
