package com.bookmanage.service;

import com.bookmanage.bean.UserBean;

public interface ILoginService {
	/**
	 * �����¼ҵ�� 
	 * @param ub �û�����
	 * @return
	 */
	public boolean  login(UserBean ub);
	/**
	 *���� ע��ҵ�� 
	 * @param ub
	 * @return
	 */
	public boolean register(UserBean ub);
	
	/**
	 * ����û�������������ݸ�ʽ
	 * @param ub
	 * @return
	 */
	public boolean checkUser(UserBean ub); 

}
