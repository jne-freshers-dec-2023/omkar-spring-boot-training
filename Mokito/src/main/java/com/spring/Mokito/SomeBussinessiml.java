package com.spring.Mokito;

public class SomeBussinessiml {

   private Datasource datasource;

    public SomeBussinessiml(Datasource datasource) {
        this.datasource = datasource;
    }
    
    public int maxfind(){
       int[] nubmer = datasource.maxnum();
       int max_digit=Integer.MIN_VALUE;

       for(int num :nubmer){

           if(num>max_digit){
               max_digit=num;
           }

       }
       return max_digit;
   }

}

