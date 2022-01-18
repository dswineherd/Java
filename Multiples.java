public class Multiples {
  public static int solution(int number) {

  int sum = 0;
  int three = 3;
  int five = 5;
  int multiple = 1;
 
  while(three*multiple < number){
    sum = sum + (three*multiple);
    multiple++;}

  multiple = 1;
    
  while (three*multiple < number){
    if((three*multiple)%five !=0){
      sum = sum + (three*multiple);}
       
     multiple++;}
      return sum;}
}
