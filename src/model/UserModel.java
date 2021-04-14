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

    public void SetUserId(int UserId) {
        this.userId = UserId;
    }

    public int GetUserId() {
        return this.userId;
    }

    public void SetUserEmail(String UserEmail) {
        this.userEmail = UserEmail;
    }

    public String GetUserEmail() {
        return this.userEmail;
    }

    public void SetUserReEmail(String UserReEmail) {
        this.userReEmail = UserReEmail;
    }

    public String GetUserReEmail() {
        return this.userReEmail;
    }

    public void SetUserFirstName(String UserFirstName) {
        this.userFirstName = UserFirstName;
    }

    public String GetUserFirstName() {
        return this.userFirstName;
    }

    public void SetUserLastName(String UserLastName) {
        this.userLastName = UserLastName;
    }

    public String GetUserLastName() {
        return this.userLastName;
    }

    public void SetUserPassword(String UserPassword) {
        this.userPassword = UserPassword;
    }

    public String GetUserPassword() {
        return this.userPassword;
    }

    public void SetUserRePassword(String UserRePassword) {
        this.userRePassword = UserRePassword;
    }

    public String GetUserRePassword() {
        return this.userRePassword;
    }

    public boolean ValidateUserEmail() {
        if (this.userEmail.isEmpty() || this.userReEmail.isEmpty() || !this.userEmail.equals(this.userReEmail)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidateUserFirstName() {
        if (this.userFirstName.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidateUserLastName() {
        if (this.userLastName.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ValidateUserPassword() {
        if (this.userPassword.isEmpty() || this.userRePassword.isEmpty() || !this.userPassword.equals(this.userRePassword)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean CheckUserEmail() {
        return true;
    }

    public String CheckUser() {
        return "";
    }
}
