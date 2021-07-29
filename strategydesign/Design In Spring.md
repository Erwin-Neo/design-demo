### Spring 设计模式 Summary

#### 1. 简单工厂

##### 案例  BeanFactory

​		`org.springframework.beans.factory.BeanFactory `

​		简单工厂模式的体现，根据传入一个唯一的标识来获得Bean对象，但是否是在传入参数后创建还是传入参数前创建这个要根据具体情况来定

##### 本质

​		由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类

##### 原理 

###### bean容器的启动阶段

​		**Step1** 读取 `Bean` 配置, 将 `Bean` 元素转换成 `BeanDefinition` 对象

​		**Step2** 通过 `BeanDefinitionRegistry` 将这些bean注册到  `beanFactory` 中，保存在它的一个 `ConcurrentHashMap` 中

​		**Step3** 将 `BeanDefinition` 注册到了 `beanFactory` 之后，在这里  Spring 为我们提供了 **一个扩展的切口**, 允许我们 **通过实现接口** 

`BeanFactoryPostProcessor` 在此处来插入我们定义的代码

​		**Tips** `PropertyPlaceholderConfigurer`，我们一般在配置数据库的dataSource时使用到的占位符的值，就是它注入进去的

###### **容器中bean的实例化阶段**

​		实例化阶段主要是通过 **反射** 或者 **CGLIB** 对bean进行实例化，在这个阶段Spring又给我们暴露了很多的扩展点

​		**各种的Aware接口**，比如 `BeanFactoryAware`，对于实现了 这些Aware接口的bean，在实例化bean时Spring会帮我们注入对应的BeanFactory的实例		

​		**BeanPostProcessor接口**，实现了 `BeanPostProcessor ` 接口的bean，在实例化bean时Spring会帮我们调用接口中的方法。

​		**InitializingBean接口**，实现了 `InitializingBean` 接口的 bean，在实例化bean时Spring会帮我们调用接口中的方法。 

​		**DisposableBean接口**，实现了 `BeanPostProcessor`  接口的 `bean`，在该bean死亡时Spring会帮我们调用接口中的方法。

##### 意义

​		**松耦合。**可以将原来硬编码的依赖，通过Spring这个beanFactory这个工厂来注入依赖，也就是说原来只有依赖方和被依赖方，现在我们引入了第三方——spring这个beanFactory，由它来解决bean之间的依赖问题，达到了松耦合的效果

​		**bean的额外处理。**通过Spring接口的暴露，在实例化bean的阶段我们 可以进行一些额外的处理，这些额外的处理只需要让bean实现对应的接口即可，那么spring就会在 **bean的生命周期** 调用我们实现的接口来处理该bean

#### 2. 工厂方法

##### 案例 FactoryBean

##### 原理

​		实现了 `FactoryBean` 接口的bean是一类叫做 `factory的bean` 。其特点是，spring会在使用getBean()调用获得该bean时，会自动调用该 bean的 `getObject()` 方法，所以返回的不是factory这个bean，而是这个bean.getOjbect()方法的返回值

##### 场景

##### 		<img src="img/Untitled/image-20210729142549568.png" alt="image-20210729142549568" style="zoom: 67%;" />

​				因为实现了FactoryBean接口, 所以返回的不是 `SqlSessionFactoryBean` 的实例, 而是它的 `SqlSessionFactoryBean.getObject() `的返回值

#### 3. 单例模式

​		Spring依赖注入Bean实例默认是单例的

​		Spring的依赖注入（包括lazy-init方式）都是发生在  `AbstractBeanFactory#getBean()` `getBean#doGetBean()` 方法调用 getSingleton进行bean的创建

​		`org.springframework.beans.factory.support.DefaultSingletonBeanRegistry`

​		**getSingleton()过程图** 

​										![image-20210729143808929](img/Untitled/image-20210729143808929.png)

​		保证一个类仅有一个实例，并提供一个访问它的全局访问点

#### 4. 适配器模式

##### 案例 HandlerAdatper

​		SpringMVC中的适配器HandlerAdatper

##### 原理

​		HandlerAdatper根据Handler规则执行不同的Handler

##### 过程

​		DispatcherServlet根据HandlerMapping返回的handler，向HandlerAdatper发起请求，处理Handler。 

​		HandlerAdapter 根据规则找到对应的Handler并让其执行，执行完毕后 Handler 会向 HandlerAdapter 返回一个 ModelAndView，最后由 HandlerAdapter 向 DispatchServelet 返回一个 ModelAndView

##### 意义

​		HandlerAdatper使得Handler的扩展变得容易，只需要增加一个新的 Handler和一个对应的HandlerAdapter即可。因此Spring定义了一个适配接口，使得每一种Controller有一种对应的适配器实现类，让适配器代替controller执行相应的方法。这样在扩展 Controller时，只需要增加一个适配器类就完成了SpringMVC的扩展了

#### 5. 装饰器模式

##### 案例  Wrapper Decorator

​		Spring中用到的包装器模式在类名上有两种表现：一种是类名中含有 Wrapper，另一种是类名中含有Decorator。 

##### 本质

​		动态地给一个对象添加一些额外的职责。 就增加功能来说，Decorator模式相比生成子类更为灵活

#### 6. 代理模式

##### 	原理

