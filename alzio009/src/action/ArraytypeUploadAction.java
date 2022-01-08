package action;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class ArraytypeUploadAction extends ActionSupport {
	
	private File[] uploads;
	private String[] uploadsFileName;
	private String[] uploadsContentType;
	
	private static final String UploadPath = "D:/test/upload/";

	File sFile;
	
	@Override
	public String execute() throws Exception {
		System.out.println("=====ArraytypeUploadAction================");		
		
		for (int i=0; i < uploads.length; i++) {
			File destFile = new File(UploadPath + getUploadsFileName()[i]);
			FileUtils.copyFile(getUploads()[i],destFile);
		}
		return SUCCESS;		
	}

	public File[] getUploads() {
		return uploads;
	}

	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}

	public String[] getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(String[] uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}

	public String[] getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	public static String getUploadpath() {
		return UploadPath;
	}
	
	

}
