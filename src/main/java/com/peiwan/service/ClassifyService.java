package com.peiwan.service;

import com.peiwan.bean.GService;
import com.peiwan.bean.GSortDuanwei;

import java.util.List;
import java.util.Map;

/**
 * @Author: QSC
 * @Despriction:
 * @Date:Created in 15:24 2019/1/4
 * @Modify by:
 */
public interface ClassifyService {


    List<Map<String,Object>> getDuanWei(int gid);

    List<Map<String,Object>> getCondition(Map map);

}
