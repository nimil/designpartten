# designpartten
# 设计模式
## 1.软件设计基本原则：
1. 开闭原则  
继承了一个基类来实现对扩展开放，对修改关闭
2. 依赖倒置原则  
高层次的模块不应该依赖于低层次的模块
3. 单一职责原则  
不要存在多于一个导致类变更的原因
4. 接口隔离原则  
定义多个专门的接口，而不使用单一的总接口，一个类应该建立在最小的接口上，注意适度，一定要适度
5. 迪米特原则  
一个对象应该对其他对象保持最小的了解，尽量降低类与类之间的耦合，降低类之间的解耦  
6. 里式替换原则  
T1 O1 T2 O2 T1创建了o1 用T2替换T1时所有软件功能不受影响，父类可以被真正的复用，抽象化的具体步骤和规范  
子类可以扩展父类的功能，但不能改变分类原有的功能
7. 合成/聚合复用原则  
尽量使用对象组合/聚合，而不是继承关系来打到软件复用的目的 has-A和组合Contains-A

## 2.设计模式
### 0.简单工厂  
由一个工厂对象决定创建出哪一种类型的产品实例  
创建型，但是不属于23中设计模式之一 calendar 简单工厂
### 1.工厂方法  
定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
创建型  collection类  工厂方法。Iterator方法  urlStreamHandlerFactory  logFactory logback slf4j
### 2.抽象工厂
抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口  
数据库连接的Connection接口 返回的都属于同一个产品族
### 3.建造者
将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示  
用户只需要指定需要建造的类型就可以得到他们建造过程及细节不需要知道
StringBuilder append方法 
### 4.单例模式
保证一个类仅有一个实例，并提供一个全局访问点  
想确保任何情况下都绝对只有一个实例  
枚举类型的单例是实现单例模式的最佳实践  
JAD 反编译工具  
应用：  Runtime 类  Desktop 类   Spring的单例是基于容器的 变作用域中的一个  将实例设计在上下文中   
abstractFactoryBean  getObject  单例方法 spring中的
### 5.原型模式
指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象  
不需要知道任何创建的细节，不调用构造函数  
ArrayList copyof 方法  clone方法  HashMap也用到了clone方法
### 6.外观模式
提供一个统一的接口，用来访问子系统中的一群接口，外观模式定义了一个高层接口让子系统更容易使用
JdbcUtils  外观模式
### 7.装饰者模式
在不改变原有对象的基础之上，将功能附加到对象上  
装饰者模式的应用  Java IO中的类方法  ServerLet的应用  Lru Cache
### 8.适配器模式
一个类的接口转化成客户期望的另一个接口  
### 9.享元模式  
提供了减少对象数量从而改善应用所需的对象结构的方式  
Integer cache 享元模式 
### 10.组合模式
将对象组合成树形结构以表示“部分-整体”的层次结构
### 11.桥接模式
将抽象部分与他的具体实现部分分离，使它们都可以独立的变化,桥接模式不要忘记委托  
桥接模式 Java封装的 JDBC  Driver的实现类
### 12.代理模式
为其他对象提供一种代理，以控制这个对象的访问，代理对象在客户端和目标对象之间起到中介的作用  
CGLIB 不能代理使用final修饰符的类进行代理
Spring中的bean有实现接口时就会使用JDK的动态代理
当bean没有实现接口时Spring使用CGLIB
Spring中可以强制指定使用CGLIB  
lombok和CGLIB都是使用ASM字节码生成技术来进行生成字节码文件  
代理模式的典型应用： Spring的ProxyFactoryBean  getObject方法 Configuration getMapper方法代理
### 13.模板方法
定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现  
钩子方法 是这个模板对子类更进一层的扩展和开放  
应用：AbstractList  addAll 方法  get 方法  抽象的各种容器类 
### 14.迭代器模式
提供了一种方法，顺序访问一个集合的对象，不暴露内部表示
### 15.策略模式
定义了算法家族，分别封装起来，让他们可以互相替换，此模式让算法的变化不会影响到使用算法的用户  
应用 JDK  Comparator 接口 比较器 Spring AbstractResource 访问resource的策略行为 
### 16.解释器模式  
将已经定义好的语言编译为可执行语言的过程称为解释器模式  
JavaUtil parttern 通过正则解释器将正则表达式解释出来 SpringSpel
### 17.观察者模式
定义了对象之间的一对多的依赖，让多个观察者对象同事监听某一个主题对象，当主题对象发生变化时，他的  
所有依赖者都会受到通知，并更新。关联行为场景，建立一套触发机制  
Spring的Listener EventListener是监听器的核心  Guava中有对于观察者模式的封装 注解@Sucrible  
Guava EventBus  
### 18.备忘录模式
保存一个对象的额某个状态，以便在适当的时候恢复对象。回退状态使用stack保存。  
备忘录模式的应用：Spring的webflow的实现 工作流的实现
### 19.命令模式
将请求封装成对象，一遍使用不同的请求  
应用：Runable 命令模式 
### 20.中介者模式
定义一个封装一组对象如何交互的对象 将一对多转化成一对一  
应用：Java.Util.timer 计时
### 21.责任链模式
为请求创建一个接受此次请求对象的链  
责任链可以动态组合，责任链太长或者处理时间太长会影响性能  
应用：Javax.servlet.Filter类用到了责任链模式 SpringSecurity 里边也有责任链模式
### 22.访问者模式 
封装作用域某数据结构中的各元素的操作
可以在不改变各元素的类的前提下，定义作用域这些元素的操作  
数据结构与数据操作分离  应用：FileVistor Spring的BeanDefinition
### 23.状态模式 
允许一个对象在其内部状态改变时，改变它的行为
