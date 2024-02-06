ssor processor = cpu.new Processor(8, "Intel");
        cpu.Processor.Ram ram= processor.new Ram(16, "Samsung"); 

        System.out.println("Cpu price is : " + cpu.price + "\n");
        System.out.println("processor no.of core is : " + processor.noOfCores);
        System.out.println("processor manufacturer is : " + processor.manufacturer + "\n");
        System.out.println("Ram size is : " + ram.memory);
        System.out.pr