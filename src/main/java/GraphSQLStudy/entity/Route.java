package GraphSQLStudy.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@EqualsAndHashCode
@Entity
public class Route implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "short_name", nullable = false)
    private String shortName;
    @Column(name = "long_name", nullable = false)
    private String longName;
    @Column(name = "reg_num")
    private String regNum;
    @Column(name = "route_type")
    private String routeType;
    @Column(name = "type_name")
    private String __typename;

}
