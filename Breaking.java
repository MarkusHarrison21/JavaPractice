package com.company;

public class Breaking {
        int num1;
        public int mymethod() {
//int $num2;
//int case;//we can not use java keywords as identifiers
            int num5=0;
            int _num3=20;
// float f=1000000; error as illegal datatype as it is a long and declared as float
            int num4=(num1+num5+_num3);
            System.out.println(num1);//global variable for int without initialize it gives 0
// System.out.println($num2); if we not initialize we will get error
            System.out.println(num4);
//int 9num4; error as not a statement(illegal declaration)
//branching
            for(int k=0;k<10;k++){
                if(k==7)
                {
                    break;
                }
                else if(k==5)
                {
                    System.out.println("This is five");
                    continue;
                }
                System.out.println(k);
            }
            return 0;
        }
        public static void main(String[] args) {
            Breaking m = new Breaking();
            m.mymethod();
        }
    }
}
