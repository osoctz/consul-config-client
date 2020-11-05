package cn.metaq.consul.config.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * 流程定义
 */
@Entity
@Table(name = "t_flow")
@Setter
@Getter
public class Flow {

    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    @Size(max = 32)
    private String id;

    /**
     * 流程名称
     */
    @Column(name = "name")
    @Size(max = 50)
    private String name;
}