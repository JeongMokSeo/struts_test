package action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class ListtypeUploadAction extends ActionSupport {

	private List<File> uploads = new ArrayList<File>();
	private List<String> uploadsFileName = new ArrayList<String>();
	private List<String> uploadsContentType = new ArrayList<String>();
	
	private static final String UploadPath = "D:/test/upload/";
	
	File sFile;
	
	

	@Override
	public String execute() throws Exception {
		for (int i=0; i < uploads.size(); i++) {
			File destFile = new File(UploadPath + getUploadsFileName().get(i));
			FileUtils.copyFile(getUploads().get(i),destFile);
		}
		return SUCCESS;
	}

	public List<File> getUploads() {
		return uploads;
	}

	public void setUploads(List<File> uploads) {
		this.uploads = uploads;
	}

	public List<String> getUploadsFileName() {
		return uploadsFileName;
	}

	public void setUploadsFileName(List<String> uploadsFileName) {
		this.uploadsFileName = uploadsFileName;
	}

	public List<String> getUploadsContentType() {
		return uploadsContentType;
	}

	public void setUploadsContentType(List<String> uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}

	public static String getUploadpath() {
		return UploadPath;
	}	
	
	
	
}
