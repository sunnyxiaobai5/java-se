package sunny_xiaobai5.util;

import sunny_xiaobai5.model.Product;

// ���󹤳���
public abstract class AbstractProductFactory {
	//1.�޶�����Ϊ Class ����		2.�޶���������Ϊ Product ��ʵ����
	public abstract Product createProduct(Class<? extends Product> c);
}
