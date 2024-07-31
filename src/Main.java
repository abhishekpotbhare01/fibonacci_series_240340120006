//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


           int num1=0;
           int num2=1;


        System.out.printf(" "+num1+" "+num2);

           for(int i=0;i<8;i++){

               int temp=num1+num2;

               System.out.printf(" " + temp);

               num1=num2;
               num2=temp;

           }


    }
}