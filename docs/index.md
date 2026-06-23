# 项目文档导航

本文档用于帮助 AI 助手（以及开发者）快速理解 `fm-demo` 项目的结构、约定与关键实现。

## 项目速览

`fm-demo` 是 Frame Me 技术体系下的演示聚合工程，用于验证和展示 `frame-me-parent` 中各 starter 的使用方式。当前包含两个子模块：

- `fm-demo-api`：对外暴露的接口契约与 DTO。
- `fm-demo-service`：基于 Spring Boot 的启动服务，依赖 `frame-me-booter` 集成各基础能力。

技术栈：Java 25、Spring Boot 4.0.7、Maven、MyBatis-Plus、H2（运行时）。

## 阅读前置

- 熟悉 Java 与 Maven 多模块工程。
- 了解 `frame-me-parent` 中定义的 starter 体系（见 `frame-me-parent` 仓库）。

## 文档地图

| 文档 | 回答的问题 |
|---|---|
| [build.md](./build.md) | 如何编译、测试、打包、运行？如何新增子模块/组件？ |
| [architecture.md](./architecture.md) | 模块/组件如何分层？初始化/装配如何工作？请求响应如何流转？ |
| [conventions.md](./conventions.md) | 响应/异常/状态码怎么用？编码风格是什么？数据访问有什么约定？ |
| [modules.md](./modules.md) | 每个子模块/组件的职责、依赖、关键类是什么？ |
| [testing.md](./testing.md) | 如何运行测试？如何启动应用？ |
| [reference.md](./reference.md) | 关键类与文件的路径索引、已知扩展点在哪里？ |

## 关键约定一句话

TODO：用一句话概括项目最重要的约定（例如：所有业务异常必须继承 `BusinessException` 并通过统一异常处理器转换）。
