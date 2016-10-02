/**
 * 二次分发实例
 * 1.构建父级抽象类 Driver,Vehicle
 * 2.构建 Driver 的子类 MaleDriver,FemaleDriver 和 Vehicle的子类 Bus,Car
 *
 * 二次分发实现原理
 * 为了实现程序最终输出时是具体的两个类而不是该两个类的父类，并且在本类中不使用函数重载
 * 需要在第一个类生成的对象中通过函数调用另外一个类对象的函数。
 * 在第一个类对象的函数调用时，第一次选择（对象由父类引用指向，却是该父类的子类实现的，子类中的相同函数体是不一样的）
 * 在第一个类对象的函数调用另外一个类对象的函数时，第二次选择，选择得根据对象本质来选择，所以传入一个参数，其参数类型
 * 是第二个类对象的引用，其引用也是父级的，通过该引用调用对应的处理函数，在调用时再次通过对象本质调用相应函数。
 */

package seconddispatch;

public class Main {
    public static void main(String[] args) {
        Driver a=new FemaleDriver();
        Driver b=new MaleDriver();
        Vehicle x=new Car();
        Vehicle y=new Bus();

        //第一次选择：a是父类的引用，在调用drives方法时根据 a 的构造函数确定drives方法的来源
        //若 a 是MaleDriver对象，则调用MaleDriver中的drives方法，若a是FemaleDriver对象，则调用FemaleDriver中的drives方法。
        //第二次选择：在drives函数中调用 x 对象的处理方法，由于x也是父类的引用，在调用其方法时根据 x 的构造函数确定所调用
        //方法的来源
        //若 x 是Bus对象，则调用Bus中的处理方法，若 x 是Car对象，则调用Car中的处理方法。
        //更深层的处理：为了能在最终信息中处理一些关于 a 的信息，需要传入a对象，drives函数在调用x对象的方法时传入了this
        //即 a 对象，由此能够在x中获取 a 对象的信息并进行处理。

        a.drives(x);
        b.drives(y);
    }

}
