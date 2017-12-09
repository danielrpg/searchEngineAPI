package api.search.engine.utility;

/**
 * @author dfernandez
 * @date 12/3/2017.
 */
public class AdvancedQuery {

    private String nameQuery;
    private String ciQuery;
    private String departamentQuery;
    private String newspaperQuery;
    private String addressQuery;

    public AdvancedQuery() {
    }

    public String getNameQuery() {
        return nameQuery;
    }

    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    public String getCiQuery() {
        return ciQuery;
    }

    public void setCiQuery(String ciQuery) {
        this.ciQuery = ciQuery;
    }

    public String getDepartamentQuery() {
        return departamentQuery;
    }

    public void setDepartamentQuery(String departamentQuery) {
        this.departamentQuery = departamentQuery;
    }

    public String getNewspaperQuery() {
        return newspaperQuery;
    }

    public void setNewspaperQuery(String newspaperQuery) {
        this.newspaperQuery = newspaperQuery;
    }

    public String getAddressQuery() {
        return addressQuery;
    }

    public void setAddressQuery(String addressQuery) {
        this.addressQuery = addressQuery;
    }
}
