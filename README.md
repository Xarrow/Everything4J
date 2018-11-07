# Everything4J

----

Everything4J is a implementation of everything which is base on `Everything.dll`, and powered by [JNA ( Java Native Access )](https://github.com/java-native-access/jna).

`Everything` is dependency on Windows file system , so Everything4J also support on Windows system .

Official document reference at [https://www.voidtools.com/support/everything/sdk/](https://www.voidtools.com/support/everything/sdk/).

----
# Dependencies

1. JNA

```xml
        <dependency>
            <groupId>net.java.dev.jna</groupId>
            <artifactId>jna</artifactId>
            <version>${jna.version}</version>
        </dependency>

```

2. junit

```xml
        <dependency>
             <groupId>junit</groupId>
             <artifactId>junit</artifactId>
             <version>${junit.version}</version>
             <scope>test</scope>
        </dependency>

```

----
# Usage

1. compile as jar

```
mvn clean install -Dmaven.test.skip=true

```

2. import target jar into project.

3. put dynamic link library (Everything32.dll , Everything64.dll) into the root of your project.

4. search full file path according to search key string.

```java

List<String> sl = everything4jInstance.searchResult("abc");
System.out.println(sl.size());
for (int i = 0; i < sl.size(); i++) {
    System.out.println(i + " ==> " + sl.get(i));
    }
}
```

----
# License

Apache 2
