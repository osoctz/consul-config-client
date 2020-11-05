package cn.metaq.consul.config.dao;

import cn.metaq.consul.config.entity.Flow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowDao extends JpaRepository<Flow, String> {
}