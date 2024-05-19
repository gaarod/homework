package subtask3;

public class Computer {

    private Processor processor;
    private RAM ram;

    public Computer( String processorModel, int ramSize) {
        this.processor = new Processor(processorModel);
        this.ram = new RAM(ramSize);
    }

    public String getDetails() {
        return  processor.getDetails() + ", " + ram.getDetails();
    }

    public static class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return "Processor: " + model;
        }
    }

    public class RAM {
        private int size;

        public RAM(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "RAM: " + size + "GB";
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer( "ryzen 5", 32);
        System.out.println(computer.getDetails());
    }
}
