package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.tuple.entity.EntityTuplizerFactory;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario( 0, "felipe", "felipe@gmail.com");

	
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		System.out.println("O id gerado foi:" + novoUsuario.getId());

		em.close();
		emf.close();

	}

}
