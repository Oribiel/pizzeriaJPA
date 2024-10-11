/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizzeriajpa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.Ingrediente;
import persistencia.Producto;
import persistencia.TipoIngrediente;
/**
 *
 * @author oribi
 */
public class PizzeriaJPA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_pizzeria");
        EntityManager em = emf.createEntityManager();
        //Producto pizza = em.find(Producto.class, 1L);
        //TipoIngrediente tipo= new TipoIngrediente();
        //List<Ingrediente> ingredientes = new ArrayList();
        Producto pizza = em.find(Producto.class, 1L);
        Ingrediente i1= em.find(Ingrediente.class, 1L);    
        //ingredientes.add(new Ingrediente("Salami", 10, tipo));
        //ingredientes.add(new Ingrediente("Queso mozzarella", 50, tipo));
        
        //tipo.setIngredientes(ingredientes);
        
        em.getTransaction().begin();
        em.persist(em);
        em.getTransaction().commit();
        System.out.println("Op finish");
        /*
        if(pizza != null){
        em.getTransaction().begin();
       // Producto pizzaPepperoni = new Producto((float) 99.9, "Pizza de anchoas","Pizza mala");
        //em.persist(pizzaPepperoni);
        //em.getTransaction().commit();
        
        em.remove(new Producto(1L)); // 1L es el ID se pone L porque es un Long
        em.getTransaction().commit();
        System.out.println("Pizza eliminada");
        }else{
            System.out.println("Noe existe");

        }
*/
        
        
    }
}
