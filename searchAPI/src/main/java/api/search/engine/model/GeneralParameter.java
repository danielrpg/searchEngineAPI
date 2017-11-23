package api.search.engine.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */

@Entity(name = "general_parameters")
@Table(name = "general_parameters")
public class GeneralParameter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_gral_param")
    private long id;

    @Column(name = "gral_param_pro_grp")
    private Integer gralParamGrp;

    @Column(name = "gral_param_pro_cod")
    private Integer gralParamCod;

    @Column(name = "gral_param_pro_sigla")
    private String gralParamSigla;

    @Column(name = "gral_param_pro_desc")
    private String gralParamDescription;

    @Column(name = "gral_parm_pro_val1")
    private String gralParamVal1;

    @Column(name = "gral_parm_pro_val2")
    private String gralParamVal12;

    @Column(name = "usr_up_gral_param")
    private String usrUpGral;

    @Column(name = "date_up_gral_param")
    private Date dateUpGral;

    @Column(name = "usr_down_gral_param")
    private String usrDownGral;

    @Column(name = "date_down_gral_param")
    private Date dateDownGral;

    public GeneralParameter() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getGralParamGrp() {
        return gralParamGrp;
    }

    public void setGralParamGrp(Integer gralParamGrp) {
        this.gralParamGrp = gralParamGrp;
    }

    public Integer getGralParamCod() {
        return gralParamCod;
    }

    public void setGralParamCod(Integer gralParamCod) {
        this.gralParamCod = gralParamCod;
    }

    public String getGralParamSigla() {
        return gralParamSigla;
    }

    public void setGralParamSigla(String gralParamSigla) {
        this.gralParamSigla = gralParamSigla;
    }

    public String getGralParamDescription() {
        return gralParamDescription;
    }

    public void setGralParamDescription(String gralParamDescription) {
        this.gralParamDescription = gralParamDescription;
    }

    public String getGralParamVal1() {
        return gralParamVal1;
    }

    public void setGralParamVal1(String gralParamVal1) {
        this.gralParamVal1 = gralParamVal1;
    }

    public String getGralParamVal12() {
        return gralParamVal12;
    }

    public void setGralParamVal12(String gralParamVal12) {
        this.gralParamVal12 = gralParamVal12;
    }

    public String getUsrUpGral() {
        return usrUpGral;
    }

    public void setUsrUpGral(String usrUpGral) {
        this.usrUpGral = usrUpGral;
    }

    public Date getDateUpGral() {
        return dateUpGral;
    }

    public void setDateUpGral(Date dateUpGral) {
        this.dateUpGral = dateUpGral;
    }

    public String getUsrDownGral() {
        return usrDownGral;
    }

    public void setUsrDownGral(String usrDownGral) {
        this.usrDownGral = usrDownGral;
    }

    public Date getDateDownGral() {
        return dateDownGral;
    }

    public void setDateDownGral(Date dateDownGral) {
        this.dateDownGral = dateDownGral;
    }
}
