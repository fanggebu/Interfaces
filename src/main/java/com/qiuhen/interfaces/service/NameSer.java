package com.qiuhen.interfaces.service;

import com.qiuhen.interfaces.mapper.NameMapper;
import com.qiuhen.interfaces.pojo.NameOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.service
 * @ClassName: NameSer
 * @Author: qiuhen
 * @Description: 名称service
 * @Date: 2021/1/23 16:19
 * @Version: 1.0
 */
@Service
public class NameSer {

    @Autowired
    private NameMapper nameMapper;

    @Autowired
    private OperateSqlService operateSqlService;


    public String add(){
        nameMapper.add();
        return "fasd";
    }

    public void peopleName(NameOperate nameOperate) {

        operateSqlService.test(nameOperate);
    }
}
