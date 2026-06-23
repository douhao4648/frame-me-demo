# 架构设计

## 模块/组件依赖图

TODO：插入一张依赖图或 ASCII 图。

更准确的依赖关系：

- `fm-demo` 聚合 `fm-demo-api` 与 `fm-demo-service`。
- `fm-demo-service` 依赖 `fm-demo-api` 和 `frame-me-booter`。
- `frame-me-booter` 进一步集成 `frame-me-starter-auth`、`frame-me-starter-cloud`、`frame-me-starter-dynamic-ds` 等 starter。

## 分层原则

TODO：描述项目的分层原则（例如 controller → service → mapper → entity）。

## 初始化 / 自动装配机制

TODO：描述 Spring Boot 启动时的自动装配、starter 生效顺序、需要手动开启的配置等。

## 响应与异常流水线

### 正常请求

TODO：描述一次请求从 controller 到 service 再到数据访问层的正常流转。

### 异常请求

TODO：描述异常如何被统一异常处理器捕获并转换为统一响应。

### 关键类路径

TODO：列出统一响应类、统一异常处理器、业务异常基类等关键类的路径。

## 扩展提示

TODO：列出常见的扩展点，例如自定义 starter、新增数据源、扩展统一异常等。
