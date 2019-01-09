package com.peiwan.serviceimpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.peiwan.bean.GService;
import com.peiwan.bean.GSortDuanwei;
import com.peiwan.dao.ClassifyMapper;
import com.peiwan.service.ClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: QSC
 * @Despriction:
 * @Date:Created in 15:25 2019/1/4
 * @Modify by:
 */
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Resource
    private ClassifyMapper cm;


    public ClassifyMapper getCm() {
        return cm;
    }

    public void setCm(ClassifyMapper cm) {
        this.cm = cm;
    }


    /*
    * 点击游戏服务，根据gid得到的值
    * */
    @Override
    public List<Map<String, Object>> getDuanWei(int gid) {

        List<Map<String, Object>> duanWei = cm.getDuanWei(gid);

        return duanWei;
    }


    /*
    * 根据游戏服务、等级分类、性别分类
    * */
    @Override
    public List<Map<String, Object>> getCondition(Map map) {
        List<Map<String, Object>> condition = cm.getCondition(map);
        return condition;
    }
}
