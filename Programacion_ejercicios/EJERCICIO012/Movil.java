public class Movil {
        private String name;
        private Byte memoryRam;


        public Movil (String name, Byte memoryRam){
            this.name = name;
            this.memoryRam = memoryRam;

        }
        public String getName() {
            return this.name;
        }

        public Byte getMemoryRam() {
            return this.memoryRam;
        }

        @Override
        public String toString(){
            return this.name + " " + this.memoryRam;
        }

    }
