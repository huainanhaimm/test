package com.bookmanage.service;

import com.bookmanage.bean.BookBean;

public interface IBorrowBook {
	/**
	 * �������ҵ��
	 * @param bid  ���id
 	 * @return  ������
	 */
	public boolean borrow(int bid); 
	
	/**
	 * �����û���ѯ�����������ҵ��
	 * @param uid �û�id
	 * @return ���ؽ�������
	 */
	public BookBean query(int uid);

}
