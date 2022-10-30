package OOP.InheritanceExercise;

public class IPhoneDemo {
    public static void main(String[] args) {
        IPhone11 i11 = new IPhone11();
        System.out.println("IPhone 11 processor model is " + i11.processorModel);

        IPhone12 i12 = new IPhone12();
        System.out.println("IPhone 12 processor model is " + i12.processorModel + ". It features " + i12.ramSize + "GB of RAM. ");

        IPhone12ProMax i12pm = new IPhone12ProMax();
        System.out.println("IPhone 12 Pro Max has " + i12pm.ram +
                "GB of RAM and increased display size of " + i12pm.displaySize +
                " inches. It also has " + i12pm.cameraLensesCount + " camera lenses instead of 2 in IPhone 12.");
    }
}
