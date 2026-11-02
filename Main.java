public class Main {

    public static void main(String[] args)
    {
        ArrayRotator tablica = new ArrayRotator(new int[] {1,2,3,4,5,6});
        tablica.rotateRight(7);
        for(int i = 0; i < tablica.getSize(); i++)
        {
            System.out.print(tablica.getTablica()[i] + " ");
        }
    }
}
