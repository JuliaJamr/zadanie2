public class ArrayRotator {

    private int size;
    private int[] tablica;

    public ArrayRotator(int[] tablica)
    {
        this.tablica = tablica;
        this.size = tablica.length;
    }

    public void rotateRight(int k)
    {
        if(tablica==null || tablica.length==0) return;

        k%=size;

        int[] pom = new int[size];

        for(int i=0;i<size;i++)
        {
            int m = i+k;
            while(m<0) m+=size;
            if(m>=size) m%=size;
            pom[m] = tablica[i];
        }

        tablica = pom;
    }

    public int getSize() {
        return size;
    }

    public int[] getTablica() {
        return tablica;
    }
}
