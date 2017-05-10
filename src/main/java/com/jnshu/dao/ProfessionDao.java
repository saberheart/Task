package com.jnshu.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Component
@Repository
public interface ProfessionDao {

    public List getProfessionWithDirection(String  direction);
}

