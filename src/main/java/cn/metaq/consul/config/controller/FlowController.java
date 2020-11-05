package cn.metaq.consul.config.controller;

import cn.metaq.consul.config.biz.FlowBiz;
import cn.metaq.consul.config.entity.Flow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FlowController {

    @Resource
    private FlowBiz flowBiz;

    @GetMapping("flows")
    public List<Flow> list(){
        return flowBiz.list();
    }
}
