package com.bookmanage.dao;

import com.bookmanage.bean.UserBean;

public interface ILoginDao {
	
	/**
	 * ͨ����������������û���Ϣ
	 * @param ub �û���Ϣ
	 * @return ���ز�ѯ�����û���Ϣ
	 */
	public UserBean findNameAndPass(UserBean ub);
	
	/**
	 * �����ݿ�����û���Ϣ
	 * @param ub �û���Ϣ
	 * @return Ӱ������
	 */
	public int  insertUserBean(UserBean ub);
		
}
