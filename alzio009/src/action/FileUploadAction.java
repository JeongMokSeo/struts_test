package action;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	
	private static final String UploadPath = "D:/test/upload/";

	File saveFile;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (upload !=null && upload.exists()) {
			saveFile = new File(UploadPath + uploadFileName);
			FileUtils.copyFile(upload,saveFile);
		}
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
