package mic.crm.common.customer;

import java.util.ArrayList;

public class CustomerLST {

ArrayList<CustomerENT> customerENTs = new ArrayList<CustomerENT>(); 
String keyword="";
String sort="";
int currentPage=0;
int totalPages=0;
int pageSize=10;
int totalItems=0;
int first=0;
public ArrayList<CustomerENT> getCustomerENTs() {
	return customerENTs;
}
public void setCustomerENTs(ArrayList<CustomerENT> customerENTs) {
	this.customerENTs = customerENTs;
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
