package PracticeForEach;

public class Java04 {
    public static void printNames() {
        String[] nameList = {"Aさん", "Bさん", "Cさん", "Dさん", "Eさん", "Fさん", "Gさん", "Hさん", "Iさん", "Jさん"};
        
        for (String name : nameList) {
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
        printNames();
    }
}


