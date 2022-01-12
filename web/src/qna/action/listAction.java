package qna.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import qna.dao.QnaDAO;
import qna.model.qnaVo;

public class listAction extends ActionSupport {
	
	private int currentPage = 1;
	private int totalCount;
	private int blockCount = 10;
	private int blockPage = 5;
	private String pagingHtml;
	private pagingAction page;
	
	
	private List<qnaVo> list = new ArrayList<qnaVo>();


	@Override
	public String execute() throws Exception {
		list = QnaDAO.qnaSelectAll();
		if (list == null) return SUCCESS;
		
		totalCount = list.size();
		page = new pagingAction(currentPage, totalCount, blockCount, blockPage);
		pagingHtml = page.getPagingHtml().toString();
		int lastCount = totalCount;
		if (page.getEndCount() < totalCount) {
			lastCount = page.getEndCount() + 1;
		}
		list = list.subList(page.getStartCount(), lastCount);
		
		return SUCCESS;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public int getBlockCount() {
		return blockCount;
	}


	public void setBlockCount(int blockCount) {
		this.blockCount = blockCount;
	}


	public int getBlockPage() {
		return blockPage;
	}


	public void setBlockPage(int blockPage) {
		this.blockPage = blockPage;
	}


	public String getPagingHtml() {
		return pagingHtml;
	}


	public void setPagingHtml(String pagingHtml) {
		this.pagingHtml = pagingHtml;
	}


	public pagingAction getPage() {
		return page;
	}


	public void setPage(pagingAction page) {
		this.page = page;
	}


	public List<qnaVo> getList() {
		return list;
	}


	public void setList(List<qnaVo> list) {
		this.list = list;
	}
	
	
	
	
	

}
