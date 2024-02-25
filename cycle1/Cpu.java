import java.util.Scanner;

class Cpu {
    private int price;
    
    public Cpu(int price) {
        this.price = price;
    }
    
    public void printCPUInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Processor information");
        System.out.print("Number of cores : ");
        int noOfCores = scanner.nextInt();
        System.out.print("Manufacturer : ");
        scanner.nextLine();
        String ProcessorManufacturer = scanner.nextLine();
        System.out.println("RAM information");
        System.out.print("Memory size : ");
        int size = scanner.nextInt();
        System.out.print("Manufacturer : ");
        scanner.nextLine();
        String manufacturer = scanner.nextLine();
        scanner.close();

        System.out.println("\nCPU Price: " + price);
        System.out.println("Processor and RAM information:");

        Processor processor = new Processor(noOfCores, ProcessorManufacturer); 
        RAM ram = RAM.getRAM(size, manufacturer); 
        processor.printProcessorInfo();
        ram.printRAMInfo();
    }
    
    public static class Processor {
        private int numberOfCores;
        private String manufacturer;
        
        public Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        public void printProcessorInfo() {
            System.out.println("  Number of Cores: " + numberOfCores);
            System.out.println("  Manufacturer: " + manufacturer);
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;
        
        private RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public static RAM getRAM(int memory, String manufacturer) {
            return new RAM(memory, manufacturer); // Creates and returns a new RAM object
        }
        
        public void printRAMInfo() {
            System.out.println("  RAM Memory: " + memory + " GB");
            System.out.println("  Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Display CPU specs\nDate : 13/02/2024\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the cpu : ");
        Cpu cpu = new Cpu(scanner.nextInt());
        cpu.printCPUInfo();
        scanner.close();
    }
}

// public class Cpu{
//     public static void main(String[] arg){
// 		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Display CPU specs\nDate : 13/02/2024\n");
//         class CpuClass{
//             int price;

//             public CpuClass(int price){
//                 this.price = price;
//             }

//             class Processor{
//                 int noOfCores;
//                 String manufacturer;

//                 public Processor(int noOfCores, String manufacturer){
//                     this.noOfCores = noOfCores;
//                     this.manufacturer = manufacturer;
//                 }

//                 static class Ram{
//                     int memory;
//                     String manufacturer;

//                     public Ram(int memory, String manufacturer){
//                         this.memory = memory;
//                         this.manufacturer = manufacturer;
//                     }
//                 }
//             }
//         }

//         CpuClass cpu = new CpuClass(1000);
//         CpuClass.Processor processor = cpu.new Processor(8, "Intel");
//         CpuClass.Processor.Ram ram= new CpuClass.Processor.Ram(16, "Samsung"); 

//         System.out.println("Cpu price is : " + cpu.price + "\n");
//         System.out.println("processor no.of core is : " + processor.noOfCores);
//         System.out.println("processor manufacturer is : " + processor.manufacturer + "\n");
//         System.out.println("Ram size is : " + ram.memory);
//         System.out.println("Ram manufacturer is : " + ram.manufacturer);
//     }
// }