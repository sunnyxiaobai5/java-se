package sunny_xiaobai5.client;

import sunny_xiaobai5.model.ConcreteProduct1;
import sunny_xiaobai5.model.ConcreteProduct2;
import sunny_xiaobai5.model.Product;
import sunny_xiaobai5.util.AbstractProductFactory;
import sunny_xiaobai5.util.ConcreteProductFactory1;

public class Client {
	public static void main(String[] args) {
		// ����һ������ Product ����Ĺ���
		AbstractProductFactory factory = new ConcreteProductFactory1();

		// �򹤳�����һ��ConcreteProduct1���͵Ĳ�Ʒ pro1 ��ʹ���书��
		Product pro1 = factory.createProduct(ConcreteProduct1.class);
		pro1.method1();
		pro1.method2();

		// �򹤳�����һ��ConcreteProduct2���͵Ĳ�Ʒ pro2 ��ʹ���书��
		Product pro2 = factory.createProduct(ConcreteProduct2.class);

		pro2.method1();
		pro2.method2();
	}
}
