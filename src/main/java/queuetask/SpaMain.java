package queuetask;

import queuetask.SpaQueue;

import javax.naming.Name;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class SpaMain {
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    static PriorityQueue<Double> apointmentTimeHolder;

    public static void main(String[] args) {
        SpaQueue appone = new SpaQueue("Deborah", "Nails", 7.32);
        SpaQueue apptwo = new SpaQueue("Michael", "Hair", 9.02);
        SpaQueue appthree = new SpaQueue("Angel", "Feet", 6.11);
        SpaQueue appfour = new SpaQueue("Daniel", "Make-up", 13.35);

        apointmentTimeHolder = new PriorityQueue<>();
        apointmentTimeHolder.add(appone.getAppointmentTime());
        apointmentTimeHolder.add(apptwo.getAppointmentTime());
        apointmentTimeHolder.add(appthree.getAppointmentTime());
        apointmentTimeHolder.add(appfour.getAppointmentTime());
        String cnt = "y";
        while (cnt.equalsIgnoreCase("y")) {
            System.out.println("Enter Option");
            System.out.println("***** 1.  Book An Appointment  *****");
            System.out.println("***** 2.  Check Booked Spots  *****");
            System.out.println("***** 3.  Cancel An Appointment  *****");
            System.out.println("***** 4.  Check Who's Next In The Queue  *****");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    book();
                    break;
                case 2:
                    check();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    next();
                    break;
                }
            System.out.println("You want to continue y/n");
            cnt=scan.next();
        }
    }

    static void book() {
        System.out.println("Enter Name");
        String name = scan.next();
        System.out.println("Enter Service");
        String Service = scan.next();
        System.out.println("Enter Time");
        double bookTime = scan.nextDouble();
        if (!apointmentTimeHolder.contains(bookTime)) {
                SpaQueue appoint = new SpaQueue(name,Service,bookTime);
                apointmentTimeHolder.add(appoint.getAppointmentTime());
                System.out.println("Successfully Booked");
                System.out.println(appoint);
            }else{
                System.out.println("That time has already been booked");
                System.out.println(apointmentTimeHolder);
            }
    }
    static void check() {
        for (double time : apointmentTimeHolder) {
            System.out.println(time);
        }
    }
    static void cancel(){
        System.out.println("Enter Your AppointTiment");
        double bookTime = scan.nextDouble();
            if(!apointmentTimeHolder.contains(bookTime)){
            System.out.println("No such Appointment Has Been Booked");
        }else{
            System.out.println(apointmentTimeHolder.remove(bookTime));
            System.out.println(bookTime);

        }
    }
    static void next(){
        String cnt = "y";
        while (cnt.equalsIgnoreCase("y")) {
            System.out.println(apointmentTimeHolder.poll());
            System.out.println("Check For Next Appointment");
            cnt = scan.next();
        }
    }
}


//apointmentTimeHolder.peek();
//        System.out.println("An Appointment Has Already Booked Since"+ " " +apointmentTimeHolder.peek());
