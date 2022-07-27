package com.vanish.courseapp.persistence;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.vanish.courseapp.entities.Course;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.*;

@Repository
public class CourseRepositoryImpl implements CourseRepository{

    protected EntityManagerFactory emf;

    public CourseRepositoryImpl() {
        this.emf = Persistence.createEntityManagerFactory("Course_Details");
    }

    @Override
    public Course findById(int id) {
       EntityManager em= this.emf.createEntityManager();
       Course c = em.find(Course.class,id);
       em.close();
       return c;

    }

    @Override
    public List<Course> findAll() {
        EntityManager em= this.emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Course e");
        return (List<Course>)query.getResultList();
    }

    @Override
    public void deleteById(int id) {
        EntityManager em= this.emf.createEntityManager();
        em.getTransaction().begin();
        Course c = em.find(Course.class,id);
        em.remove(c);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Course save(Course course) {
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        Course c = new Course();
        c.setId(course.getId());
        c.setTitle(course.getTitle());
        c.setDescription(course.getDescription());
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        return c;

    }

    @Override
    public Course update(Course course){
        EntityManager em = this.emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Course c = em.find(Course.class,course.getId());
            c.setTitle(course.getTitle());
            c.setDescription(course.getDescription());
            em.persist(c);
            em.getTransaction().commit();
            em.close();
            return c;
        } catch (Exception e) {
            em.close();
            return null;
        }
    }
}
