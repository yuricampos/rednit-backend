package br.com.rednit.rednit.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by pedro on 10/8/15.
 */
public class JPAUtil {

    private static final EntityManagerFactory emFactory;

    static {
        try {
            emFactory = Persistence.createEntityManagerFactory("org.hibernate.events.jpa");
        }catch(Throwable ex){
            System.err.println("Cannot create EntityManagerFactory.");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager createEntityManager() {
        return emFactory.createEntityManager();
    }

    public static void close(){
        emFactory.close();
    }
}
