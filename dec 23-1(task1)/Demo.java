package com.shanthi;
import java.util.*;
public class Demo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Task> t=new ArrayList<Task>();
        while(true)
        {
            System.out.println("select one");
            System.out.println("1.add elements");
            System.out.println("2.list elements");
            System.out.println("3.search element ");
            System.out.println("4. delete");
            System.out.println("5.exit");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("name");
                    String name=sc.next();
                    System.out.println("description");
                    String description=sc.nextLine();
                    System.out.println("duedate");
                    String due=sc.next();
                    t.add(new Task(name, description, due));
                    break;
                case 2:
                    for(Task object :t)
                    {
                        System.out.println(object.name);
                        System.out.println(object.description);
                        System.out.println(object.due);
                        break;
                    }
                case 3:
                    String str1 = sc.nextLine();
                    for(Task object:t)
                        if (str1.equals(object.name))
                        {
                            System.out.println(object.name);
                            System.out.println(object.description);
                            System.out.println(object.due);
                        }

                        break;

                case 4:
              int b=sc.nextInt();
              t.remove(b);
                    
                case 5:
                   System.exit(0);


            }
        }

    }

}
