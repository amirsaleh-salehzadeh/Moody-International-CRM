package mic.crm.common.auditor;

import java.util.ArrayList;

public class AuditorLST {

ArrayList<AuditorENT> auditorENTs = new ArrayList<AuditorENT>(); 
String keyword="";
String sort="";
int currentPage=0;
int totalPages=0;
int pageSize=10;
int totalItems=0;
int first=0;

public ArrayList<AuditorENT> getAuditorENTs() {
	return auditorENTs;
}
public void setAuditorENTs(ArrayList<AuditorENT> auditorENTs) {
	this.auditorENTs = auditorENTs;
}
public String getKeyword() {
	return keyword;
}
public void setKeyword(String keyword) {
	this.keyword = keyword;
}
public String getSort() {
	return sort;
}
public void setSort(String sort) {
	this.sort = sort;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getTotalPages() {
	return totalPages;
}
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalItems() {
	return totalItems;
}
public void setTotalItems(int totalItems) {
	this.totalItems = totalItems;
}
public int getFirst() {
	return first;
}
public void setFirst(int first) {
	this.first = first;
}

}
