package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadActionStream extends ActionSupport {
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private static final String UploadPath = "D:/test/upload/";
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("FileUploadActionStream");
		
		FileInputStream inputStream = new FileInputStream(upload);
		FileOutputStream outputStream = new FileOutputStream(UploadPath + getUploadFileName());
		int bytesRead = 0;
		byte[] buffer = new byte[1024];
		while((bytesRead = inputStream.read(buffer,0,1024)) != -1) {
			outputStream.write(buffer,0,bytesRead);;
		}
		outputStream.close();
		inputStream.close();
	
		return SUCCESS;
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
	public static String getUploadpath() {
		return UploadPath;
	}
	
	

}
