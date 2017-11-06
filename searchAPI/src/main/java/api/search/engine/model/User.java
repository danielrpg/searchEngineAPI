package api.search.engine.model;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

/**
 * @author dany
 */
@Document(indexName = "users", type = "users", shards = 1)
public class User {

    @Id
    private String id;
    private String userName;
    private String password;
    private String name;
    private String lastName;

    public User(){

    }

    public User(String userName, String password, String name, String lastName) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
