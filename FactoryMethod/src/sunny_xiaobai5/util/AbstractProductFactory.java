package sunny_xiaobai5.util;

import sunny_xiaobai5.model.Product;

// 抽象工厂类
public abstract class AbstractProductFactory {
	//1.限定参数为 Class 类型		2.限定参数必须为 Product 的实现类
	public abstract Product createProduct(Class<? extends Product> c);
}
