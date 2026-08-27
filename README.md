# fm-demo

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
- MySQL（多数据源 + Druid 监控；测试用 Testcontainers MySQL，H2 为可选运行时库）
- MapStruct（APT 编译期生成转换器）
- Logback（复用 `frame-me-parent` 共享日志模板）

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

- Swagger UI：http://localhost:8080/swagger-ui.html
- API Docs：http://localhost:8080/v3/api-docs

## 模块说明

### fm-demo-api

对外暴露的接口契约与 DTO，供 `fm-demo-service` 或其他消费方引用。

### fm-demo-service

基于 Spring Boot 的启动服务，直接依赖：

- `fm-demo-api`
- `frame-me-boot`（一键集成 base、auth（header-resolver）、multi-redis、l1l2-cache、sensi-encrypt、sse-mvc、op-audit、msg-notify、cloud 等通用能力）
- `frame-me-starter-mybatis-plus`（数据访问）
- `frame-me-starter-dynamic-ds`（多数据源）
- `druid-spring-boot-4-starter`（Druid 连接池监控）
- `redisson`、`freemarker`、`httpclient5` 等可选增强
- Maven profiles：`prometheus`（监控）、`p6spy`（SQL 打印）、`swagger`（OpenAPI 文档）、`Apple-M1`（macOS DNS 原生支持）

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
