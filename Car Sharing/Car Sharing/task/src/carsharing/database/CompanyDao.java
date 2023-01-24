package carsharing.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompanyDao implements Dao<Company> {

    private final String nameOfTable;
    private final Connection databaseConnection;

    public CompanyDao(String nameOfTable, Connection databaseConnection) {
        this.nameOfTable = nameOfTable;
        this.databaseConnection = databaseConnection;
        String sqlCreateCompanyTable = "CREATE TABLE IF NOT EXISTS " + nameOfTable + " " +
                "(ID INTEGER NOT NULL AUTO_INCREMENT," +
                "NAME VARCHAR(255) UNIQUE NOT NULL," +
                "PRIMARY KEY ( ID ))";
        try {
            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlCreateCompanyTable);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Optional<Company> get(int id) {
        Company searchedCompany = null;
        try {
            Statement sqlStatement = databaseConnection.createStatement();
            String sqlQuery = String.format("SELECT * FROM %s WHERE ID=S%", nameOfTable, id);
            ResultSet resultSet = sqlStatement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                searchedCompany = new Company(resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return Optional.ofNullable(searchedCompany);
    }

    @Override
    public List<Company> getAll() {
        List<Company> listOfCompanies = new ArrayList<>();
        try {
            Statement sqlStatement = databaseConnection.createStatement();
            String sqlQuery = String.format("SELECT * FROM %s", nameOfTable);
            ResultSet resultSet = sqlStatement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                listOfCompanies.add(new Company(resultSet.getInt("id"),
                        resultSet.getString("name")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listOfCompanies;
    }

    @Override
    public void save(Company company) {
        try {
            Statement sqlStatement = databaseConnection.createStatement();
            String sqlQuery = String.format("INSERT INTO %s (name) VALUES (\'%s\')", nameOfTable, company.getName());
            sqlStatement.execute(sqlQuery);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Company company, String[] params) {

    }

    @Override
    public void delete(Company company) {

    }

    @Override
    public void eraseById(Integer id) {

    }

    @Override
    public void eraseByName(String name) {
        try {
            Statement sqlStatement = databaseConnection.createStatement();
            String sqlQuery = String.format("DELETE FROM %s WHERE name='%s'", nameOfTable, name);
            sqlStatement.execute(sqlQuery);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
