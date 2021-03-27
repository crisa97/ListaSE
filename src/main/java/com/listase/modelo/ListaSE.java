/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listase.modelo;

import java.io.Serializable;

/**
 *
 * @author crisa97
 */
public class ListaSE implements Serializable{
    private Nodo cabeza;
    private Object codigo;
    
    public ListaSE() {
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public void adicionarNodo(Nodo nodo)
    {
        if(cabeza ==null)
        {
            cabeza = new Nodo(nodo);
        }
        else
        {
           
            Nodo temp= cabeza;
            while(temp.getSiguiente()!=null) 
            {
                temp= temp.getSiguiente();
            }
            
            temp.setSiguiente(new Nodo(nodo));
        }
         
    }
    public void adicionarNodoAlInicio(Nodo nodo)
    {
        if(cabeza ==null)
        {
            cabeza = new Nodo(nodo);
        }
        else
        {
            Nodo temp= new Nodo(nodo);
            temp.setSiguiente(cabeza);
            cabeza= temp;
        }
    }
    public short contarNodos()
    {
        if(cabeza ==null)
        {
            return 0;
        }
        else
        {
           
            Nodo temp= cabeza;
            short cont=1;
            while(temp.getSiguiente()!=null)
            {
                temp=temp.getSiguiente();
                cont++;
            }
            return cont;
        }
    }
    
    
    public void invertirLista()
    {
        if(cabeza!=null)
        {
            
            ListaSE listaTemporal = new ListaSE();
           
            Nodo temp= cabeza;
            
            while(temp!=null)
            {         
               
                
                listaTemporal.adicionarNodoAlInicio((Nodo) temp.getDato());
                temp=temp.getSiguiente();                
            }   
            cabeza= listaTemporal.getCabeza();
        }
    }
    public void eliminarNodo(Nodo nodo ) 
    {
        if(cabeza !=null)
        {
            if(cabeza.getDato() == nodo)
            {
                cabeza=cabeza.getSiguiente();
                return;
            }
            else
            {
                Nodo temp=cabeza;
                while(temp.getSiguiente()!=null)
                {
                    if(temp.getSiguiente().getDato()== nodo)
                    {
                        
                        temp.setSiguiente(temp.getSiguiente().getSiguiente());
                        return;
                    }
                    temp = temp.getSiguiente();
                }
                
                
            }
        }
      
    }
    
    
}
