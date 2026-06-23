package com.fm.demo.controller;

import com.fm.demo.api.IDemoApi;
import com.fm.demo.api.dto.DemoDTO;
import com.fm.demo.api.query.DemoQuery;
import com.fm.demo.api.vo.DemoVO;
import com.fm.demo.service.IDemoService;
import com.frame.me.api.result.IResult;
import com.frame.me.api.result.PageResult;
import com.frame.me.base.mybatis.util.SnowflakeUtils;
import com.frame.me.base.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 演示 Controller，只做简单参数校验并委托 Service 执行业务.
 */
@RestController
@Validated
@RequiredArgsConstructor
public class DemoController implements IDemoApi {

    private final IDemoService demoService;

    private final SnowflakeUtils snowflakeUtils;

    @Override
    public IResult<List<DemoVO>> list() {
        return Result.success(demoService.list());
    }

    @Override
    public IResult<PageResult<DemoVO>> page(DemoQuery query) {
        return Result.success(demoService.page(query));
    }

    @Override
    public IResult<DemoVO> getById(Long id) {
        return Result.success(demoService.getById(id));
    }

    @Override
    public IResult<Long> create(DemoDTO dto) {
        return Result.success(demoService.create(dto));
    }

    @Override
    public IResult<Boolean> update(Long id, DemoDTO dto) {
        return Result.success(demoService.update(id, dto));
    }

    @Override
    public IResult<Boolean> delete(Long id) {
        return Result.success(demoService.delete(id));
    }
}
