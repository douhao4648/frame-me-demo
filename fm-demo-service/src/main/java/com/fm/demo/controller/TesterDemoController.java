package com.fm.demo.controller;

import com.fm.demo.api.ITesterDemoApi;
import com.fm.demo.infrastructure.client.tester.TesterDemoClient;
//import com.frame.me.adapter.api.result.PageResult;
import com.frame.me.api.result.IResult;
import com.frame.me.api.result.PageData;
import com.frame.me.tester.api.dto.DemoDTO;
import com.frame.me.tester.api.query.DemoComplexQuery;
//import com.frame.me.tester.api.query.DemoOldQuery;
import com.frame.me.tester.api.query.DemoQuery;
import com.frame.me.tester.api.vo.DemoComplexVO;
import com.frame.me.tester.api.vo.DemoVO;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试 Controller：通过 {@link TesterDemoClient} 远程调用 frame-me-tester 的全部演示接口，逐个透传返回结果，方便手动验证 HTTP 客户端是否打通.
 */
@RestController
@Validated
@RequiredArgsConstructor
public class TesterDemoController implements ITesterDemoApi {

    private final TesterDemoClient testerDemoClient;

    @Override
    public IResult<List<DemoVO>> list() {
        IResult<List<DemoVO>> res = testerDemoClient.list();
        return res;
    }

    @Override
    public IResult<PageData<DemoVO>> page(DemoQuery query) {
        IResult<PageData<DemoVO>> res = testerDemoClient.page(query);
        return res;
    }

//    @Override
//    public IResult<PageResult<DemoVO>> pageOld(DemoOldQuery param) {
//        return testerDemoClient.pageOld(param);
//    }

    @Override
    public IResult<List<DemoComplexVO>> complexList(DemoComplexQuery query) {
        return testerDemoClient.complexList(query);
    }

    @Override
    public IResult<DemoVO> getById(Long id) {
        return testerDemoClient.getById(id);
    }

    @Override
    public IResult<Long> create(DemoDTO dto) {
        return testerDemoClient.create(dto);
    }

    @Override
    public IResult<Boolean> update(Long id, DemoDTO dto) {
        return testerDemoClient.update(id, dto);
    }

    @Override
    public IResult<Boolean> delete(Long id) {
        return testerDemoClient.delete(id);
    }
}
