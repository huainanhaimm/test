package test;

import java.util.List;

import org.junit.Test;

import com.bookmanage.bean.BookBean;
import com.bookmanage.bean.UserBean;
import com.bookmanage.service.ILoginService;
import com.bookmanage.service.IShowBookService;
import com.bookmanage.service.impl.LoginServiceImpl;
import com.bookmanage.service.impl.ShowBookServiceImpl;

/**
 * ҵ��㵥Ԫ����
 * 
 * @author Administrator
 *
 */
public class ServiceCheck {
	// ��¼�������
	@Test
	public void test1() {
		ILoginService ils = new LoginServiceImpl();
		UserBean ub = new UserBean();
		ub.setUname("Сһ.");
		ub.setPass("yyy");
		boolean result = ils.login(ub);
		System.out.println(result);
	}

	// ͼ����������ҳ��������
	@Test
	public void test2() {
		IShowBookService ibs = new ShowBookServiceImpl();
		long result = ibs.tolPage();
		System.out.println(result);
	}

	// ͼ���б����
	@Test
	public void test3() {
		IShowBookService ibs = new ShowBookServiceImpl();
		 List<BookBean> result = ibs.paging(1);
		System.out.println(result.size());
	}
}
