# design-patterns
设计模式
# 设计模式

- [<设计模式六大原则>](https://blog.csdn.net/q291611265/article/details/48465113)

- 开闭原则：对扩展开放,对修改关闭，多使用抽象类和接口。
- 里氏替换原则：基类可以被子类替换，使用抽象类继承,不使用具体类继承。
- 依赖倒转原则：要依赖于抽象,不要依赖于具体，针对接口编程,不针对实现编程。
- 接口隔离原则：使用多个隔离的接口,比使用单个接口好，建立最小的接口。
- 迪米特法则：一个软件实体应当尽可能少地与其他实体发生相互作用，通过中间类建立联系。
- 合成复用原则：尽量使用合成/聚合,而不是使用继承。

### 创建型模式
- 工厂模式：将类的实例化操作延迟到子类中完成，即由子类来决定究竟应该实例化（创建）哪一个类

![image](http://www.runoob.com/wp-content/uploads/2014/08/factory_pattern_uml_diagram.jpg)

- 抽象工厂模式(引入了网上图片)：提供了一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类

![image](https://github.com/iluwatar/java-design-patterns/blob/master/abstract-factory/etc/diagram1.png?raw=true)  

- 单例模式：确保在系统中某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
![image](https://img-blog.csdn.net/20160116152340758)

- 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
![image](http://my.csdn.net/uploads/201203/25/1332654150_2478.jpg)

- 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
![image](http://my.csdn.net/uploads/201203/26/1332722887_7899.jpg)

### 结构型模式
- 适配器模式: 将一个接口转换成客户希望的另一个接口，适配器模式使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
![image](http://upload-images.jianshu.io/upload_images/944365-24c6bf44da1b79ad.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- 桥接模式: 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
![image](https://img-blog.csdn.net/20160328190002031)

- 过滤器模式: 允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
![image](http://www.runoob.com/wp-content/uploads/2014/08/filter_pattern_uml_diagram.jpg)
         
- 组合模式: 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
![image](https://img-blog.csdn.net/20160329211240770)

- 装饰者模式: 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
![image](http://www.runoob.com/wp-content/uploads/2014/08/decorator_pattern_uml_diagram.jpg)

- 外观模式: 为复杂子系统提供一个一致的接口
![image](http://www.runoob.com/wp-content/uploads/2014/08/facade_pattern_uml_diagram.jpg)

- 享元模式: 通过运用共享技术有效地支持大量细粒度对象的复用
![image](http://www.runoob.com/wp-content/uploads/2014/08/flyweight_pattern_uml_diagram-1.jpg)

- 代理模式: 给某一个对象提供一个代理， 并由代理对象控制对原对象的引用
![image](http://www.runoob.com/wp-content/uploads/2014/08/proxy_pattern_uml_diagram.jpg)

### 行为型模式
- 责任链模式: 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求， 直到有对象处理它为止
![image](http://www.runoob.com/wp-content/uploads/2014/08/chain_pattern_uml_diagram.jpg)

- 命令模式：
- 解释器模式: 给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子。
![image](http://www.runoob.com/wp-content/uploads/2014/08/interpreter_pattern_uml_diagram.jpg)

- 迭代器模式: 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
![image](http://www.runoob.com/wp-content/uploads/2014/08/iterator_pattern_uml_diagram.jpg)

- 中介者模式: 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
![image](http://www.runoob.com/wp-content/uploads/2014/08/mediator_pattern_uml_diagram.jpg)

- 备忘录模式: 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
![image](http://www.runoob.com/wp-content/uploads/2014/08/memento_pattern_uml_diagram.jpg)

- 观察者模式: 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
![image](http://www.runoob.com/wp-content/uploads/2014/08/observer_pattern_uml_diagram.jpg)

- 状态模式: 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
![image](http://www.runoob.com/wp-content/uploads/2014/08/state_pattern_uml_diagram_1.png)

- 空对象模式:在空对象模式（Null Object Pattern）中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
![image](http://www.runoob.com/wp-content/uploads/2014/08/null_pattern_uml_diagram.jpg)

- 策略模式: 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
![image](http://www.runoob.com/wp-content/uploads/2014/08/strategy_pattern_uml_diagram.jpg)

- 模板模式: 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
![image](http://www.runoob.com/wp-content/uploads/2014/08/template_pattern_uml_diagram.jpg)
- 访问者模式: 主要将数据结构与数据操作分离
![image](http://www.runoob.com/wp-content/uploads/2014/08/visitor_pattern_uml_diagram.jpg)

### J2EE模式
- MVC模式
- 业务代表模式
- 组合实体模式
- 数据访问对象模式
- 前端控制器模式
- 拦截过滤器模式
- 服务定位器模式
- 传输对象模式
