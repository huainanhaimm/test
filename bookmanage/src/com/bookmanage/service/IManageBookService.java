package com.bookmanage.service;

import com.bookmanage.bean.BookBean;

public interface IManageBookService {
	/**
	 * ����ͼ��¼�빦��
	 * @param bb Ҫ��ӵ�ͼ�����
	 * @return ����bolean��ʾ¼����
	 */
	public boolean addBook(BookBean bb);
	/**
	 * ����ͼ��idɾ����Ӧͼ��
	 * @param bid ͼ��id
	 * @return ����boolean ��ʾɾ�����
	 */
	public boolean del(int bid);
	
	/**
	 * �����޸�ͼ����Ϣ���۸񣬳����磬������Ϣ��
	 * @param bid ͼ��id
	 * @return boolean �޸Ľ��
	 */
	public boolean fix(int bid);

}
