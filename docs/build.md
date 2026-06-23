# 构建与运行

## 环境要求

- JDK 25+
- Maven 3.9+
- （可选）本地已安装 `frame-me-parent` 及其模块到本地 Maven 仓库

## 常用命令

### 编译/安装依赖

```bash
mvn clean compile
```

### 运行测试

```bash
mvn test
```

### 运行单个测试

```bash
mvn -pl fm-demo-service test -Dtest=ClassName#methodName
```

### 启动应用

```bash
mvn -pl fm-demo-service spring-boot:run
```

## 新增子模块/组件

TODO：说明如何在 `fm-demo` 聚合工程下新增子模块（例如在 `pom.xml` 的 `<modules>` 中注册、补充 `<dependencyManagement>` 等）。

## Lint / 代码检查

TODO：补充项目使用的代码检查命令（如 `mvn spotbugs:check`、`mvn checkstyle:check` 等），如果没有可删除本节。
