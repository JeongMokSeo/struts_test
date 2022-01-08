package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	
	private String basePath;
	private String fileName;
	private String contentType;
	private String contentDisposition;
	private InputStream inputStream;
	private long contentLength;
	
	@Override
	public String execute() throws Exception {

		String inputPath = basePath + "/" + fileName;
		File f = new File(inputPath);
		inputStream = new FileInputStream(inputPath);
		setContentLength(f.length());
		setContentDisposition("attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
		
		return SUCCESS;
	}
	
	
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentDisposition() {
		return contentDisposition;
	}
	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public long getContentLength() {
		return contentLength;
	}
	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}
	
	

}
