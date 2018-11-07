# Everything4J

----

Everything4J is a implementation of everything which is base on `Everything.dll`, and powered by [JNA ( Java Native Access )](https://github.com/java-native-access/jna).

`Everything` is dependency on Windows file system , so Everything4J also support on Windows system .

Official document reference at [https://www.voidtools.com/support/everything/sdk/](https://www.voidtools.com/support/everything/sdk/).

----
# Dependencies

1. JNA

```xml
    <dependencies>
        <dependency>
            <groupId>net.java.dev.jna</groupId>
            <artifactId>jna</artifactId>
            <version>4.5.1</version>
        </dependency>
    </dependencies>
```

----
# Usage

1. search full file path according to search key string.

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
