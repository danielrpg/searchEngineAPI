package api.search.engine.model;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.util.Date;

/**
 * @author dfernandez
 * @date 11/15/2017.
 */
/*
    id_edict bigserial NOT NULL,
  id_newspaper integer NOT NULL,
  seqnumber_edict integer NOT NULL,
  code_edict character varying(200) NOT NULL,
  date_edict date NOT NULL,
  title_edict character varying(200),
  context_edict text NOT NULL,
  context2_edict text,
  context3_edict text,
  context4_edict text,
  context5_edict text,
  type_edict integer NOT NULL,
  num_face_edict integer NOT NULL,
  observations_edict character varying(200),
  file_edict character varying(400),
  active_edict smallint NOT NULL,
  user_up_edict character varying(100) NOT NULL,
  date_up_edict timestamp(6) without time zone NOT NULL DEFAULT now(),
  user_down_edict character varying(100),
  date_down_edict timestamp(6) without time zone
 */
@Document(indexName = "edicts", type = "edicts", shards = 1)
public class Edict {

    @Id
    private String id;
    private String codeEdict;
    private String dateEdict;
    private String titleEdict;
    private String contextEdict;
    private String typeEdict;
    private Integer numFaceEdict;
    private String onservationEdict;
    private String fileEdict;
    private String newspaperEdict;
    private String departamentEdict;
    private Integer activeEdict;

    public Edict(){

    }

    public Edict(String codeEdict, String dateEdict, String titleEdict,
                 String contextEdict, String typeEdict, Integer numFaceEdict,
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

    public String getDateEdict() {
        return dateEdict;
    }

    public void setDateEdict(String dateEdict) {
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

    public String getTypeEdict() {
        return typeEdict;
    }

    public void setTypeEdict(String typeEdict) {
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
