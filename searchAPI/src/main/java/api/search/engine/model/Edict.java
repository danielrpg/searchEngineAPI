package api.search.engine.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Entity(name = "edict")
@Table(name = "edict")
public class Edict {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_edict")
    private Long id;

    @Column(name = "id_newspaper")
    private Integer idNewspaper;

    @Column(name = "seqnumber_edict")
    private Integer seqNumberEdict;

    @Column(name = "code_edict")
    private String codeEdict;

    @Column(name = "date_edict")
    private Date dateEdict;

    @Column(name = "title_edict")
    private String titleEdict;

    @Column(name = "context_edict")
    private String contextEdict;

    @Column(name = "context2_edict")
    private String getContextEdict2;

    @Column(name = "context3_edict")
    private String getContextEdict3;

    @Column(name = "context4_edict")
    private String getContextEdict4;

    @Column(name = "context5_edict")
    private String getContextEdict5;

    @Column(name = "type_edict")
    private Integer typeEdict;

    @Column(name = "num_face_edict")
    private Integer numFaceEdict;

    @Column(name = "observations_edict")
    private String observationEdict;

    @Column(name = "file_edict")
    private String fileEdict;

    @Column(name = "active_edict")
    private Integer activeEdict;

    @Column(name = "user_up_edict")
    private String userUpEdict;

    @Column(name = "date_up_edict")
    private Date dateUpEdict;

    @Column(name = "user_down_edict")
    private String userDownEdict;

    @Column(name = "date_down_edict")
    private Date dateDownEdict;

    public Edict() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdNewspaper() {
        return idNewspaper;
    }

    public void setIdNewspaper(Integer idNewspaper) {
        this.idNewspaper = idNewspaper;
    }

    public Integer getSeqNumberEdict() {
        return seqNumberEdict;
    }

    public void setSeqNumberEdict(Integer seqNumberEdict) {
        this.seqNumberEdict = seqNumberEdict;
    }

    public String getCodeEdict() {
        return codeEdict;
    }

    public void setCodeEdict(String codeEdict) {
        this.codeEdict = codeEdict;
    }

    public Date getDateEdict() {
        return dateEdict;
    }

    public void setDateEdict(Date dateEdict) {
        this.dateEdict = dateEdict;
    }

    public String getTitleEdict() {
        return titleEdict;
    }

    public void setTitleEdict(String titleEdict) {
        this.titleEdict = titleEdict;
    }

    public String getContextEdict() {
        return contextEdict;
    }

    public void setContextEdict(String contextEdict) {
        this.contextEdict = contextEdict;
    }

    public String getGetContextEdict2() {
        return getContextEdict2;
    }

    public void setGetContextEdict2(String getContextEdict2) {
        this.getContextEdict2 = getContextEdict2;
    }

    public String getGetContextEdict3() {
        return getContextEdict3;
    }

    public void setGetContextEdict3(String getContextEdict3) {
        this.getContextEdict3 = getContextEdict3;
    }

    public String getGetContextEdict4() {
        return getContextEdict4;
    }

    public void setGetContextEdict4(String getContextEdict4) {
        this.getContextEdict4 = getContextEdict4;
    }

    public String getGetContextEdict5() {
        return getContextEdict5;
    }

    public void setGetContextEdict5(String getContextEdict5) {
        this.getContextEdict5 = getContextEdict5;
    }

    public Integer getTypeEdict() {
        return typeEdict;
    }

    public void setTypeEdict(Integer typeEdict) {
        this.typeEdict = typeEdict;
    }

    public Integer getNumFaceEdict() {
        return numFaceEdict;
    }

    public void setNumFaceEdict(Integer numFaceEdict) {
        this.numFaceEdict = numFaceEdict;
    }

    public String getObservationEdict() {
        return observationEdict;
    }

    public void setObservationEdict(String observationEdict) {
        this.observationEdict = observationEdict;
    }

    public String getFileEdict() {
        return fileEdict;
    }

    public void setFileEdict(String fileEdict) {
        this.fileEdict = fileEdict;
    }

    public Integer getActiveEdict() {
        return activeEdict;
    }

    public void setActiveEdict(Integer activeEdict) {
        this.activeEdict = activeEdict;
    }

    public String getUserUpEdict() {
        return userUpEdict;
    }

    public void setUserUpEdict(String userUpEdict) {
        this.userUpEdict = userUpEdict;
    }

    public Date getDateUpEdict() {
        return dateUpEdict;
    }

    public void setDateUpEdict(Date dateUpEdict) {
        this.dateUpEdict = dateUpEdict;
    }

    public String getUserDownEdict() {
        return userDownEdict;
    }

    public void setUserDownEdict(String userDownEdict) {
        this.userDownEdict = userDownEdict;
    }

    public Date getDateDownEdict() {
        return dateDownEdict;
    }

    public void setDateDownEdict(Date dateDownEdict) {
        this.dateDownEdict = dateDownEdict;
    }
}
