#step-one:简单运行shiro
##参考demo 
	com.study.demo.test01.Shiro01Test

##依赖配置
	resources/shiro01.ini

##依赖jar包
	<!--shiro核心类库-->
    <dependency>
        <groupId>org.apache.shiro</groupId>
        <artifactId>shiro-core</artifactId>
        <version>1.2.3</version>
    </dependency>
    <!--日志工具包-->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.6.1</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.6.1</version>
    </dependency>

#step-two:shiro+默认从Mysql数据库读取数据
##参考demo 
	com.study.demo.test02.Shiro02MySqlTest

##数据初始化文件

	table_SQL.txt
	init_SQL.txt

#step-three:shiro+springMVC

##主要配置请参考
	resources/db.properties
	com.study.demo.controler.ShiroController
	src\main\webapp\WEB-INF\applicationContext.xml
	src\main\webapp\WEB-INF\springMVC-servlet.xml
	src\main\webapp\WEB-INF\web.xml
