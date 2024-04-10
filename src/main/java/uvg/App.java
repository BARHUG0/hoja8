package uvg;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        Scanner scanner = new Scanner(System.in);
        UVGPriorityQueue<Patient> priorityQueue = null;
        System.out.println("Bienvenido al Sistema de Atención de Emergencias UVG");
        System.out.println("Seleccionar la implementación de Priority Queue a utilizar:");
        System.out.println("1. Vector Heap \n 2. Java Collection Framework");

        
        String option = scanner.nextLine();

        PriorityQueueFactory<Patient> factory = new PriorityQueueFactory<Patient>();
        switch (option) {
            
            case "1":
                priorityQueue = factory.create("mine");
                break;

            case "2":
                priorityQueue = factory.create("java");
                break;
        
            default:
                break;
        }

        boolean program = true;
        while(program){
            System.out.println("Modo de ejecución:");
            System.out.println("1. Test \n 2. Usuario \n 3. Salir");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    testMenu(scanner, priorityQueue);
                    break;
        

                case "2":
                    userMenu(scanner, priorityQueue);
                    break;

                case "3":
                    program = false;
                    break;
                default:
                    break;
            }

        }

    }

    public static void testMenu(Scanner scanner, UVGPriorityQueue<Patient> priorityQueue) throws FileNotFoundException, IOException{
        boolean menu = true;
        FileManager fileManager = new FileManager();
        String txt = fileManager.readTXTFile("patientsTest.txt");
        ArrayList<Patient> arrayList = Tokenizer.getAssociations(txt);
        priorityQueue.clear();
        for(int i = 0; i <= arrayList.size() - 1; i++){
            priorityQueue.addValue(arrayList.get(i));
        }

        while(menu){
            System.out.println("Ingrese la opción a ejecutar");
            System.out.println("1. Mostrar la prioridad de pacientes \n 2. Salir");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    while(!priorityQueue.isEmpty()){
                        System.out.println(priorityQueue.remove().toString());
                    }
                    for(int i = 0; i < arrayList.size() - 1; i++){
                        priorityQueue.addValue(arrayList.get(i));
                    }
                    break;

                case "2":
                    menu = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static void userMenu(Scanner scanner, UVGPriorityQueue<Patient> priorityQueue) throws FileNotFoundException, IOException {
        System.out.println("Ingrese el nombre del archivo: ");
        String fileName = scanner.nextLine();
        FileManager fileManager = new FileManager();
        String txt = fileManager.readTXTFile(fileName);
        ArrayList<Patient> arrayList = Tokenizer.getAssociations(txt);
        priorityQueue.clear();
        for(int i = 0; i < arrayList.size() - 1; i++){
            priorityQueue.addValue(arrayList.get(i));
        }


        boolean menu = true;
        while(menu){
            System.out.println("Ingrese la opción a ejecutar");
            System.out.println("1. Mostrar la prioridad de pacientes \n 2. Salir");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    while(!priorityQueue.isEmpty()){
                        System.out.println(priorityQueue.remove().toString());
                    }
                    for(int i = 0; i < arrayList.size() - 1; i++){
                        priorityQueue.addValue(arrayList.get(i));
                    }
                    break;

                case "2":
                    menu = false;
                    break;

                default:
                    break;
            }
        }
        

    }
}
