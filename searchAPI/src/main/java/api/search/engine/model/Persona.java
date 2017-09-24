package api.search.engine.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author dany
 */
@Document(indexName = "personas", type = "personas", shards = 1)
public class Persona {

    private Long id;
    private String name;
    private String lastName;
    private String description;

    public Persona(Long id, String name, String lastName, String description) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.description = description;
    }

    public Persona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
