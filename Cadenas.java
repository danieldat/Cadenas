/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author alumnot
 */
public class Cadenas {
    ///hay que hacer una cadena char y todas las opciones con la cadena
    
  private String cadena;
  private char[] chain;
  private char[] arcade;
  private String vou="aeiou";
  
  Cadenas (String cad){
  this.arcade=new char[cad.length()+1];
  for(int i=0;i<this.arcade.length-1;i++){
  this.arcade[i]=cad.charAt(i);
  }
  this.cadena=cad;
  this.arcade[this.arcade.length-1]='\0'; 
  }
     
    
   char[] textcadena(){    
   return this.arcade;
    }
   
   public int lounge (){
   return this.arcade.length;
   }
   
   void copia (){
   for(int u =0;u<this.arcade.length;u++){
   this.chain[u]=this.arcade[u];  
   }  
  
   }
   
   
   boolean compruebacadena(String loco){
       
   for (int z=0;z< loco.length();z++){
   if(this.arcade[z]!=loco.charAt(z)){
   return false;
   }
   
   }
       return true;
   
   }
   
   
   
   
   
   public String [] esvocal(){
   String[] esvocal=new String[this.arcade.length];
   for(int y=0;y<this.arcade.length;y++){
   if(arcade[y]==vou.charAt(0) | arcade[y]==vou.charAt(1) |arcade[y]==vou.charAt(2) |arcade[y]==vou.charAt(3) |arcade[y]==vou.charAt(4) ){
   esvocal[y]="es vocal";}
   else{esvocal[y]=" es consonante";}
   
   }
   return esvocal;
   }
   
    public String[] mayuscula (){
   String [] may=new String[this.arcade.length];
   for(int i=0;i<this.arcade.length;i++){
   may[i]=String.valueOf(this.arcade[i]);
   may[i]=may[i].toUpperCase();
   }
   return may;
 
     
    }
   
    
    public char[] killer (){
     char[] kill=new char[this.arcade.length];
   for(int y=0;y<this.arcade.length;y++){
   if(this.arcade[y]==vou.charAt(0) | this.arcade[y]==vou.charAt(1) |this.arcade[y]==vou.charAt(2) |this.arcade[y]==vou.charAt(3) |this.arcade[y]==vou.charAt(4) ){
    kill[y]=' '; }
   else{kill[y]=this.arcade[y];}
    }  
   return kill;
    }
    
    
    String paquidermo(){
    char [] elefante=new char[this.arcade.length];
    int u=this.arcade.length-2;
    String be=" Es paquidermo!!!";
    
   for(int i=0;i<this.arcade.length-1;i++){
   elefante[i]=this.arcade[u];u--;
   
   }
   elefante[this.arcade.length-1]=this.arcade[this.arcade.length-1];
   for(int g=0;g<this.arcade.length;g++){
   if(this.arcade[g]!=elefante[g]){
   be="No es paquidermo!!";  
   }
   }
    return be;
    }
   
}
