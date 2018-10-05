package com.bookmanage.service.impl;

import com.bookmanage.bean.UserBean;
import com.bookmanage.dao.ILoginDao;
import com.bookmanage.dao.impl.LoginDaoImpl;
import com.bookmanage.service.ILoginService;

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean login(UserBean ub) {
		// ���ص�¼���,Ĭ�ϵ�¼ʧ��
		boolean result = false;
		// ���ü��ҳ���ϴ��û����ݸ�ʽ�Ƿ���ȷ
		boolean isFormat = checkUser(ub);

		// ��ʽ���ɹ�������dao�����findNameAndPass()�����������ݿ��ѯ,��ȡ��ѯ���
		if (isFormat == true) {
			ILoginDao ild = new LoginDaoImpl();
			UserBean userbean = ild.findNameAndPass(ub);
			// ���ݿ�����û�����������ڣ���½�ɹ�
			if (userbean.getUname().equals(ub.getUname()) && userbean.getPass().equals(ub.getPass())) {
				// ��¼�ɹ�����true
				result = true;
			}
		}
		return result;
	}

	@Override
	public boolean register(UserBean ub) {

		return false;
	}

	@Override
	public boolean checkUser(UserBean ub) {
		// ���ظ�ʽ�����,Ĭ�ϸ�ʽ���Ϸ�
		boolean result = false;

		if (ub != null) {
			// �û������
			if (ub.getUname() != null && ub.getUname() != "" && ub.getUname().length() < 10) {
				// �û�����ʽ��ȷ��������������ʽ
				if (ub.getPass() != null && ub.getPass() != "" && ub.getPass().length() < 10) {
					// �����ʽҲ��ȷ���Ϸ�
					result = true;
				}
			}
		}
		return result;
	}

}
