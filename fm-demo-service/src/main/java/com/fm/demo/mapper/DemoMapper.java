package com.fm.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fm.demo.entity.DemoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 演示 Mapper 接口.
 */
@Mapper
public interface DemoMapper extends BaseMapper<DemoEntity> {
}
