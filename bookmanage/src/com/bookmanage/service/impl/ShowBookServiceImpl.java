package com.bookmanage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bookmanage.bean.BookBean;
import com.bookmanage.dao.IBookDao;
import com.bookmanage.dao.impl.BookDaoImpl;
import com.bookmanage.service.IShowBookService;

public class ShowBookServiceImpl implements IShowBookService {

	@Override
	public List<BookBean> paging(int current) {
		// ʵ�����־ò�
		IBookDao ibd = new BookDaoImpl();
		// �洢��ѯ���
		List<BookBean> list = null;
		//��ǰҳת��Ϊ�����±꣨0-5   6-11   12-17��
		int index = (current-1)*6;
		// ���ó־ò㷽����ȡ��ѯ���
		list = ibd.findSixById(index);
		return list;
	}

	@Override
	public Long tolPage() {
		// �洢��ҳ��,Ĭ��Ϊ1
		Long result = 1L;
		// ʵ�����־ò�
		IBookDao ibd = new BookDaoImpl();
		// ���ó־ò㷽����ȡ���ж�����ͼ����Ϣ
		Long num = ibd.findAll();
		// �������һҳ��������ҲΪһҳ����Ϊ����һҳ��
		if (num % 6 == 0) {
			result = num / 6;
		} else {
			result = (num / 6) + 1;
		}

		return result;
	}

}
