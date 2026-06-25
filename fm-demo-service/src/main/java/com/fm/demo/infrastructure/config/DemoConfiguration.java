package com.fm.demo.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

/**
 * frame-me-starter-base 自动配置.
 */
@Configuration(proxyBeanMethods = false)
@ImportHttpServices(group = "tester", basePackages = "com.fm.demo.infrastructure.client.tester")
public class DemoConfiguration {

}
