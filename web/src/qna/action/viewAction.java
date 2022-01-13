package qna.action;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import qna.dao.QnaDAO;
import qna.model.comVo;
import qna.model.qnaVo;
import user.model.userVo;

public class viewAction extends ActionSupport {
	
	private qnaVo paramClass;
	private qnaVo resultClass;
	private List<comVo> replyList = new ArrayList<comVo>();
	
	private int currentPage;
	
	private int qnaNo;
	private String qnaSubject;
	private String password;
	private String qnaContent;
	private String qnaOrgFile;
	private String qnaFileNm;
	private String comContents;
	
	private File uplaod;
	private String uploadContentType;
	private String uploadFileName;
	private String uploadPath = "d:\\test\\upload\\qna\\";
	private InputStream inputStream;
	private String contentDisposition;
	private long contentLength;
	
	Calendar today = Calendar.getInstance();

	@Override
	public String execute() throws Exception {
		
		Map session = ActionContext.getContext().getSession();
		userVo user = (userVo)session.get("user");
		resultClass = QnaDAO.qnaSelectOne(getQnaNo());
		replyList = QnaDAO.qnaReplyList(resultClass);
		QnaDAO.qnaUpdateReadHit(getQnaNo());
		
		return "success";
	}
	
	public String replyWrite() throws Exception {
		
		Map session = ActionContext.getContext().getSession();
		userVo user = (userVo)session.get("user");
		
		comVo comvo = new comVo();
		comvo.setBoardNm("QNA");
		comvo.setBoardNo(qnaNo);
		comvo.setComContents(comContents);
		comvo.setId(user.getId());
		
		QnaDAO.qnaReplyInsert(comvo);		
		return SUCCESS;
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

	public List<comVo> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<comVo> replyList) {
		this.replyList = replyList;
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

	public String getComContents() {
		return comContents;
	}

	public void setComContents(String comContents) {
		this.comContents = comContents;
	}

	public File getUplaod() {
		return uplaod;
	}

	public void setUplaod(File uplaod) {
		this.uplaod = uplaod;
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

	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public Calendar getToday() {
		return today;
	}

	public void setToday(Calendar today) {
		this.today = today;
	}
	

}
