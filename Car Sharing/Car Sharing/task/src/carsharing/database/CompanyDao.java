package carsharing.database;

import java.util.List;
import java.util.Optional;

public class CompanyDao implements Dao<Company> {
    @Override
    public Optional<Company> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<Company> getAll() {
        return null;
    }

    @Override
    public void save(Company company) {

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

    }
}