​		切面在应用运行的时刻被织入。一般情况下，在织入切面时，AOP容器会为目标对象创建动态的创建一个代理对象。SpringAOP就是以这种 方式织入切面的。 织入：把切面应用到目标对象并创建新的代理对象的过程。

​		AOP底层，就是动态代理模式的实现: 动态代理 和 静态代理

​		在内存中构建的，不需要手动编写代理类 | 需要手工编写代理类，代理类引用被代理对象。

#### 7. 观察者模式

​		spring的事件驱动模型使用的是 观察者模式 ，Spring中Observer模式 常用的地方是listener的实现

##### 实现

​		事件机制的实现需要三个部分,事件源,事件,事件监听器

​		**ApplicationEvent抽象类[事件]**   继承自jdk的EventObject,所有的事件都需要继承ApplicationEvent,并且通过构造器参数source得到事件源

​		该类的实现类ApplicationContextEvent表示ApplicaitonContext的容器事件.

​		**ApplicationListener接口[事件监听器]**  继承自jdk的EventListener,所有的监听器都要实现这个接口。这个接口只有一个onApplicationEvent()方法,该方法接受一个 ApplicationEvent或其子类对象作为参数,在方法体中,可以通过不同对 Event类的判断来进行相应的处理。 当事件触发时，所有的监听器都会收到消息

​		**ApplicationContext接口[事件源]** 

​		ApplicationContext是spring中的全局容器，翻译过来是”应用上下文”。 实现了ApplicationEventPublisher接口

​		负责读取bean的配置文档,管理bean的加载,维护bean之间的依赖关系, 可以说是负责bean的整个生命周期,再通俗一点就是我们平时所说的 IOC 容器

​		ApplicationEventMulticaster抽象类[事件源中publishEvent方法需要调用其方法getApplicationEventMulticaster] 

​		属于事件广播器,它的作用是把Applicationcontext发布的Event广播给所有的监听器	

#### 8. 策略模式

​		Spring框架的资源访问Resource接口。该接口提供了更强的资源访问能力，Spring 框架本身大量使用了 Resource 接口来访问底层资源

​		Rsource 接口是具体资源访问策略的抽象，也是所有资源访问类所实现的接口

​		Resource 接口本身没有提供访问任何底层资源的实现逻辑，**针对不同的底层资源，Spring 将会提供不同的 Resource 实现类，不同的实现类负责不同的资源访问逻辑**

#### 9. 模板方法模式

​		父类定义了骨架（调用哪些方法及顺序），某些特定方法由子类实现。最大的好处：代码复用，减少重复代码。除了子类要实现的特定方法， 其他方法及方法调用顺序都在父类中预先写好了

​		**所以父类模板方法中有两类方法：** 

​				**共同的方法：**所有子类都会用到的代码 

​		**不同的方法：**子类要覆盖的方法，分为两种： 

​				抽象方法：父类中的是抽象方法，子类必须覆盖 

​				钩子方法：父类中是一个空方法，子类继承了默认也是空的 

​		为什么叫钩子，子类可以通过这个钩子（方法），控制父类，因为这个钩子实际是父类的方法（空方法）！ 

​		模板方法模式和回调模式的结合，是Template Method不需要继承的另一种实现方式。Spring几乎所有的外接扩展都采用这种模式

#### 10. 责任链模式

​		CglibAopProxy

​		参数 chain:拦截器链，保含了目标方法的所有切面方法 ，从chain里面的数组元素的顺序来看，拦截器的顺序before不再after前面执行每一个 **Interceptor**有一个**invoke()**方法 Interceptor是一个空接口 

​	`ReflectiveMethodInvocation implements ProxyMethodInvocation ,ProxyMethodInvocation extends MethodInvocation `

​	spring的拦截器 xxxInterceptor都实现了自己的 Object  invoke(MethodInvocation invocation)方法 

​	ReflectiveMethodInvocation类中的 proceed()方法会遍历拦截器链，调用每个拦截器的invoke方法，传入 ReflectiveMethodInvocation自身作为参数， 

​		每个拦截器的invoke方法做两件事(这两件事的执行顺序因拦截器的功 能而异)：

​		1.执行自己的业务逻辑 

​		2.执行ReflectiveMethodInvocation的proceed()：这样就实现了链式调用 

​	统一的业务接口：Handler接口 中的方法invoke(),即业务方法责任链相当于一个负责人集合，每一个负责人都实现了自己的invoke()方 

法来处理传进来的数据或对象或对象的指定方法 

​		**方法1**：设计一个责任链执行器，包含责任链集合。责任链执行器中有一个proceed(),方法内遍历执行负责人的invoke()方法，invoke方 法以执行器作为参数：invoke(执行器)，invoke(执行器)处理完业务后，执行器又调 用proceed()方法，将索引移到下一个负责人位置。 

​				这样：执行器和负责人的方法相互调用，而执行器通过移动索引通知下一个负责人处理业务。

​		**方法2**：基于链表的责任链，每一个负责人是一个责任节点Node，包含指向下一个负责人的next引用负责人的处理业务的方法 invoke()这时不带参数，invoke()方法里面递归调用invoke()方法，并设置出口条件。

​				 如何通知下一个负责人处理业务：invoke()方法：1.处理业 务，2.next.invoke()，3.出口条件可以是next!=null 