package api.search.engine.model;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author dfernandez
 * @date 11/15/2017.
 */

@Document(indexName = "edict_document", type = "edict_document")
public class EdictDocument {

    @Id
    private String id;
    private String codeEdict;
    private Date dateEdict;
    private String titleEdict;
    private String contextEdict;
    private Integer typeEdict;
    private Integer numFaceEdict;
    private String onservationEdict;
    private String fileEdict;
    private String newspaperEdict;
    private String departamentEdict;
    private Integer activeEdict;

    public EdictDocument(){

    }

    public EdictDocument(String codeEdict, Date dateEdict, String titleEdict,
                 String contextEdict, Integer typeEdict, Integer numFaceEdict,
                 String onservationEdict, String fileEdict, String newspaperEdict,String departamentEdict, Integer activeEdict) {
        this.id = id;
        this.codeEdict = codeEdict;
        this.dateEdict = dateEdict;
        this.titleEdict = titleEdict;
        this.contextEdict = contextEdict;
        this.typeEdict = typeEdict;
        this.numFaceEdict = numFaceEdict;
        this.onservationEdict = onservationEdict;
        this.fileEdict = fileEdict;
        this.newspaperEdict = newspaperEdict;
        this.departamentEdict = departamentEdict;
        this.activeEdict = activeEdict;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getOnservationEdict() {
        return onservationEdict;
    }

    public void setOnservationEdict(String onservationEdict) {
        this.onservationEdict = onservationEdict;
    }

    public String getFileEdict() {
        return fileEdict;
    }

    public void setFileEdict(String fileEdict) {
        this.fileEdict = fileEdict;
    }

    public String getNewspaperEdict() {
        return newspaperEdict;
    }

    public void setNewspaperEdict(String newspaperEdict) {
        this.newspaperEdict = newspaperEdict;
    }

    public String getDepartamentEdict() {
        return departamentEdict;
    }

    public void setDepartamentEdict(String departamentEdict) {
        this.departamentEdict = departamentEdict;
    }

    public Integer getActiveEdict() {
        return activeEdict;
    }

    public void setActiveEdict(Integer activeEdict) {
        this.activeEdict = activeEdict;
    }
}
