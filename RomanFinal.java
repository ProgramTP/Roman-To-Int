public class RomanFinal{
    
  public static void main (String [] args) {
    
    char n1[] = {'I', 'I'}; //2
    char n2[] = {'I', 'X'}; //9
    char n3[] = {'V', 'I', 'I'}; //7
    char n4[] = {'C', 'X', 'I', 'I', 'I'}; //113
    char n5[] = {'L', 'I', 'V'}; //54
    char n6[] = {'X', 'X', 'X', 'V', 'I', 'I', 'I'}; //38
    char n7[] = {'X', 'C', 'I', 'X'}; //99
    char n8[] = {'D', 'C', 'L', 'X', 'X', 'V', 'I', 'I', 'I'}; //678
    
    char[][] list = {n1, n2, n3, n4, n5, n6, n7, n8};
    
    int sum = 0;
    
    for (int i = 0; i < list.length; i++) {
      sum = 0;
      for (int x = 0; x < list[i].length; x++) {        
        if (list[i][x] == 'I') {  
          if (x <= list[i].length - 2) {       
            if (list[i][x+1] == 'V' || list[i][x+1] == 'X') {
              sum -= 1;
            }
            else {
              sum += 1;
            }
          }
          else {
            sum += 1;
          }
        }
        else if (list[i][x] == 'V') {
          sum += 5;
        }
        else if (list[i][x] == 'X') {         
          if (x <= list[i].length - 2) {  
            if (list[i][x+1] == 'L' || list[i][x+1] == 'C') {
              sum -= 10;
            }
            else {
              sum += 10;
            }
          }
          else {
            sum += 10;
          }
        }
        else if (list[i][x] == 'L') {
          sum += 50;
        }
        else if (list[i][x] == 'C') {          
          if (x <= list[i].length - 2) {            
            if (list[i][x+1] == 'D' || list[i][x+1] == 'M') {
              sum -= 100;
            }
            else {
              sum += 100;
            }
          }
          else {
            sum += 100;
          }
        }
        else if (list[i][x] == 'D') {
          sum += 500;
        }
        else if (list[i][x] == 'M') {
          sum += 1000;
        } 
      }
      System.out.println(sum);
    }
  }
}