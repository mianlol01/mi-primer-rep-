package com.example.app;

import java.util.List;

import com.example.model.Tipo;
import com.example.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo01 {
	public static void main(String[] args) {

		EntityManagerFactory conexion = Persistence.createEntityManagerFactory("hey");
		EntityManager em = conexion.createEntityManager();
		System.out.println("hola");
		List<Tipo> lstTipo = em.createNativeQuery("select * from tb_tipos", Tipo.class).getResultList();
		
		//List<Tipo> lstTipo2 = em.createQuery("select u from Tipo u").getResultList();
		
		for (Tipo t : lstTipo) {
			System.out.println("----Tipo de Usuario");
			System.out.println("-------------");
			System.out.println("tamaño "+t.getLstUsuarios().size());
			for (Usuario u : t.getLstUsuarios()) {
				System.out.println(u.getNom_usua());
				
			}
			
		}
		
		
	}
}
