import java.util.Scanner;
public class CricketPlayer {
    String name;
    int no_of_innings,no_times_notout,total_runs;
    float bat_avg;
    static float avg(CricketPlayer p){
        int outs=p.no_of_innings - p. no_times_notout;
        if(outs==0){
            return p.total_runs;
        }else{
            return (float)p.total_runs/outs;
        }
    }
    static void sortPlayer(CricketPlayer p[],int n){
        CricketPlayer temp;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(p[i].bat_avg>p[j].bat_avg){
                    temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
    }
    void display(){
        System.out.println(name+"\t"+no_of_innings+"\t"+no_times_notout+"\t"+total_runs+"\t"+bat_avg);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of Players: ");
        int n=sc.nextInt();
        CricketPlayer p[]=new CricketPlayer[n];
        for(int i=0;i<n;i++){
            p[i]=new CricketPlayer();
            System.out.println("Enter name: ");
            p[i].name=sc.next();
            System.out.println("Enter no of Innings: ");
            p[i].no_of_innings=sc.nextInt();
            System.out.println("Enter times notout: ");
            p[i].no_times_notout=sc.nextInt();
            System.out.println("Enter Total runs: ");
            p[i].total_runs=sc.nextInt();
            p[i].bat_avg=avg(p[i]);
        }
        sortPlayer(p,n);{
            System.out.println("\nName\tInnings\tNot Out\tRuns\tAverage");
            for(int i=0;i<n;i++)
            {
                p[i].display();
            }
            sc.close();
        }
    }
}
