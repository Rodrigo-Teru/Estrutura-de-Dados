
package com.mycompany.projetopilha;

public class Stack {
    
    private Element topo;
    
    public Stack(){
        topo = null;
    }
    
    public boolean isEmpty(){
        return topo == null;
    }
    
    public void push(Element e) {
        e.setLink(topo);
        topo = e;
    }
    
    public Element pop(){
        if (topo ==null){
            System.out.println("Pilha vazia!");
            return null;
        }
        
        Element aux = topo;
        topo = topo.link;
        aux.link = null;
        return aux;
    }
    
    public void flush(){    
        Element e;
        while(!isEmpty()){
            e = pop();
            System.out.println(e);
        }
    
    }
            
}
