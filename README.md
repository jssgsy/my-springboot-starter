[toc]
# 说明
演示spring boot如何自定义starter.
本项目用来想达到的目标是，当其它工程引入此依赖时，其已经有了UnivProperty的实例，且其值可以自己指定。


# 步骤
其实也就是最核心的一点：`在META-INF下创建spring.factories文件，并在其中配置需要自动配置的类即可。`示例如下：
```
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.univ.configuration.MyConfiguratonContainer
```


# 重要说明
* starter也只是一个jar包，其不具备springboot的运行时环境，因此此项目中的配置文件是多余的；
