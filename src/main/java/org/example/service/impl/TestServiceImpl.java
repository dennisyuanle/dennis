package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.example.entity.FunctionEntity;
import org.example.mapper.FunctionMapper;
import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    FunctionMapper functionMapper;

    @Override
    public List<FunctionEntity> getList(Wrapper<FunctionEntity> wrapper) {
        List<FunctionEntity> list = functionMapper.selectList(wrapper);
        return list;
    }

    @Override
    public FunctionEntity getOneById(int id) {
        LambdaQueryWrapper<FunctionEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(FunctionEntity::getId, 2);
        FunctionEntity entity = functionMapper.selectOne(wrapper);
        return entity;
    }
}
