package org.example.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.example.entity.FunctionEntity;

import java.util.List;

public interface TestService {

    List<FunctionEntity> getList(Wrapper<FunctionEntity> wrapper);

    FunctionEntity getOneById(int id);
}
