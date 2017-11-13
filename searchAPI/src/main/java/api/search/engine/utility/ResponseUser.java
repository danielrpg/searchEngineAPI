package api.search.engine.utility;

import api.search.engine.model.User;

/**
 * @author dfernandez
 */
public class ResponseUser {

    private String message;
    private Boolean success;
    private User user;

    public ResponseUser(){

    }

    public ResponseUser(String message, Boolean success, User user) {
        this.message = message;
        this.success = success;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
