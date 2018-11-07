# Automation prototype: automate ipv using image recognition

## Create maven skeleton from an archetype

`mvn archetype:generate 
-DartifactId=ipv 
-DinteractiveMode=false 
-DgroupId=stackpath 
-DarchetypeArtifactId=maven-archetype-quickstart`

## Create .gitignore

1. `cd <desired_folder>`
2. `touch .gitignore`
3. `*
!.gitignore`

## Example of a pom.xml to include cukes

`
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>stackpath</groupId>
  <artifactId>ipv</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>ipv</name>
  <url>http://maven.apache.org</url>

  <properties>
    <junit.version>4.11</junit.version>
    <cukes.version>1.2.4</cukes.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>info.cukes</groupId>
      <artifactId>cucumber-java</artifactId>
      <version>${cukes.version}</version>
    </dependency>
    <dependency>
      <groupId>info.cukes</groupId>
      <artifactId>cucumber-junit</artifactId>
      <version>${cukes.version}</version>
    </dependency>
  </dependencies>

  <!-- build plugin-->
  <build>
    <plugins>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>

`
