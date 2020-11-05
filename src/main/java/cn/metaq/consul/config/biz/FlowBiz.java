package cn.metaq.consul.config.biz;

import cn.metaq.consul.config.dao.FlowDao;
import cn.metaq.consul.config.entity.Flow;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FlowBiz {

    @Resource
    private FlowDao flowDao;

    public List<Flow> list(){

        return flowDao.findAll();
    }
}
