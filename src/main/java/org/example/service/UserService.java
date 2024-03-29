package org.example.service;

import org.example.dao.UserDAO;
import org.example.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    static UserDAO userDAO = new UserDAO();

    public  List<User> selectAllUsers() {
        List<User> listUser = userDAO.selßectAllUsers();
        return listUser;
    }

    public User selectUser(int id) {
        User existingUser = userDAO.selectUser(id);
        return existingUser;
    }

    public void insertUser(User newUser)
            throws SQLException {
        userDAO.insertUser(newUser);
    }

    public void updateUser(User user)
            throws SQLException, IOException {
        userDAO.updateUser(user);
    }

    public void deleteUser(int id)
            throws SQLException, IOException {
        userDAO.deleteUser(id);
    }
}
