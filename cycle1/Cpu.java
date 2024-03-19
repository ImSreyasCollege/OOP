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
            System.out.println("  RAM Size: " + memory + " GB");
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
