# frame-me-demo

Frame Me 演示工程，用于验证和展示 `frame-me-parent` 各 starter 的使用方式。

## 项目结构

```text
fm-demo
├── fm-demo-api         # 接口契约与 DTO
└── fm-demo-service     # 启动服务模块
```

## 技术栈

- Java 25
- Spring Boot 4.0.7
- Maven
- MyBatis-Plus
- H2（运行时内存数据库）

## 前置条件

- JDK 25+
- Maven 3.9+
- 本地已安装 `frame-me-parent` 及其模块到 Maven 本地仓库

## 快速开始

### 编译

```bash
mvn clean compile
```

### 运行测试

```bash
mvn test
```

### 启动应用

```bash
mvn -pl fm-demo-service spring-boot:run
```

启动后：

- 应用地址：http://localhost:8080
- 管理端口：8081

## 接口文档

TODO：补充 Swagger / SpringDoc 文档地址，例如 `http://localhost:8080/swagger-ui.html`。

## 模块说明

### fm-demo-api

对外暴露的接口契约与 DTO，供 `fm-demo-service` 或其他消费方引用。

### fm-demo-service

基于 Spring Boot 的启动服务，直接依赖：

- `fm-demo-api`
- `frame-me-booter`（集成 `frame-me-starter-auth`、`frame-me-starter-cloud`、`frame-me-starter-dynamic-ds` 等基础能力）

## 开发约定

详见项目知识库 `docs/` 目录：

- `docs/architecture.md` — 架构设计与请求/异常流转
- `docs/conventions.md` — 响应规范、异常体系、编码风格
- `docs/build.md` — 构建与运行命令
- `docs/testing.md` — 测试策略
- `docs/modules.md` — 模块详细说明
- `docs/reference.md` — 关键文件索引

## 常用 Maven 命令

```bash
# 打包
mvn clean package

# 跳过测试打包
mvn clean package -DskipTests

# 单独运行 service 模块测试
mvn -pl fm-demo-service test
```

## 许可证

TODO：补充许可证信息。
