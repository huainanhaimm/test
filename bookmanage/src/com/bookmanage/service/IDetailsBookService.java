package com.bookmanage.service;

import com.bookmanage.bean.BookBean;

public interface IDetailsBookService {
	
	/**
	 * ��������������id
	 * @param bname ����
	 * @return ���ز�ѯ���Ķ�Ӧ���id
	 */
	public boolean findByName(String bname);
	
	/**
	 * չʾͼ����ϸ��Ϣ
	 * @param bid
	 * @return
	 */
	public  BookBean  showDetails(int bid);

}
