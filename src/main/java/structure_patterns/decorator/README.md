## 装饰者模式
### 概述
装饰者模式（Decorator Pattern）指在无需改变原有类和类继承关系的情况下，动态扩展一个类的功能。它通过装饰者来包裹
真实对象，并动态的向对象添加或者撤销功能。


### 主要角色
装饰者模式包括Source和Decorator两种角色，Source是被装饰者，Decorator是装饰者。装饰者模式通过装饰者可以为 被装饰者Source
东塔添加一些功能。

![](.README_images/57196762.png)