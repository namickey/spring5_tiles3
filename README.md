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
    └── main
        ├── java
        │   └── demo
        │       ├── controller
        │       │   ├── Index.java
        │       │   └── bar
        │       │       ├── RegistBarController.java
        │       │       └── RegistBarForm.java
        │       ├── listener
        │       │   └── ContextListener.java
        │       ├── resolver
        │       │   └── UserAgentViewResolver.java
        │       └── validator
        │           ├── SomeCheck.java
        │           └── SomeCheckValidator.java
        ├── resources
        │   └── META-INF
        │       ├── messages
        │       │   ├── messages.properties
        │       │   └── messages_ja.properties
        │       ├── spring
        │       │   ├── applicationContext-beans.xml
        │       │   └── applicationContext-webmvc.xml
        │       └── tiles
        │           └── tiles.xml
        └── webapp
            └── WEB-INF
                ├── views
                │   ├── bar
                │   │   └── regist.jsp
                │   ├── common
                │   │   ├── layout.jsp
                │   │   └── top.jsp
                │   └── index.jsp
                └── web.xml
```
## Install gradle
https://gradle.org/  

## Execute
$ gradle tomcatRun  
http://localhost:8080/demo  

## Proxy
Accessing the web through a HTTP proxy.  
```C:/Users/<username>/.gradle/gradle.properties
systemProp.http.proxyHost=proxyhost
systemProp.http.proxyPort=8080
systemProp.https.proxyHost=proxyhost
systemProp.https.proxyPort=8080
```

## 参考
IntelliJ Community Edition で Servlet 3.1 の web.xml を編集する  
https://qiita.com/dayflower/items/b9a25fa54bce573e6fd2  

Spring 4 MVC+Apache Tiles 3 Example  
http://websystique.com/springmvc/spring-4-mvc-apache-tiles-3-annotation-based-example/  

Failed to load class org.slf4j.impl.StaticLoggerBinder  
https://www.slf4j.org/codes.html#StaticLoggerBinder  

gradleのプロキシ設定  
https://qiita.com/koooge/items/294e6a1000d99d92ae72  

Spring MVCでUser-AgentによるView切り替え  
http://lasaya.blog129.fc2.com/blog-entry-20.html  

新規ルールを実装したBean Validationアノテーションの作成  
https://terasolunaorg.github.io/guideline/5.3.1.RELEASE/ja/ArchitectureInDetail/WebApplicationDetail/Validation.html#validation-implement-new-constraint  
