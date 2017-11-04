# spring5_tiles3

## Dependencies
* org.springframework:spring-webmvc:5.0.1.RELEASE  
* org.hibernate:hibernate-validator:6.0.4.Final  
* org.apache.tiles:tiles-jsp:3.0.7  
* javax.servlet:jstl:1.2  
* org.slf4j:slf4j-nop:1.7.6  
* org.projectlombok:lombok:1.16.18  

## Tree
```
├── README.md
├── build.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── demo
    │   │       └── controller
    │   │           ├── Index.java
    │   │           └── bar
    │   │               ├── RegistBarController.java
    │   │               └── RegistBarForm.java
    │   ├── resources
    │   │   └── META-INF
    │   │       ├── spring
    │   │       │   ├── applicationContext-beans.xml
    │   │       │   └── applicationContext-webmvc.xml
    │   │       └── tiles
    │   │           └── tiles.xml
    │   └── webapp
    │       └── WEB-INF
    │           ├── views
    │           │   ├── bar
    │           │   │   └── regist.jsp
    │           │   ├── common
    │           │   │   ├── layout.jsp
    │           │   │   └── top.jsp
    │           │   └── index.jsp
    │           └── web.xml
```

## Execute
$ gradle tomcatRun  
http://localhost:8080/demo  

## 参考
IntelliJ Community Edition で Servlet 3.1 の web.xml を編集する  
https://qiita.com/dayflower/items/b9a25fa54bce573e6fd2  

Spring 4 MVC+Apache Tiles 3 Example  
http://websystique.com/springmvc/spring-4-mvc-apache-tiles-3-annotation-based-example/  

Failed to load class org.slf4j.impl.StaticLoggerBinder  
https://www.slf4j.org/codes.html#StaticLoggerBinder  
