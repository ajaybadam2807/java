class EnumDemo{
 public enum Season
 {SUMMER,WINTER,SPRING,FALL}
 public enum Weak
 {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
 public static void main(String args[]){
     System.out.println("the values of season are ");
     for(Season s:Season.values())
     System.out.println(s);
 }
}
