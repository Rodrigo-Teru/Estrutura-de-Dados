
package com.mycompany.projetopilha;

public class ProjetoPilha {
  
    public static void main(String[] args) {
        
       Stack stack = new Stack();
       stack.push(new Element("oi"));
       stack.push(new Element(45));
       stack.push(new Element(4.7));
       
       stack.flush();
    }
}
