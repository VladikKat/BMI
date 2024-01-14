//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class Main {
            public static void main(String[] args) {
                BmiService service = new BmiService();
                int weightinkg = 98;
                double heigtinmeters = 1.87;
                int index = service.calculate; // должно получиться 500
                System.out.println(index);
            }
        }