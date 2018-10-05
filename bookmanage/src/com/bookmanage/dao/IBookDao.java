package com.bookmanage.dao;

import java.util.List;

import com.bookmanage.bean.BookBean;

public interface IBookDao {
	/**
	 * ��ѯ���е�ͼ����Ϣ
	 * @return List �������в�ѯ���
	 */
	public Long findAll();

	/**
	 * ��ѯ����ͼ����Ϣ
	 * @param index ÿҳ��ʼ��ͼ����±�
	 * @return List ��ѯ��������ͼ����Ϣ
	 */
	public List<BookBean> findSixById(int index);

}
