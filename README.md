# Library-borrowing-management-system
# 介绍
用springboot+thymeleaf实现图书馆借阅系统,前端网页ui使用网上下载的网页模板

系统具体划分为管理员和读者两个权限，为了使权限区分明显，最主要的图书借阅功能只有管理员能执行。具体功能划分如下：

用户身份决定具有的功能，以管理员登录具有以下功能：

(1)	增加新书
(2)	删除无用书
(3)	修改图书
(4)	增加、修改读者信息
(5)	把书借给读者
(6)	收回读者还的书
(7)	删除读者
(8)	对图书逾期未还的进行扣费
(9)	删除借阅信息
(10)查询读者信息
(11)查询借阅记录

以读者登录具有以下功能：

(1)	查看目前借入的书
(2)	查看借阅过的书
所有用户都具有以下功能：
(1)	按照不同条件查看书的信息
(2)	修改个人信息及密码

以下举例两种用户的登录，需要登录其他用户则要查询数据库：

管理员登录：

账号：0000001

密码：1234567或123456

读者登录：

账号:1000001

密码：1234567或123456

# 配置
git clone https://github.com/CherrySeason/book-borrowing-system.git

springboot自动配置会装载依赖包，需要修改的地方是src/main/resources/application.properties中的数据库配置，需要改为适应本机的配置。

需要修改pom.xml中

<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>8.0.27</version>
</dependency>

mysql的依赖包为自己mysql的版本

需要在本地数据库中创建数据库Book，然后导入sql文件运行，生成数据。

在使用前需要打开redis，确认redis的端口是否是6379，并且如果有密码需要修改application.properties中redis的相关配置。

# 迭代版本

基于本项目构建了一个spring cloud项目，位于https://github.com/CherrySeason/springcloud-booksys.git