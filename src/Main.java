public class Main {
    public static void main(String[] args) {

        MemoryTaskRepository mtr = new MemoryTaskRepository();

        TaskManager tm = new TaskManager(mtr);

        tm.addTask("Ler um livro");
        tm.addTask("Chorar");
        tm.removeTask("Chorar");
        tm.getAllTask();




    }
}