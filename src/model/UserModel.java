package quickSave.model;

import java.io.Serializable;
import java.sql.*;

public class UserModel implements Serializable {

    private int userId;
    private String userEmail;
    private String userReEmail;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    private String userRePassword;

    public UserModel() {
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserReEmail(String userReEmail) {
        this.userReEmail = userReEmail;
    }

    public String getUserReEmail() {
        return this.userReEmail;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserFirstName() {
        return this.userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserLastName() {
        return this.userLastName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserRePassword(String userRePassword) {
        this.userRePassword = userRePassword;
    }

    public String getUserRePassword() {
        return this.userRePassword;
    }

    public boolean validateUserEmail() {
        if (this.userEmail.isEmpty() || this.userReEmail.isEmpty()
                || !this.userEmail.equals(this.userReEmail)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateUserFirstName() {
        if (this.userFirstName.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateUserLastName() {
        if (this.userLastName.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateUserPassword() {
        if (this.userPassword.isEmpty() || this.userRePassword.isEmpty()
                || !this.userPassword.equals(this.userRePassword)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkUserEmail() {
        return true;
    }

    public String checkUser() {
        return "";
    }
}
