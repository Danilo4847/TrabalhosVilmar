package pilhaEncadeada; 

 

public class Executavel { 

 

public static void main(String[] args) { 
	
	
	
PilhaEncadeada pilha=new PilhaEncadeada(); 


pilha.empilha("Jorge"); 
pilha.empilha("Maria"); 
pilha.empilha("Lucas"); 
pilha.empilha("Luciano");
pilha.empilha("5");

System.out.println(pilha); 
System.out.println();

pilha.topo(); 
System.out.println();


System.out.println(pilha);
System.out.println();

System.out.println(pilha.topo());
System.out.println();


pilha.desempilha(); 

System.out.println(pilha); 

} 

 

} 
