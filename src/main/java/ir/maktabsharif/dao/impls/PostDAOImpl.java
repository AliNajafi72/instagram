package ir.maktabsharif.dao.impls;

import ir.maktabsharif.dao.interfaces.PostDAO;
import ir.maktabsharif.domain.Post;
import ir.maktabsharif.util.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PostDAOImpl implements PostDAO {
    @Override
    public Optional<Post> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public void save(Post post) {
        EntityManager entityManager = EntityManagerFactorySingleton.getEntityManagerFactoryInstance().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(post);
        entityManager.getTransaction().commit();
        entityManager.flush();
    }

    @Override
    public void update(Post post) {

    }

    @Override
    public void delete(Post post) {

    }
}