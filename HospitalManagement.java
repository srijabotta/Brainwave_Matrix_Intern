import java.util.Scanner;
public class HospitalManagement{
    public static void Patient(){
            Scanner sc=new Scanner(System.in);
                System.out.println("enter patientname:");
                String patientName=sc.nextLine();
                System.out.println("entr patientid:");
                int patientId=sc.nextInt();
                System.out.println("enter gender:");
                String gender=sc.next();
                System.out.println("enter phno:");
                int phno=sc.nextInt();
                System.out.println(patientName+" pid-"+patientId+" gender-"+gender+" phno-"+phno+"is registered");
        }
        public static void schedule(int patientId,String date){
            System.out.println("patientid-"+patientId+" is appointed on "+date);
        }
        public static void records(int patientId){
            System.out.println("yes,patientid-"+patientId+" is eligible for insurance");
        }
        public static void bill(int patientId,float bill){
            System.out.println(patientId+"-$ "+bill);
        }
        public static void main(String[] args){
             Scanner sc=new Scanner(System.in);
            int choice=0;
            System.out.println("-----welcome to hospital management system-----");
            System.out.println("1.registration\n"+"2.appointment\n"+"3.ehr\n"+"4.billing\n"+"5.exit\n");
            while(choice!=5){
            System.out.println("enter choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    Patient();
                    break;
               case 2:
                    String date = null;
                    System.out.println("enter date of appointment:");
                    date=sc.next();
                    System.out.println("entr patientid:");
                    int patientId=sc.nextInt();
                    schedule(patientId,date);
                    break;
              case 3:
                    System.out.println("entr patientid:");
                    int pid=sc.nextInt();
                        records(pid);
                    break;
              case 4:
                    float bill = 0;
                    System.out.println("enter bill amount:");
                    bill=sc.nextFloat();
                    System.out.println("entr pid:");
                    int pID=sc.nextInt();
                    bill(pID,bill);
                    break;
              case 5:
                    System.exit(0);
                    break;
              default:
                    break;
            }
        }
    }
}
