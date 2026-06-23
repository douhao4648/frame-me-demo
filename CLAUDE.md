# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

# 项目身份

`fm-demo` 是 Frame Me 演示服务聚合工程，包含 `fm-demo-api`（接口契约）和 `fm-demo-service`（启动服务模块）。

详细架构、约定、命令和类索引见 `docs/` 知识库。

# 知识库检索

仓库在 `docs/` 目录下维护了一套项目知识库，`docs/index.md` 是索引入口。在回答实现问题、新增模块、处理异常或配置数据源之前，**优先读取相关文档**，不要仅凭已有记忆推断。

| 文档 | 何时读取 |
|---|---|
| `docs/index.md` | 首次接触项目或需要文档地图时 |
| `docs/build.md` | 构建、测试、打包、运行、新增子模块/组件 |
| `docs/architecture.md` | 模块/组件分层、初始化机制、请求/异常流转 |
| `docs/conventions.md` | 响应/异常规范、编码风格、数据访问约定 |
| `docs/modules.md` | 各模块/组件职责、关键类、可配置项 |
| `docs/testing.md` | 测试策略、运行测试、启动应用 |
| `docs/reference.md` | 查找关键文件路径、类索引、已知扩展点 |

检索顺序建议：先读 `docs/index.md` 定位主题，再读对应专题文档，必要时结合 `docs/reference.md` 查找具体类路径。

# 最常用命令速查

```bash
# 编译整个聚合工程
mvn clean compile

# 运行测试
mvn test

# 启动 fm-demo-service
mvn -pl fm-demo-service spring-boot:run

# 打包
mvn clean package
```

更多命令与配置见 `docs/build.md` 与 `docs/testing.md`。
