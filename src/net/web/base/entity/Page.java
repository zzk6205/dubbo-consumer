package net.web.base.entity;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {

	private static final long serialVersionUID = 1L;
	private int pageSize = 10;
	private int pageNumber = 1;
	private int total;
	private int totalPage;
	private List<?> rows;

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageNumber() {
		if (this.pageNumber <= 0)
			this.pageNumber = 1;
		if ((getTotalPage() != 0) && (this.pageNumber > getTotalPage()))
			this.pageNumber = getTotalPage();
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getTotalPage() {
		if (this.total % this.pageSize == 0)
			this.totalPage = (this.total / this.pageSize);
		else
			this.totalPage = (this.total / this.pageSize + 1);
		return this.totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}