package qna.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import qna.model.comVo;
import qna.model.qnaVo;

public class viewAction extends ActionSupport {
	
	private qnaVo paramClass;
	private qnaVo resultClass;
	private List<comVo> replyList = new ArrayList<comVo>();
	
	private int currentPage;
	
	private int qnaNO;
	private String qnaSubject;
	private String password;
	private String qnaContent;
	private String qnaOrgFile;
	private String qnaFileNm;
	private String comContents;
	
	Calendar today = Calendar.getInstance();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	

}
