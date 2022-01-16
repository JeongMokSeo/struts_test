package qna.action;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import qna.dao.QnaDAO;
import qna.model.qnaVo;
import user.model.userVo;

public class modifyAction extends ActionSupport {
	
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
	
	private qnaVo paramClass;
	private qnaVo resultClass;
	
	
	
	
	
	@Override
	public String execute() throws Exception {
		
		resultClass = new qnaVo();
		Map session = ActionContext.getContext().getSession();
		userVo user = (userVo)session.get("user");
		resultClass = QnaDAO.qnaSelectOne(qnaNo);
		resultClass.setQnaSubject(qnaSubject);
		resultClass.setPassword(password);
		resultClass.setQnaContent(qnaContent);
		
		QnaDAO.qnaUpdate(resultClass);
		
		if (getUpload() != null) {

			String file_name = "qnaBoard_" + resultClass.getQnaNo();
			String file_ext = getUploadFileName().substring(getUploadFileName().lastIndexOf(".")+1,getUploadFileName().length() );
			
			File destFile = new File(fileUploadPath + file_name + "." + file_ext);
			FileUtils.copyFile(getUpload(), destFile);
			
			resultClass.setQnaNo(resultClass.getQnaNo());
			resultClass.setQnaOrgFile(getUploadFileName());
			resultClass.setQnaFileNm( file_name + "." + file_ext);
			QnaDAO.qnaUpdateFile(resultClass);
			
		}	
		return SUCCESS;
	}

	public String form() throws Exception {
		
		resultClass = new qnaVo();
		Map session = ActionContext.getContext().getSession();
		userVo user = (userVo)session.get("user");
		resultClass = QnaDAO.qnaSelectOne(qnaNo);		
		return SUCCESS;
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
	
	

}
