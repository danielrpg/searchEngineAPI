package api.search.engine.model;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */

import javax.persistence.*;
import java.util.Date;

@Entity(name = "newspaper")
@Table(name = "newspaper")
public class Newspaper {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_newspaper")
    private long id;

    @Column(name = "seqnum_newspaper")
    private Integer sequenceNumberNewspaper;

    @Column(name = "code_newspaper")
    private String codeNewspaper;

    @Column(name = "code_ext_newspaper")
    private String codeExtNewspaper;

    @Column(name = "type_publishing_newspaper")
    private Integer typePublishNewspaper;

    @Column(name = "name_newspaper")
    private String nameNewspaper;

    @Column(name = "num_newspaper")
    private Integer numNewspaper;

    @Column(name = "departament_newspaper")
    private Integer departamentNewspaper;

    @Column(name = "address_newspaper")
    private String addressNewspaper;

    @Column(name = "telf_newspaper")
    private Integer telfNewspaper;

    @Column(name = "cel_newspaper")
    private Integer celNewspaper;

    @Column(name = "email_newspaper")
    private String emailNewspaper;

    @Column(name = "web_newspaper")
    private String webNewspaper;

    @Column(name = "contact_newspaper")
    private String contactNewspaper;

    @Column(name = "active_newspaper")
    private Integer activeNewspaper;

    @Column(name = "user_up_newspaper")
    private String userUpNewspaper;

    @Column(name = "date_up_newspaper")
    private Date dateUpNewspaper;

    @Column(name = "user_down_newspaper")
    private String userDownNewspaper;

    @Column(name = "date_down_newspaper")
    private Date dateDownNewspaper;

    public Newspaper() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getSequenceNumberNewspaper() {
        return sequenceNumberNewspaper;
    }

    public void setSequenceNumberNewspaper(Integer sequenceNumberNewspaper) {
        this.sequenceNumberNewspaper = sequenceNumberNewspaper;
    }

    public String getCodeNewspaper() {
        return codeNewspaper;
    }

    public void setCodeNewspaper(String codeNewspaper) {
        this.codeNewspaper = codeNewspaper;
    }

    public String getCodeExtNewspaper() {
        return codeExtNewspaper;
    }

    public void setCodeExtNewspaper(String codeExtNewspaper) {
        this.codeExtNewspaper = codeExtNewspaper;
    }

    public Integer getTypePublishNewspaper() {
        return typePublishNewspaper;
    }

    public void setTypePublishNewspaper(Integer typePublishNewspaper) {
        this.typePublishNewspaper = typePublishNewspaper;
    }

    public String getNameNewspaper() {
        return nameNewspaper;
    }

    public void setNameNewspaper(String nameNewspaper) {
        this.nameNewspaper = nameNewspaper;
    }

    public Integer getNumNewspaper() {
        return numNewspaper;
    }

    public void setNumNewspaper(Integer numNewspaper) {
        this.numNewspaper = numNewspaper;
    }

    public Integer getDepartamentNewspaper() {
        return departamentNewspaper;
    }

    public void setDepartamentNewspaper(Integer departamentNewspaper) {
        this.departamentNewspaper = departamentNewspaper;
    }

    public String getAddressNewspaper() {
        return addressNewspaper;
    }

    public void setAddressNewspaper(String addressNewspaper) {
        this.addressNewspaper = addressNewspaper;
    }

    public Integer getTelfNewspaper() {
        return telfNewspaper;
    }

    public void setTelfNewspaper(Integer telfNewspaper) {
        this.telfNewspaper = telfNewspaper;
    }

    public Integer getCelNewspaper() {
        return celNewspaper;
    }

    public void setCelNewspaper(Integer celNewspaper) {
        this.celNewspaper = celNewspaper;
    }

    public String getEmailNewspaper() {
        return emailNewspaper;
    }

    public void setEmailNewspaper(String emailNewspaper) {
        this.emailNewspaper = emailNewspaper;
    }

    public String getWebNewspaper() {
        return webNewspaper;
    }

    public void setWebNewspaper(String webNewspaper) {
        this.webNewspaper = webNewspaper;
    }

    public String getContactNewspaper() {
        return contactNewspaper;
    }

    public void setContactNewspaper(String contactNewspaper) {
        this.contactNewspaper = contactNewspaper;
    }

    public Integer getActiveNewspaper() {
        return activeNewspaper;
    }

    public void setActiveNewspaper(Integer activeNewspaper) {
        this.activeNewspaper = activeNewspaper;
    }

    public String getUserUpNewspaper() {
        return userUpNewspaper;
    }

    public void setUserUpNewspaper(String userUpNewspaper) {
        this.userUpNewspaper = userUpNewspaper;
    }

    public Date getDateUpNewspaper() {
        return dateUpNewspaper;
    }

    public void setDateUpNewspaper(Date dateUpNewspaper) {
        this.dateUpNewspaper = dateUpNewspaper;
    }

    public String getUserDownNewspaper() {
        return userDownNewspaper;
    }

    public void setUserDownNewspaper(String userDownNewspaper) {
        this.userDownNewspaper = userDownNewspaper;
    }

    public Date getDateDownNewspaper() {
        return dateDownNewspaper;
    }

    public void setDateDownNewspaper(Date dateDownNewspaper) {
        this.dateDownNewspaper = dateDownNewspaper;
    }
}
