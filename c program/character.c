#include<stdio.h>
#include<math.h>
  
  int main(){

     char ch[] = {'A','B','C','D','E'} ;

     for (int i = 0; i < 5; i++){

          if ( ch[0] > ch[1] && ch[0] > ch[2] && ch[0] > ch[3] && ch[0] > ch[4] && ch[0] > ch[5]){
               printf("character ch is greater! = %d",ch[i]);
          }
          if(ch[1] > ch[0] && ch[1] > ch[2] && ch[1] > ch[3] && ch[1] > ch[4] && ch[1] > ch[5]){
               printf("");
          }

          
     }




     return 0 ;
  }