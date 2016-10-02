package sunny_xiaobai5.client;

import sunny_xiaobai5.model.ConcreteProduct1;
import sunny_xiaobai5.model.ConcreteProduct2;
import sunny_xiaobai5.model.Product;
import sunny_xiaobai5.util.AbstractProductFactory;
import sunny_xiaobai5.util.ConcreteProductFactory1;

public class Client {
	public static void main(String[] args) {
		// 创建一个生产 Product 对象的工厂
		AbstractProductFactory factory = new ConcreteProductFactory1();

		// 向工厂索求一个ConcreteProduct1类型的产品 pro1 并使用其功能
		Product pro1 = factory.createProduct(ConcreteProduct1.class);
		pro1.method1();
		pro1.method2();

		// 向工厂索求一个ConcreteProduct2类型的产品 pro2 并使用其功能
		Product pro2 = factory.createProduct(ConcreteProduct2.class);

		pro2.method1();
		pro2.method2();
	}
}
