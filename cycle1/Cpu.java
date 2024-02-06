// Sreyas - 53
import java.util.Scanner;

public class Cpu{
    public static void main(String[] arg){
        class CpuClass{
            int price;

            public CpuClass(int price){
                this.price = price;
            }

            class Processor{
                int noOfCores;
                String manufacturer;

                public Processor(int noOfCores, String manufacturer){
                    this.noOfCores = noOfCores;
                    this.manufacturer = manufacturer;
                }

                static class Ram{
                    int memory;
                    String manufacturer;

                    public Ram(int memory, String manufacturer){
                        this.memory = memory;
                        this.manufacturer = manufacturer;
                    }
                }
            }
        }

        CpuClass cpu = new CpuClass(1000);
        CpuClass.Processor processor = cpu.new Processor(8, "Intel");
        CpuClass.Processor.Ram ram= new CpuClass.Processor.Ram(16, "Samsung"); 

        System.out.println("Cpu price is : " + cpu.price + "\n");
        System.out.println("processor no.of core is : " + processor.noOfCores);
        System.out.println("processor manufacturer is : " + processor.manufacturer + "\n");
        System.out.println("Ram size is : " + ram.memory);
        System.out.println("Ram manufacturer is : " + ram.manufacturer);
    }
}