package com.bookmanage.service;

import java.util.List;

import com.bookmanage.bean.BookBean;



public interface IShowBookService {
		
	/**
	 * �����ҳչʾͼ���ҵ�񣬸��ݵ�ǰҳ��ѯ��ҹӦչʾ������ͼ��(6��)
	 * @param current ��ǰҳ��
	 * @return  ��ѯ����ͼ������
	 */
	public List<BookBean> paging(int current);
	
	/**
	 * ͳ�����ݿ��е�ͼ�鹲����ҳ����������һҳ��
	 * @return ��ҳ��
	 */
	public Long tolPage();
	
}
