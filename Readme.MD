##POC -- SpringBoot & Teradata

You need to Download Teradata JDBC jar file & install it into your local maven repository
Download jar file from http://www.java2s.com/Code/Jar/t/teradata.htm then Install it into your local maven repository

mvn install:install-file -Dfile=D:\AFIF\Download\Coding\Java\Jar-Library\JDBC_Teradata\TD-14\teradata-config-14.00.00.04.jar -DgroupId=com.teradata.jdbc -DartifactId=terajdbc4 -Dversion=14 -Dpackaging=jar

mvn install:install-file -Dfile=D:\AFIF\Download\Coding\Java\Jar-Library\JDBC_Teradata\TD-14\teradata-jdbc4-14.00.00.04.jar -DgroupId=com.teradata.jdbc -DartifactId=tdgssconfig -Dversion=14 -Dpackaging=ja


Update your application properties properly & run it


