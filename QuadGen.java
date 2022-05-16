

public class QuadGen {
    private String operation ,source, destination;

        public QuadGen(Object operation, Object source, Object destination) {
            super();
            this.operation = "" + operation + "     |";
            this.source = "" + source + "     |";
            this.destination = "" + destination + "     |";

            this.operation = this.operation.toString().replace("null","");
            this.source = this.source.toString().replace("null","");
            this.destination = this.destination.toString().replace("null","");
        }

        public String getoperation() {
            return operation;
        }

        public void setoperation(String operation) {
            this.operation = operation;
        }

        public String getsource() {
            return source;
        }

        public void setsource(String source) {
            this.source = source;
        }

        public String getdestination() {
            return destination;
        }

        public void setdestination(String destination) {
            this.destination = destination;
        }

        @Override
        public String toString() {
            StringBuilder output = new StringBuilder();

            if(operation != null){
                output.append(operation);
            }
            if(source != null){
                output.append(" " + source);
            }
            if(destination != null){
                output.append(" " + destination);
            }

            return output.toString();
        }

}
