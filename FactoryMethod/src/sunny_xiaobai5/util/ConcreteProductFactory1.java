package sunny_xiaobai5.util;

import sunny_xiaobai5.model.Product;

// 工厂实现类1
public class ConcreteProductFactory1 extends AbstractProductFactory {

	@Override
	public Product createProduct(Class<? extends Product> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("产生 Product 类失败");
		}
		return product;
	}
}
