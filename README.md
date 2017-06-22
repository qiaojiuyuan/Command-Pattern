# Command-Pattern
## 命令模式
### 项目类图
![项目类图](https://github.com/qiaojiuyuan/Command-Pattern/raw/master/project_class.png)
### 定义
```
将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求的日志，可以
提供命令的撤销和恢复功能。
```
### 优点
* 类间解耦
```
调用者与接收者之间没有任何依赖关系
```
* 可扩展性
```
Command子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严重的代码耦合
```
### 缺点
* 命令越多，子类越多，产生类膨胀
