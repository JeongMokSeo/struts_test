package action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FileExtractAction extends ActionSupport {
	private static final String BasePath = "D:/test/upload";
	private List<File> listFile = new ArrayList<File>();
	private String basePath;
	
	@Override
	public String execute() throws Exception {
		basePath = BasePath;
		File dir = new File(basePath);
		File[] files = dir.listFiles();
		
		System.out.println("files.length:" + files.length);
		if(files != null) {
			for (File f: files) {
				if (f.isFile()) {
					System.out.println(f.getName());
					listFile.add(f);
				}
			}
		}
		
		System.out.println("listFile.size():"+listFile.size());
		return SUCCESS;
	}
	
	
	public List<File> getListFile() {
		return listFile;
	}
	public void setListFile(List<File> listFile) {
		this.listFile = listFile;
	}
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public static String getBasepath() {
		return BasePath;
	}
	

}
